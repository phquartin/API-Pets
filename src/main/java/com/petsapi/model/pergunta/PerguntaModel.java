package com.petsapi.model.pergunta;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Perguntas")
public class PerguntaModel {
    @Id
    private Long id;

    private String pergunta;

    private boolean isOriginal;

    public PerguntaModel(long id, String pergunta, boolean isOriginal) {
        this.id = id;
        this.pergunta = pergunta;
        this.isOriginal = isOriginal;
    }

    public PerguntaModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public boolean isOriginal() {
        return isOriginal;
    }

    public void setOriginal(boolean original) {
        isOriginal = original;
    }
}
