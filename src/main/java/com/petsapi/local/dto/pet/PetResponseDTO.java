package com.petsapi.local.dto.pet;

import com.petsapi.local.model.pet.PetSexo;
import com.petsapi.local.model.pet.PetTipo;

public class PetResponseDTO {

    private Long id;
    private String nome;
    private String sobrenome;
    private PetTipo tipo;
    private PetSexo sexo;
    private int idade;
    private double peso;
    private String endereco;
    private String raca;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
    public PetTipo getTipo() { return tipo; }
    public void setTipo(PetTipo tipo) { this.tipo = tipo; }
    public PetSexo getSexo() { return sexo; }
    public void setSexo(PetSexo sexo) { this.sexo = sexo; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }
}
