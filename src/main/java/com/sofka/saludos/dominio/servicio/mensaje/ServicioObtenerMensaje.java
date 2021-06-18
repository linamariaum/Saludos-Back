package com.sofka.saludos.dominio.servicio.mensaje;

import com.sofka.saludos.dominio.modelo.Mensaje;
import com.sofka.saludos.dominio.repositorio.RepositorioMensaje;

public class ServicioObtenerMensaje {

    private final RepositorioMensaje repositorioMensaje;

    public ServicioObtenerMensaje(RepositorioMensaje repositorioMensaje) {
        this.repositorioMensaje = repositorioMensaje;
    }

    public Mensaje ejecutar(String tipo, String idioma) {
        return this.repositorioMensaje.obtenerMensajePorTipoYIdioma(tipo, idioma);
    }
}
