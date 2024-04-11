package org.wecancodeit.virtualpet4.Controllers;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.virtualpet4.DTO.AdopterDTO;
import org.wecancodeit.virtualpet4.Models.AdoptersModel;
import org.wecancodeit.virtualpet4.Models.Enums.AdoptionStatusEnum;
import org.wecancodeit.virtualpet4.Models.Enums.PetTypeEnum;
import org.wecancodeit.virtualpet4.Repositories.AdoptersRepository;

@Controller
@RequestMapping("/adopter")
public class AdopterController {
    private final AdoptersRepository adoptersRepository;

    /**Base string and adopters repository to pull from "API"/vp3 */
    public AdopterController() {
        adoptersRepository = new AdoptersRepository("http://localhost:8080/api/v1/adopters/");
    }
/**gets all adopters */
    @GetMapping
    public String getAllAdopters(Model model) throws Exception {
        Collection<AdoptersModel> adopters = adoptersRepository.getAll("");
        model.addAttribute("adopters", adopters);
        return "adopter/index";
    }
/**get the details on a specific adopter using the adopters id */
    @GetMapping("/details/{id}")
    public String getDetails(@PathVariable Long id, Model model) throws Exception {
        AdoptersModel adopters = adoptersRepository.getById(id);
        model.addAttribute("adopters", adopters);
        return "adopter/details";
    }
/** method to edit an adopter used for the create and the edit page */
    @GetMapping("/edit/{id}")
    public String editAdopter(@PathVariable Long id, Model model) throws Exception {
        AdoptersModel adopters = adoptersRepository.getById(id);
        model.addAttribute("adopters", adopters);        
/**these are the enums for the drop downs for the edit page */
        List<String> lstpreferredPetType = enumToList(PetTypeEnum.class);
        model.addAttribute("lstpreferredPetType", lstpreferredPetType);
        List<String> lstadoptionStatus = enumToList(AdoptionStatusEnum.class);
        model.addAttribute("lstadoptionStatus", lstadoptionStatus);
        model.addAttribute("title", "Edit Adopter");
        return "adopter/edit";
    }
/**save method for saving both edits and new adopters */
    @PostMapping("/save")
    public String save(@ModelAttribute("adopters") AdopterDTO dto) throws Exception {
        adoptersRepository.saveAdopter(dto.convertToModel());
        return "redirect:/adopter";
    }
/**create method that uses the same page as the edit to create and save new adopters  */
    @GetMapping("/create")
    public String createAdopter(Model model) throws Exception {
        AdopterDTO dto = new AdopterDTO();
        model.addAttribute("adopters", dto);
        List<String> lstpreferredPetType = enumToList(PetTypeEnum.class);
        model.addAttribute("lstpreferredPetType", lstpreferredPetType);
        List<String> lstadoptionStatus = enumToList(AdoptionStatusEnum.class);
        model.addAttribute("lstadoptionStatus", lstadoptionStatus);
        model.addAttribute("title", "Create Adopter");
        return "adopter/edit";
    }
/**confirmation method displays selected adopter to give user a chance to confirm correct adopter is being deleted. */
    @GetMapping("/confirmDelete/{id}")
    public String confirmDelete(@PathVariable Long id, Model model) throws Exception {
        AdoptersModel adopters = adoptersRepository.getById(id);
        model.addAttribute("adopters", adopters);
        return "adopter/confirmDelete";
    }
/**this method actually deletes the selected adopter */
    @GetMapping("/delete/{id}")
    public String deleteAdopterById(@PathVariable Long id) throws Exception {
        adoptersRepository.deleteById(id);
        return "redirect:/adopter";
    }
/*code to handle the enums */
    public <T extends Enum<T>> List<String> enumToList(Class<T> class1) {
        List<String> list = new ArrayList<>();
        T[] enumConstants = class1.getEnumConstants();
        for (T enumConstant : enumConstants) {
            list.add(enumConstant.name());
        }
        return list;
    }
}
