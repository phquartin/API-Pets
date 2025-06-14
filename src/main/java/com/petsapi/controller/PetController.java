package com.petsapi.controller;

import com.petsapi.dto.pet.PetDTO;
import com.petsapi.service.PetService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class PetController {

    private final PetService petService;
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/create")
    public void createPet(@Valid @RequestBody PetDTO petDTO) {

        petService.save(petDTO);

    }

}
