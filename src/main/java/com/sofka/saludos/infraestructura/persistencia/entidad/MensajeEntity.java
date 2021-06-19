package com.sofka.saludos.infraestructura.persistencia.entidad;

import javax.persistence.*;

@Entity(name = "Mensaje")
@NamedQuery(name = "Mensaje.findByTipoAndfindByIdioma", query = "SELECT mensaje FROM Mensaje mensaje WHERE mensaje.tipo = :tipo and mensaje.idioma = :idioma")
public class MensajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String idioma;

    @Column(nullable = false)
    private String msm;

    public MensajeEntity() {
    }

    public MensajeEntity(String tipo, String idioma, String msm) {
        this.tipo = tipo;
        this.idioma = idioma;
        this.msm = msm;
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
