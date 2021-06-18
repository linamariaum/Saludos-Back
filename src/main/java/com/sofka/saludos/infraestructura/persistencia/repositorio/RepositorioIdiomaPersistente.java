package com.sofka.saludos.infraestructura.persistencia.repositorio;

import com.sofka.saludos.dominio.dto.Idioma;
import com.sofka.saludos.dominio.exception.DataNotFoundException;
import com.sofka.saludos.dominio.repositorio.RepositorioIdioma;
import com.sofka.saludos.infraestructura.persistencia.builder.IdiomaBuilder;
import com.sofka.saludos.infraestructura.persistencia.entidad.IdiomaEntity;
import com.sofka.saludos.infraestructura.persistencia.repositorio.jpa.RepositorioIdiomaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioIdiomaPersistente implements RepositorioIdioma {

    @Autowired
    private RepositorioIdiomaJPA repositorioIdiomaJPA;

    @Override
    public List<Idioma> obtenerIdiomas() {
        List<IdiomaEntity> idiomaEntityList = this.repositorioIdiomaJPA.findAll();
        if (idiomaEntityList.isEmpty()) {
            throw new DataNotFoundException("No hay idiomas en la base de datos");
        }
        List<Idioma> idiomas = new ArrayList<>();
        for (IdiomaEntity idiomaEntity: idiomaEntityList) {
            idiomas.add(IdiomaBuilder.convertirADominio(idiomaEntity));
        }
        return idiomas;
    }
}
