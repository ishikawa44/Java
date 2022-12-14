package group44.Project.controllers;

import group44.Project.models.Tovars;
import group44.Project.repo.TovarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class MainController {
    @Autowired
    private TovarsRepository tovarsRepository;
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("title", "Main page");
        Iterable<Tovars> tovars = tovarsRepository.findAllByOrderByIdDesc();
        model.addAttribute("tovars",tovars);
        return "Home";
    }
    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("title", "Main page for users");
        Iterable<Tovars> tovars = tovarsRepository.findAllByOrderByIdDesc();
        model.addAttribute("tovars",tovars);
        return "HomeUser";
    }
    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("title", "Admin control panel");
        Iterable<Tovars> tovars = tovarsRepository.findAllByOrderByIdDesc();
        model.addAttribute("tovars",tovars);
        return "Home_adm";
    }


    @GetMapping("/add")
    public String mainAdd(Model model) {
        return "Home-add";
    }
    @PostMapping("/add")
    public String mainAddNew(@RequestParam String brand, @RequestParam String name,
    @RequestParam String category,@RequestParam String description,@RequestParam Integer price,
                         @RequestParam String imgur, Model model){

        Tovars t = new Tovars();
        t.setBrand(brand);
        t.setName(name);
        t.setCategory(category);
        t.setDescription(description);
        t.setPrice(price);
        t.setImgur(imgur);

        tovarsRepository.save(t);
        return "redirect:/";
    }


    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "about");
        return "about";
    }

    @GetMapping("/prod/{id}")
    public String product_description(@PathVariable(value = "id") long id, Model model) {
        model.addAttribute("title", "Description");
        Optional<Tovars> tovar = tovarsRepository.findAllById(id);
        ArrayList<Tovars> res = new ArrayList<>();
        tovar.ifPresent(res::add);
        model.addAttribute("tovar",res);
        return "product_info";
    }

}