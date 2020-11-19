package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.repository.ObatDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.transaction.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
public class ObatRestServiceImpl implements ObatRestService {
    private final WebClient webClient;

    @Autowired
    private ObatDb obatDb;

    @Override
    public ObatModel createObat(ObatModel obat){
        return obatDb.save(obat);
    }

    @Override
    public List<ObatModel> retrieveListObat() {
        return obatDb.findAll();
    }

    @Override
    public ObatModel getObatByIdObat(Long id){
        Optional<ObatModel> obat = obatDb.findObatModelById(id);
        if (obat.isPresent()){
            return obat.get();
        }
        else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public ObatModel changeObat(Long id, ObatModel obatUpdate) {
        ObatModel obat = getObatByIdObat(id);
        obat.setNama(obatUpdate.getNama());
        obat.setBentuk(obatUpdate.getBentuk());
        obat.setKuantitas(obatUpdate.getKuantitas());
        return obatDb.save(obat);
    }

    @Override
    public void deleteObat(Long id){
        ObatModel obat = getObatByIdObat(id);
        obatDb.delete(obat);
    }

    public ObatRestServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    @Override
    public Mono<String> getHospitalByState(String state) {
        return this.webClient.get().uri("http://www.communitybenefitinsight.org/api/get_hospitals.php?state=" + state)
                .retrieve()
                .bodyToMono(String.class);
    }
}
