package com.sofka.saludos.infraestructura;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class ControladorMensaje {

    public static final String IDIOMA_YA_CREADO_1 = "ingles";

    @Autowired
    private MockMvc mvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void obtenerMensajeSaludo() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .get("/greet/{idioma}", IDIOMA_YA_CREADO_1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.idioma").value(IDIOMA_YA_CREADO_1));
    }

    @Test
    public void obtenerMensajeNombre() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .get("/name/{idioma}", IDIOMA_YA_CREADO_1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.idioma").value(IDIOMA_YA_CREADO_1));
    }

    @Test
    public void obtenerMensajeDespedida() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .get("/goodbye/{idioma}", IDIOMA_YA_CREADO_1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.idioma").value(IDIOMA_YA_CREADO_1));
    }

}
