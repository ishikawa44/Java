package group44.Project.controllers;

import group44.Project.models.Tovars;
import group44.Project.repo.TovarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private TovarsRepository tovarsRepository;
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("title", "Main page");
        Iterable<Tovars> tovars = tovarsRepository.findAll();
        model.addAttribute("tovars",tovars);
        return "Home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "about");
        return "about";
    }
}