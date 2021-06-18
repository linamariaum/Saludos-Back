package com.sofka.saludos.testdatabuilder;

import com.sofka.saludos.aplicacion.comando.ComandoIdioma;
import com.sofka.saludos.dominio.dto.Idioma;

public class IdiomaTestDataBuilder {

    private static final String CODE = "frances";
    private static final String VALUE = "Francés";

    private String code;
    private String value;

    public IdiomaTestDataBuilder() {
        this.code = CODE;
        this.value = VALUE;
    }

    public IdiomaTestDataBuilder conCodigo(String code) {
        this.code = code;
        return this;
    }

    public IdiomaTestDataBuilder conValor(String value) {
        this.value = value;
        return this;
    }

    public Idioma build() {
        return new Idioma(code, value);
    }

    public ComandoIdioma buildComando() {
        return new ComandoIdioma(this.code, this.value);
    }

}
