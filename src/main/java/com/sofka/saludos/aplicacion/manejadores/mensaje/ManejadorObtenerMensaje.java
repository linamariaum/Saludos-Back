package com.sofka.saludos.aplicacion.manejadores.mensaje;

import com.sofka.saludos.dominio.modelo.Mensaje;
import com.sofka.saludos.dominio.servicio.mensaje.ServicioObtenerMensaje;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ManejadorObtenerMensaje {

    private final ServicioObtenerMensaje servicioObtenerMensaje;

    public ManejadorObtenerMensaje(ServicioObtenerMensaje servicioObtenerMensaje) {
        this.servicioObtenerMensaje = servicioObtenerMensaje;
    }

    @Transactional
    public Mensaje ejecutar(String tipo, String idioma) {
        return this.servicioObtenerMensaje.ejecutar(tipo, idioma);
    }
}
