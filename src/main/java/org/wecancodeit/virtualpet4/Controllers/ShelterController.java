package org.wecancodeit.virtualpet4.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.virtualpet4.Models.ShelterModel;
import org.wecancodeit.virtualpet4.Repositories.ShelterRepository;

import jakarta.annotation.Resource;

import org.springframework.web.bind.annotation.RequestParam;


    @Controller
    public class ShelterController{
        // ShelterRepository shelter = new ShelterRepository("http://localhost:8080/api/v1/shelters/");
        

        @GetMapping("/")
        public String getAllShelters(Model model) throws Exception{
        ShelterRepository shelter = new ShelterRepository("http://localhost:8080/api/v1/shelters/");
        var shelters = shelter.getAll("");
        model.addAttribute("shelters",shelters);
        return "home/index";
    }

    // @GetMapping("details/{id}")
    // public String getDetails (@PathVariable Long id) {
    //     ShelterRepository shelter = new ShelterRepository("http://localhost:8080/api/v1/shelters/");

    //     return new String();
    // }
    

        // @GetMapping("confirm/{id}")
        // public String getTask(@PathVariable Long id) {
        //     ShelterRepository shelter = new ShelterRepository("http://localhost:8080/api/v1/shelters/");
        //     return shelter.getById(id);

        // // public String confirmDelete(@PathVariable Long id, Model model) throws Exception{
        // //       ShelterRepository shelter = new ShelterRepository("http://localhost:8080/api/v1/shelters/");
        //     // ShelterModel task = shelter.getById(id);
        //     // model.addAttribute("task", task);
        //     return "confirm";
        // }

        // @DeleteMapping("/deleteShelter/{id}")
        // public String deleteShelter(@PathVariable Long id) {
        //     // ShelterRepository shelter =new ShelterRepository("http://localhost:8080/api/v1/shelters/");
        //     ShelterModel bye = shelter.getById(id);
        //     .deleteById(id)
        //     return new String();
        // }
        
        
}

