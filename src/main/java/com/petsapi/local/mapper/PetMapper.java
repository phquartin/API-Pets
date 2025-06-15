package com.petsapi.local.mapper;

import com.petsapi.local.dto.pet.PetDTO;
import com.petsapi.local.dto.pet.PetResponseDTO;
import com.petsapi.local.model.pet.PetModel;
import org.springframework.stereotype.Component;


@Component
public class PetMapper {

    public PetModel toModel(PetDTO dto) {
        PetModel model = new PetModel();

        model.setNome(dto.getNome());
        model.setSobrenome(dto.getSobrenome());
        model.setTipo(dto.getTipo());
        model.setSexo(dto.getSexo());
        model.setIdade(dto.getIdade());
        model.setPeso(dto.getPeso());
        model.setEndereco(dto.getEndereco());
        model.setRaca(dto.getRaca());

        return model;
    }

    public PetResponseDTO toResponseDTO(PetModel model) {
        PetResponseDTO dto = new PetResponseDTO();

        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setSobrenome(model.getSobrenome());
        dto.setTipo(model.getTipo());
        dto.setSexo(model.getSexo());
        dto.setIdade(model.getIdade());
        dto.setPeso(model.getPeso());
        dto.setEndereco(model.getEndereco());
        dto.setRaca(model.getRaca());

        return dto;
    }
}