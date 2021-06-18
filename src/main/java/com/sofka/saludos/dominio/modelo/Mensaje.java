package com.sofka.saludos.dominio.modelo;

public class Mensaje {

    private String tipo;
    private String idioma;
    private String msm;

    public Mensaje(String tipo, String idioma, String msm) {
        this.tipo = tipo;
        this.idioma = idioma;
        this.msm = msm;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }
}
