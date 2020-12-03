package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.UserModel;
import apap.tutorial.haidokter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    private String addUserSubmit(@ModelAttribute UserModel user, Model model){
        userService.addUser(user);
        model.addAttribute("user", user);
        return "redirect:/";
    }

    @RequestMapping(value = "/change-password/", method = RequestMethod.GET)
    private String changePasswordFormPage(Model model) {
        model.addAttribute("user", "User");

        return "form-update-password";
    }

    @RequestMapping(value = "/change-password", method = RequestMethod.POST)
    private String updatePasswordSubmit(@RequestParam String username, String passLama, String passBaru, String konfPassBaru, Model model) {
        UserModel user = userService.getUserByUsername(username);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(passLama, user.getPassword())){
            if (passBaru.equals(konfPassBaru)){
                userService.changePassword(user, passBaru);
                model.addAttribute("msg", "Password berhasil diubah!");
            } else {
                model.addAttribute("msg", "Password Baru dan Konfirmasi Password Baru tidak sama");
            }
        } else {
            model.addAttribute("msg", "Password lama salah!");
        }
        return "update-password";
    }


}
