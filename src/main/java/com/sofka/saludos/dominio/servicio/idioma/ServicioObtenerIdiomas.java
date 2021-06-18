package com.sofka.saludos.dominio.servicio.idioma;

import com.sofka.saludos.dominio.dto.Idioma;
import com.sofka.saludos.dominio.repositorio.RepositorioIdioma;

import java.util.List;

public class ServicioObtenerIdiomas {

    private final RepositorioIdioma repositorioIdioma;

    public ServicioObtenerIdiomas(RepositorioIdioma repositorioIdioma) {
        this.repositorioIdioma = repositorioIdioma;
    }

    public List<Idioma> ejecutar() {
        return this.repositorioIdioma.obtenerIdiomas();
    }
}
