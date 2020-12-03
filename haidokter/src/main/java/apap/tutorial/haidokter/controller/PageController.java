package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.UserModel;
import apap.tutorial.haidokter.service.RoleService;
import apap.tutorial.haidokter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;


    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("listRole", roleService.findAll());
        model.addAttribute("user", new UserModel().getUsername());
        return "home";
    }
    @RequestMapping("/login")
    public  String login() {
        return "login";
    }
}

