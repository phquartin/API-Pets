package com.petsapi.model.pet;

import jakarta.persistence.*;

@Entity
@Table(name = "Pets")
public class PetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String sobrenome;

    private PetTipo tipo;

    private char sexo;

    private int idade;

    private double peso;

    private String endereco;

    private String raca;

    public PetModel(long id, String nome, String sobrenome, PetTipo tipo, char sexo, int idade, double peso, String endereco, String raca) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tipo = tipo;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.endereco = endereco;
        this.raca = raca;
    }
    public PetModel() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public PetTipo getTipo() {
        return tipo;
    }

    public void setTipo(PetTipo tipo) {
        this.tipo = tipo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
