package org.wecancodeit.virtualpet4.Controllers;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet4.Models.ShelterModel;
import org.wecancodeit.virtualpet4.Repositories.ShelterRepository;

@Controller
@RequestMapping
public class ShelterController {
    private final ShelterRepository shelterRepository = null;

    @GetMapping("/")
    public String getAllShelters(Model model) throws Exception {
        ShelterRepository shelter = new ShelterRepository("http://localhost:8080/api/v1/shelters/");
        var shelters = shelter.getAll("");
        model.addAttribute("shelters", shelters);
        return "home/index";
    }

    @GetMapping("/details")
    public String getDetails(@PathVariable Long id) throws Exception { 
        ShelterRepository shelter = new
        ShelterRepository("http://localhost:8080/api/v1/shelters/");
         var shelters = shelter.getById(id);
        return "details";
    }

    @GetMapping("delete/confirmDelete/{id}")
    public String deleteItem(@PathVariable Long id, Model model) throws Exception {
        shelterRepository.deleteById(id);
        Collection<ShelterModel> shelters = shelterRepository.getAll("");
        model.addAttribute("shelters", shelters);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteShelter(@PathVariable Long id, Model model) throws Exception {
        shelterRepository.deleteById(id);
        Collection<ShelterModel> shelters = shelterRepository.getAll("");
        model.addAttribute("shelters", shelters);
        return "redirect:/";
    }

}
