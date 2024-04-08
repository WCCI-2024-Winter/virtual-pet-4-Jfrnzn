package org.wecancodeit.virtualpet4.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet4.Models.ShelterModel;
import org.wecancodeit.virtualpet4.Repositories.ShelterRepository;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class ShelterController {
    private final ShelterRepository shelterRepository = new ShelterRepository("http://localhost:8080/api/v1/shelters/");

    @GetMapping("/")
    public String getAllShelters(Model model) throws Exception {
        ShelterRepository shelter = new ShelterRepository("http://localhost:8080/api/v1/shelters/");
        var shelters = shelter.getAll("");
        model.addAttribute("shelters", shelters);
        return "home/index";
    }

    @GetMapping("/details/{id}")
    public String getDetails(@PathVariable Long id, Model model) throws Exception {
        var shelters = shelterRepository.getById(id);
        model.addAttribute("shelters", shelters);
        return "home/details";
    }

    @GetMapping("/confirmDelete/{id}")
    public String confirmDelete(@PathVariable Long id, Model model) throws Exception {
        var shelters = shelterRepository.getById(id);
        model.addAttribute("shelters", shelters);
        return "home/confirmDelete";
    }

    // @GetMapping("delete/{id}")
    // public String deleteShelter(@PathVariable Long id, Model model) throws
    // Exception {
    // ShelterModel shelter = shelterRepository.getById(id);
    // shelter.deleteById(id);
    // return new String();
    // }

    @GetMapping("delete/{id}")
    public String deleteShelterById(Long id) throws Exception {
        // Check if the shelter exists
        if (shelterRepository.isPresent(id)) {
            // If the shelter exists, delete it
            shelterRepository.deleteById(id);
            System.out.println("Shelter with ID " + id + " deleted successfully.");
        } else {
            // If the shelter does not exist, handle accordingly (e.g., throw exception)
            throw new Exception("Shelter with ID " + id + " not found.");
        }
        return "/";
    }

}
