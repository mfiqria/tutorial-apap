package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;

import java.util.List;

public interface ObatService {
    void addObat(ObatModel obat);

    //  Method untuk mendapatkan data sebuah obat berdasarkan id obat
    ObatModel getObatByIdObat(Long id);

    //  Method untuk update obat
    ObatModel updateObat(ObatModel obatModel);

    //  Method delete obat
    ObatModel deleteObat(ObatModel obatModel);
}
