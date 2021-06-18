package com.sofka.saludos.dominio.unitaria;

import com.sofka.saludos.dominio.modelo.Mensaje;
import com.sofka.saludos.testdatabuilder.MensajeTestDataBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MensajeTest {

    private static final String TIPO = "despedida";
    private static final String IDIOMA = "ingles";
    private static final String MSM = "Goodbye";

    @Test
    public void crearMensajeTest() {

        // arrange
        MensajeTestDataBuilder mensajeTestDataBuilder = new MensajeTestDataBuilder().
                conTipo(TIPO).
                conIdioma(IDIOMA).
                conMensaje(MSM);

        // act
        Mensaje mensaje = mensajeTestDataBuilder.build();

        // assert
        assertEquals(TIPO, mensaje.getTipo());
        assertEquals(IDIOMA, mensaje.getIdioma());
        assertEquals(MSM, mensaje.getMsm());

    }

}
