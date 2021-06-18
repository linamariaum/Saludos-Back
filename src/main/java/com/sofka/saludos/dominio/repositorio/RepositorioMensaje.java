package com.sofka.saludos.dominio.repositorio;

import com.sofka.saludos.dominio.modelo.Mensaje;

public interface RepositorioMensaje {

    /**
     * Permite obtener el Mensaje dado el tipo y el idioma
     *
     * @param tipo
     * @param idioma
     * @return Mensaje
     */
    Mensaje obtenerMensajePorTipoYIdioma(String tipo, String idioma);
}
