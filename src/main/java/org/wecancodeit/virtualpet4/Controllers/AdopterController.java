package org.wecancodeit.virtualpet4.Controllers;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.virtualpet4.DTO.AdopterDTO;
import org.wecancodeit.virtualpet4.DTO.ShelterDTO;
import org.wecancodeit.virtualpet4.Models.AdoptersModel;
import org.wecancodeit.virtualpet4.Models.ShelterModel;
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

    /** edit will not currently save changes due to save not working */
    @GetMapping("/edit/{id}")
    public String editAdopter(@PathVariable Long id, Model model) throws Exception {
        AdoptersModel adopters = adoptersRepository.getById(id);
        model.addAttribute("adopters", adopters);
        // model.addAttribute("title", "Edit Adopter");
        return "adopter/edit";
    }

    /** save adopter not currently working */
    @PostMapping("/save")
    public String save(@ModelAttribute("adopters") AdopterDTO dto) throws Exception {
        adoptersRepository.saveAdopter(dto.convertToModel());
        return "adopter/save";
    }

    @GetMapping("/create")
    public String createAdopter(Model model) throws Exception {
        AdopterDTO dto = new AdopterDTO();
        model.addAttribute("adopter", dto);
        return "adopter/create";
    }

    @GetMapping("/confirmDelete/{id}")
    public String confirmDelete(@PathVariable Long id, Model model) throws Exception {
        AdoptersModel adopters = adoptersRepository.getById(id);
        model.addAttribute("adopters", adopters);
        return "adopter/confirmDelete";
    }

    @GetMapping("/delete/{id}")
    public String deleteAdopterById(@PathVariable Long id) throws Exception {
        adoptersRepository.deleteById(id);
        return "redirect:/";
    }
}
