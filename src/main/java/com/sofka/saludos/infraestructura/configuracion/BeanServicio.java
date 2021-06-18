package com.sofka.saludos.infraestructura.configuracion;

import com.sofka.saludos.dominio.repositorio.RepositorioIdioma;
import com.sofka.saludos.dominio.repositorio.RepositorioMensaje;
import com.sofka.saludos.dominio.servicio.idioma.ServicioObtenerIdiomas;
import com.sofka.saludos.dominio.servicio.mensaje.ServicioObtenerMensaje;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioObtenerIdiomas servicioObtenerIdiomas(RepositorioIdioma repositorioIdioma) {
        return new ServicioObtenerIdiomas(repositorioIdioma);
    }

    @Bean
    public ServicioObtenerMensaje servicioObtenerMensaje(RepositorioMensaje repositorioMensaje) {
        return new ServicioObtenerMensaje(repositorioMensaje);
    }
}
