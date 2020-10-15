package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ResepModel;
import java.util.List;

public interface ResepService {
    //  Method untuk menambah Resep
    void addResep (ResepModel resep);

    //  Method untuk mendapatkan semua data Resep yang telah tersimpan
    List<ResepModel> getResepList();

    //  Method untuk mendapatkan data sebuah resep berdasarkan nomor resep
    ResepModel getResepByNomorResep(Long noResep);

    //  Method untuk update resep
    ResepModel updateResep(ResepModel resepModel);

    //===========Latihan=========

    //     Method untuk update catatan
    ResepModel updateCatatanResep(ResepModel noResep, String catatan);

    //     Method untuk delete resep
    ResepModel deleteResep(ResepModel noResep);

    //  Method reverse
    List<ResepModel> getResepListReverse();
}
