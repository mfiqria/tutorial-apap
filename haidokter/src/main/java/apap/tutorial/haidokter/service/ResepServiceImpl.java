package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.repository.ResepDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResepServiceImpl implements ResepService{
    @Autowired
    ResepDb resepDb;

    @Override
    public void addResep(ResepModel resep){
        resepDb.save(resep);
    }

    @Override
    public List<ResepModel> getResepList() {return resepDb.findAll();}

    @Override
    public ResepModel getResepByNomorResep(Long noResep){
        return resepDb.findByNoResep(noResep).get();
    }

    @Override
    public ResepModel updateResep(ResepModel resep){
        resepDb.save(resep);
        return resep;
    }

    @Override
    public ResepModel deleteResep(ResepModel resep){
        if(resep.getListObat().size() == 0){
            resepDb.delete(resep);
            return resep;
        }
        else{
            return null;
        }
    }

    @Override
    public ResepModel updateCatatanResep(ResepModel resep, String catatan) {
        resep.setCatatan(catatan);
        return resep;
    }

    @Override
    public List<ResepModel> getResepListReverse() {
        return resepDb.findAll(Sort.by(Sort.Direction.DESC, "noResep"));
    }
}
