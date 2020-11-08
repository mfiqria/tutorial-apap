package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.service.ResepService;
import apap.tutorial.haidokter.service.ObatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class ResepController {
    @Qualifier("resepServiceImpl")
    @Autowired
    private ResepService resepService;

    @Autowired
    private ObatService obatService;

    @GetMapping("/")
    private String home(){
        return "home";
    }

    @GetMapping("/resep/add")
    public String addResepFormPage(Model model){
        model.addAttribute("resep", new ResepModel());
        return "form-add-resep";
    }

    @PostMapping("/resep/add")
    public String addResepSubmit(
            @ModelAttribute ResepModel resep,
            Model model
    ) {
        resepService.addResep(resep);
        model.addAttribute("nomorResep", resep.getNoResep());
        return "add-resep";
    }

    @GetMapping("/resep/change/{noResep}")
    private String changeResepFormPage(
            @PathVariable Long noResep,
            Model model
    ) {
        if (noResep != null) {
            ResepModel resep = resepService.getResepByNomorResep(noResep);
            model.addAttribute("resep", resep);

            return "form-update-resep";
        }
        model.addAttribute("msg", "Nomor Resep Tidak Ditemukan atau Nomor Resep Tidak Ada!");

        return "error";
    }
    @PostMapping("/resep/change")
    private String changeResepFormSubmit(
            @ModelAttribute ResepModel resep,
            Model model
    ) {
        ResepModel updateResep = resepService.updateResep(resep);
        model.addAttribute("resep", updateResep);
        return "update-resep";
    }

    @GetMapping("/resep/view")
    public String viewDetailResep(
            @RequestParam(value = "noResep") Long noResep,
            Model model
    ) {
        if (noResep != null) {
            ResepModel resep = resepService.getResepByNomorResep(noResep);
            List<ObatModel> listObat = resep.getListObat();

            model.addAttribute("resep", resep);
            model.addAttribute("listObat", listObat);

            return "view-resep";
        }

        return "error";
    }

    @GetMapping("/resep/view/{noResep}")
    private String viewResepDariHome(
            @PathVariable Long noResep,
            Model model
    ) {
        if (noResep != null) {
            ResepModel resep = resepService.getResepByNomorResep(noResep);
            List<ObatModel> listObat = resep.getListObat();

            model.addAttribute("resep", resep);
            model.addAttribute("listObat", listObat);

            return "view-resep";
        }

        return "error";
    }

    @RequestMapping("/resep/viewall")
    public String listResep(Model model){
        //  Mendapatkan semua ResepModel
        List<ResepModel> listResep = resepService.getResepList();


        List<ResepModel> listResepReverse = resepService.getResepListReverse();
        //  Add variabel semua ResepModel ke 'listResepReverse untuk dirender pada thymeleaf
        model.addAttribute("listResepReverse", listResepReverse);

        //  Return view template yang ingin digunakan
        return "viewall-resep";
    }
    @GetMapping("/resep/delete/{noResep}")
    public String deleteResep(
            @PathVariable("noResep") Long noResep,
            Model model) {

        //  Cek apakah terdapat nomor resep yang diminta
        if (resepService.getResepByNomorResep(noResep) != null) {
            //  Mendapatkan ResepModel sesuai nomor resep
            ResepModel resep = resepService.getResepByNomorResep(noResep);

            //  Melakukan pemanggilan service delete
            ResepModel resepDeleted = resepService.deleteResep(resep);

            //  Add variabel ResepModel ke 'resep' untuk dirender pada thymeleaf
            model.addAttribute("resep", resepDeleted);

            //  Return view template yang ingin digunakan
            if (resepDeleted != null) {
                return "delete-resep";
            } else {
                return "delete-resep-error";
            }
        } else {
            return "delete-resep-error";
        }
    }

//    @GetMapping("/obat/add-multiple/{noResep}")
//    private String addMultipleResepFormPage(
//            @PathVariable Long noResep,
//            Model model
//    ) {
//
//    }
}