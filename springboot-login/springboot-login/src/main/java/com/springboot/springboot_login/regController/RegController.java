package com.springboot.springboot_login.regController;

import com.springboot.springboot_login.entities.User;
import com.springboot.springboot_login.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/regPage")
    public String openRegPage(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Redirects to /WEB-INF/views/register.jsp
    }

    @PostMapping("/regForm")
    public String submitRegisterForm(@ModelAttribute("user") User user, Model model) {
        boolean status = registerService.registerUser(user);  // ➜ Service ko call karega

        if (status) {
            model.addAttribute("success", "User Registered Successfully!");  // UI ko success message bhejega
        } else {
            model.addAttribute("errorMsg", "User Not Registered!");  // UI ko error message bhejega
        }
        return "register";  // ➜ register.html ko return karega
    }


    @GetMapping("/loginPage")
    public String openLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "login"; // Redirects to /WEB-INF/views/login.jsp
    }

    @PostMapping("/loginForm")
    public String submitLoginForm(@ModelAttribute("user") User user, Model model) {
        User validUser = registerService.loginUser(user.getEmail(), user.getPassword());
        if (validUser != null) {
            return "redirect:/profile";
        } else {
            model.addAttribute("errorMsg", "Invalid Credentials!");
            return "login";
        }
    }
}
