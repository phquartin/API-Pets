package com.petsapi.local.service;

import com.petsapi.local.dto.pet.PetDTO;
import com.petsapi.local.dto.pet.PetResponseDTO;
import com.petsapi.local.mapper.PetMapper;
import com.petsapi.local.model.pet.PetModel;
import com.petsapi.local.repository.PetRepository;
import com.petsapi.local.validator.pet.PetException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public PetResponseDTO getById(Long id) {
        PetModel petModel = petRepository.findById(id).orElseThrow(() -> new PetException("Pet não encontrado"));
        return petMapper.toResponseDTO(petModel);
    }
    public List<PetResponseDTO> getAll() {
        List<PetModel> list = petRepository.findAll();
        return list.stream().map(petMapper::toResponseDTO).collect(Collectors.toList());
    }
    public List<PetResponseDTO> getByName(String name) {
        List<PetModel> byName = petRepository.getByNomeContaining(name);
        return byName.stream().map(petMapper::toResponseDTO).collect(Collectors.toList());
    }

    public void delete(Long id) {
        getById(id);
        petRepository.deleteById(id);
    }

}
