package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;

import java.util.Optional;

public interface ObatService {
    void addObat(ObatModel obat);

    Optional<ObatModel> getObatById(Long idObat);

    ObatModel changeObat(ObatModel obat);

    void deleteObatById(Long idObat);
}