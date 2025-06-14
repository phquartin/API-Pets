package com.petsapi.repository;

import com.petsapi.model.pergunta.PerguntaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerguntaRepository extends JpaRepository<PerguntaModel, Long> {
}
