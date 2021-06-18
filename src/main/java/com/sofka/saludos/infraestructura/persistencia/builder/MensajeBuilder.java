package com.sofka.saludos.infraestructura.persistencia.builder;

import com.sofka.saludos.dominio.modelo.Mensaje;
import com.sofka.saludos.infraestructura.persistencia.entidad.MensajeEntity;

public final class MensajeBuilder {

    private MensajeBuilder() {
        throw new IllegalStateException("Clase de traducción");
    }

    public static Mensaje convertirADominio(MensajeEntity mensajeEntity) {
        Mensaje mensaje = null;
        if (mensajeEntity != null) {
            mensaje = new Mensaje(mensajeEntity.getTipo(), mensajeEntity.getIdioma(), mensajeEntity.getMsm());
        }
        return mensaje;
    }

}
