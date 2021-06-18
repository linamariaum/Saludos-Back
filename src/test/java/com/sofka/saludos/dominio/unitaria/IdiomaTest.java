package com.sofka.saludos.dominio.unitaria;

import com.sofka.saludos.dominio.dto.Idioma;
import com.sofka.saludos.testdatabuilder.IdiomaTestDataBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdiomaTest {

    private static final String CODE = "portugues";
    private static final String VALUE = "Portugués";

    @Test
    public void crearIdiomaTest() {

        // arrange
        IdiomaTestDataBuilder idiomaTestDataBuilder = new IdiomaTestDataBuilder().
                conCodigo(CODE).
                conValor(VALUE);

        // act
        Idioma idioma = idiomaTestDataBuilder.build();

        // assert
        assertEquals(CODE, idioma.getCode());
        assertEquals(VALUE, idioma.getValue());

    }

}
