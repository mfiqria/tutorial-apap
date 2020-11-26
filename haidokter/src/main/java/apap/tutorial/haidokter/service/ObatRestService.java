package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ObatRestService {
    ObatModel createObat(ObatModel obat);

    List<ObatModel> retrieveListObat();

    ObatModel getObatByIdObat(Long id);

    ObatModel changeObat(Long id, ObatModel obat);

    void deleteObat(Long id);
}
