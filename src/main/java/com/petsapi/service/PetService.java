package com.petsapi.service;

import com.petsapi.dto.pet.PetDTO;
import com.petsapi.mapper.PetMapper;
import com.petsapi.model.pet.PetModel;
import com.petsapi.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private final PetMapper petMapper;
    private final PetRepository petRepository;
    public PetService(PetRepository petRepository, PetMapper petMapper) {
        this.petRepository = petRepository;
        this.petMapper = petMapper;
    }

    public void save(PetDTO petDTO) {
        PetModel petModel = petMapper.toModel(petDTO);
        this.petRepository.save(petModel);
    }

}
