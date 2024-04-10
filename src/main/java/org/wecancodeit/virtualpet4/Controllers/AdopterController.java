package org.wecancodeit.virtualpet4.Controllers;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.virtualpet4.Models.AdoptersModel;
import org.wecancodeit.virtualpet4.Repositories.AdoptersRepository;

@Controller
@RequestMapping("/adopter")
public class AdopterController {
    private final AdoptersRepository adoptersRepository;

    public AdopterController() {
        adoptersRepository = new AdoptersRepository("http://localhost:8080/api/v1/adopters/");
    }

    @GetMapping
    public String getAllAdopters(Model model) throws Exception {
        Collection<AdoptersModel> adopters = adoptersRepository.getAll("");
        model.addAttribute("adopters", adopters);
        return "adopter/index";
    }

    @GetMapping("/details/{id}")
    public String getDetails(@PathVariable Long id, Model model) throws Exception {
        AdoptersModel adopters = adoptersRepository.getById(id);
        model.addAttribute("adopters", adopters);
        return "adopter/details";
    }

}
