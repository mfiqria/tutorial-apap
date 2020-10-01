package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.service.ResepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ResepController {
    @Autowired
    private ResepService resepService;

    //  Routing URL yang diinginkan
    @RequestMapping("/resep/add")
    public String addResep(
            //  Request Parameter yang ingin dibawa
            @RequestParam(value = "noResep", required = true) String noResep,
            @RequestParam(value = "namaDokter", required = true) String namaDokter,
            @RequestParam(value = "namaPasien", required = true) String namaPasien,
            @RequestParam(value = "catatan", required = true) String catatan,
            Model model
    ){
        // Membuat objek ResepModel
        ResepModel resep = new ResepModel(noResep, namaDokter, namaPasien, catatan);

        //  Memanggil service addResep
        resepService.addResep(resep);

        //  Add variabel nomor resep ke 'nomorResep' untuk dirender pada thymeleaf
        model.addAttribute("nomorResep", noResep);

        //  Return vew template yang ingin digunakan
        return "add-resep";
    }
    @RequestMapping("/resep/viewall")
    public String listResep(Model model){
        //  Mendapatkan semua ResepModel
        List<ResepModel> listResep = resepService.getResepList();

        //  Add variabel semua ResepModel ke 'listRese untuk dirender pada thymeleaf
        model.addAttribute("listResep", listResep);

        //  Return view template yang ingin digunakan
        return "viewall-resep";
    }
    //  Routing URL untuk melihat detail resep
    @RequestMapping("/resep/view")
    public String detailResep(
            @RequestParam(value = "noResep") String noResep,
            Model model){

        //  Mendapatkan ResepModel sesuai nomor resep
        ResepModel resep = resepService.getResepByNomorResep(noResep);

        //  Add variabel ResepModel ke 'resep' unutk dirender pada thymeleaf
        model.addAttribute("resep", resep);

        //  Return view template yang ingin digunakan
        return "view-resep";
    }

    @RequestMapping("/resep/view/no-resep/{noResep}")
    public String detailResep1(
            @PathVariable(value = "noResep") String noResep,
            Model model) {

        //  Mendapatkan ResepModel sesuai nomor resep
        ResepModel resep = resepService.getResepByNomorResep(noResep);

        //  Add variabel ResepModel ke 'resep' unutk dirender pada thymeleaf
        model.addAttribute("resep", resep);

        //  Return view template yang ingin digunakan
        return "view-resep";
    }
}