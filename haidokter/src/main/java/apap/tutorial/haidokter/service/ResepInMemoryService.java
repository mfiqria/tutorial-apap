package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ResepModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResepInMemoryService implements ResepService {
    private List<ResepModel> listResep;

    @Override
    public void addResep(ResepModel resep) {

        listResep.add(resep);
    }

    @Override
    public List<ResepModel> getResepList(){
        return listResep;
    }

    @Override
    public List<ResepModel> getResepListReverse(){
        return listResep;
    }

    @Override
    public ResepModel getResepByNomorResep(Long noResep){
        ResepModel resep = new ResepModel();
        for (ResepModel s : listResep){
            if(s.getNoResep().equals(noResep)){
                return s;
            }
        }
        return null;
    }

    @Override
    public ResepModel updateResep(ResepModel resepModel){
        return null;
    }

    //    ==========LATIHAN=========


    @Override
    public ResepModel updateCatatanResep(ResepModel resep, String catatan) {
        resep.setCatatan(catatan);
        return resep;
    }

    @Override
    public ResepModel deleteResep(ResepModel resep) {
        listResep.remove(resep);
        return resep;
    }

}