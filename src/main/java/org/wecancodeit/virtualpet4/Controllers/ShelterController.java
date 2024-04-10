package org.wecancodeit.virtualpet4.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet4.DTO.ShelterDTO;
import org.wecancodeit.virtualpet4.Models.ShelterModel;
import org.wecancodeit.virtualpet4.Repositories.ShelterRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;


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
        var shelter = shelterRepository.getById(id);
        model.addAttribute("shelter", shelter);
        return "home/details";
    }

    @GetMapping("/confirmDelete/{id}")
    public String confirmDelete(@PathVariable Long id, Model model) throws Exception {
        ShelterModel shelter = shelterRepository.getById(id);
        model.addAttribute("shelter", shelter);
        return "home/confirmDelete";
    }


    @GetMapping("delete/{id}")
    public String deleteShelterById(@PathVariable Long id) throws Exception {        
        shelterRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("edit/{id}")
    public String editShelter(@PathVariable Long id, Model model) throws Exception {
        ShelterModel shelter =shelterRepository.getById(id);
        model.addAttribute("shelter", shelter);
        model.addAttribute("title", "Edit Shelter");
        return "home/edit";
    }

    @PostMapping("save")
    public String save(@ModelAttribute("shelter") ShelterDTO dto) throws Exception {
        shelterRepository.SaveShelter(dto.convertToModel());
        return "redirect:/";
    }

    @GetMapping("/create")
    public String createShelter(Model model)throws Exception {
        ShelterDTO dto=new ShelterDTO();
        model.addAttribute("shelter", dto);
        model.addAttribute("title", "Create Shelter");
        return "home/edit";
    }
    

}
