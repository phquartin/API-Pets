package com.petsapi.controller;

import com.petsapi.dto.pet.PetDTO;
import com.petsapi.service.PetService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
public class PetController {

    private final PetService petService;
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping("/create")
    public void createPet(@Valid @RequestBody PetDTO petDTO) {

        petService.save(petDTO);

    }

}
