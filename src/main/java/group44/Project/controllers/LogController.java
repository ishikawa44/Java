package group44.Project.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class LogController {
    @GetMapping("/SignUp")
    public String SignUp(Model model) {
        model.addAttribute("title", "Sign Up");
        return "Registration";
    }
    @GetMapping("/Login")
    public String Login(Model model) {
        model.addAttribute("title", "Login");
        return "Login";
    }
}
