package group44.Project.controllers;

import group44.Project.models.Role;
import group44.Project.repo.UserRepo;
import group44.Project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
@Service
@Controller
public class LogController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("title", "Sign Up");
        return "Registration";
    }
    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model) {
        User userFromDb = userRepo.findByUsername(user.getUsername());
        if(userFromDb != null) {
            model.put("message", "User exist!");
            return "Registration";
        }
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);
        return "redirect:/login";
    }


    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "login");
        return "login";
    }
}
