package group44.Project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogController {
    @GetMapping("/SignUp")
    public String SignUp(Model model) {
        model.addAttribute("title", "Sign Up");
        return "Registration";
    }
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "login");
        return "login";
    }
}
