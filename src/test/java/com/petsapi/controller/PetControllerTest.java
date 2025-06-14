package com.petsapi.controller; // Use o mesmo pacote do seu controller

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petsapi.dto.pet.PetDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Teste de integração para o PetController.
 * Esta classe verifica se as validações de entrada estão funcionando corretamente.
 */
@SpringBootTest
@AutoConfigureMockMvc
class PetControllerTest {

    @Autowired
    private MockMvc mockMvc; // Objeto para simular requisições HTTP

    @Autowired
    private ObjectMapper objectMapper; // Objeto para converter nosso DTO em JSON

    @Test
    void quandoCriarPetComDadosNulos_deveRetornarStatusBadRequest() throws Exception {
        PetDTO petDTOInvalido = new PetDTO();
        // 'nome', 'tipo', 'sexo' e 'raca' nulos de propósito

        // 2. Simula uma requisição POST para o endpoint /create
        mockMvc.perform(post("/pet/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(petDTOInvalido))) // Converte o DTO para uma string JSON

                // 3. Verifica se a resposta foi um erro 400 (Bad Request)
                .andExpect(status().isBadRequest());
    }
}