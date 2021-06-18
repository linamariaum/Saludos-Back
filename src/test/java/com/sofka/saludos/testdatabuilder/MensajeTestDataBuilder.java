package com.sofka.saludos.testdatabuilder;

import com.sofka.saludos.aplicacion.comando.ComandoMensaje;
import com.sofka.saludos.dominio.modelo.Mensaje;

public class MensajeTestDataBuilder {

    private static final String IDIOMA = "ingles";
    private static final String TIPO = "saludo";
    private static final String MSM = "Hello";

    private String idioma;
    private String tipo;
    private String msm;

    public MensajeTestDataBuilder() {
        this.idioma = IDIOMA;
        this.tipo = TIPO;
        this.msm = MSM;
    }

    public MensajeTestDataBuilder conIdioma(String idioma) {
        this.idioma = idioma;
        return this;
    }

    public MensajeTestDataBuilder conTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public MensajeTestDataBuilder conMensaje(String msm) {
        this.msm = msm;
        return this;
    }

    public Mensaje build() {
        return new Mensaje(tipo, idioma, msm);
    }

    public ComandoMensaje buildComando() {
        return new ComandoMensaje(this.tipo, this.idioma, this.msm);
    }

}
