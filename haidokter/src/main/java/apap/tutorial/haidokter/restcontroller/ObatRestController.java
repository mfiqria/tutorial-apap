package apap.tutorial.haidokter.restcontroller;

import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.service.ObatRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
public class ObatRestController {
    @Autowired
    private ObatRestService obatRestService;

    @PostMapping(value = "/obat")
    private ResponseEntity<String> createObat(@Valid @RequestBody ObatModel obat, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Request body has invalid type or missing field"
            );
        }
        else {
            obatRestService.createObat(obat);
            return ResponseEntity.ok("Add Obat success");
        }
    }

    @DeleteMapping(value = "/obat/{id}")
    private ResponseEntity<String> deleteObat(@PathVariable("id") Long id) {
        try {
            obatRestService.deleteObat(id);
            return ResponseEntity.ok("Obat has been deleted!");
        } catch (NoSuchElementException e){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Obat with ID " + String.valueOf(id) + " not found!"
            );
        }
    }

    @GetMapping(value = "/obat/{id}")
    private ObatModel retrieveObat(@PathVariable(value = "id") Long id){
        try {
            return obatRestService.getObatByIdObat(id);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Obat with ID " + String.valueOf(id) + " not found!"
            );
        }
    }

    @PutMapping(value = "/obat/{id}")
    private ResponseEntity<String> updateObat(@PathVariable(value = "id") Long id, @RequestBody ObatModel obat){
        try {
            obatRestService.changeObat(id, obat);
            return ResponseEntity.ok("Update obat success");
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Obat with ID " + String.valueOf(id) + " not found!"
            );
        }
    }

    @GetMapping(value = "/obat-all")
    private List<ObatModel> retrieveListObat() {
        return obatRestService.retrieveListObat();
    }
}
