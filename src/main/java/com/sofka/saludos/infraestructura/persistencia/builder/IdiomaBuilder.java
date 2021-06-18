package com.sofka.saludos.infraestructura.persistencia.builder;

import com.sofka.saludos.dominio.dto.Idioma;
import com.sofka.saludos.infraestructura.persistencia.entidad.IdiomaEntity;

public final class IdiomaBuilder {

    private IdiomaBuilder() {
        throw new IllegalStateException("Clase de traducción");
    }

    public static Idioma convertirADominio(IdiomaEntity idiomaEntity) {
        Idioma idioma = null;
        if (idiomaEntity != null) {
            idioma = new Idioma(idiomaEntity.getCode(), idiomaEntity.getValue());
        }
        return idioma;
    }

    public static IdiomaEntity convertirAEntity(Idioma idioma) {
        IdiomaEntity idiomaEntity = new IdiomaEntity(idioma.getCode(), idioma.getValue());
        idiomaEntity.setCode(idioma.getCode());
        idiomaEntity.setValue(idioma.getValue());
        return idiomaEntity;
    }
}
