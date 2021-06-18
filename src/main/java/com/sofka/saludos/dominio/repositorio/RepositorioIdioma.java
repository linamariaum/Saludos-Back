package com.sofka.saludos.dominio.repositorio;

import com.sofka.saludos.dominio.dto.Idioma;

import java.util.List;

public interface RepositorioIdioma {

    /**
     * Permite obtener todos los idiomas
     *
     * @return List<Idioma>
     */
    List<Idioma> obtenerIdiomas();
}
