package com.petsapi.local.dto.pet;

import com.petsapi.local.model.pet.PetSexo;
import com.petsapi.local.model.pet.PetTipo;
import jakarta.validation.constraints.*;

public class PetDTO {

    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres.")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "O nome deve conter apenas letras e espaços.")
    private String nome;

    @Size(max = 50, message = "O sobrenome deve ter no máximo 50 caracteres.")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "O sobrenome deve conter apenas letras e espaços.") // O '*' permite que seja vazio
    private String sobrenome;

    @NotNull(message = "O tipo do pet deve ser informado.")
    private PetTipo tipo;

    @NotNull(message = "O sexo do pet deve ser informado.")
    private PetSexo sexo;

    @Min(value = 0, message = "A idade não pode ser negativa.")
    @Max(value = 20, message = "A idade máxima permitida é 20 anos.")
    private int idade;

    @Min(value = 0, message = "O Peso deve ser positivo")
    @Max(value = 200, message = "O peso maximo permitido é 200")
    private double peso;

    @Size(max = 255, message = "O endereço deve ter no máximo 255 caracteres.")
    private String endereco;

    @NotBlank(message = "A raça não pode estar em branco.")
    @Size(min = 2, max = 50, message = "A raça deve ter entre 2 e 50 caracteres.")
    private String raca;

    // Getters e Setters

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

    public PetSexo getSexo() {
        return sexo;
    }

    public void setSexo(PetSexo sexo) {
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
