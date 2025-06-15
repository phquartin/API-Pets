package com.petsapi.local.repository;

import com.petsapi.local.model.pet.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<PetModel, Long> {
    public List<PetModel> getByNomeContaining(String nome);
}
