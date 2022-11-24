package group44.Project.controllers;

import group44.Project.models.Tovars;
import group44.Project.repo.TovarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
}