package com.petsapi.local.controller;

import com.petsapi.local.dto.pet.PetDTO;
import com.petsapi.local.dto.pet.PetResponseDTO;
import com.petsapi.local.service.PetService;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
@Validated
public class PetController {

    private final PetService petService;
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping("/create")
    public void createPet(@Valid @RequestBody PetDTO petDTO) {

        petService.save(petDTO);

    }

    @GetMapping("/all")
    public List<PetResponseDTO> getAll() {
        return petService.getAll();
    }
    @GetMapping("/id/{id}")
    public PetResponseDTO getPetById(@PathVariable Long id) {
        return petService.getById(id);
    }
    @GetMapping("/name/{name}")
    public List<PetResponseDTO> getByName(@PathVariable String name) {
        return petService.getByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePetById(@PathVariable Long id) {
        petService.delete(id);
    }

}
