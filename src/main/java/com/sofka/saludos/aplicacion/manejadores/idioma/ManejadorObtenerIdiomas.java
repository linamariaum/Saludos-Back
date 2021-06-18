package com.sofka.saludos.aplicacion.manejadores.idioma;

import com.sofka.saludos.dominio.dto.Idioma;
import com.sofka.saludos.dominio.servicio.idioma.ServicioObtenerIdiomas;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ManejadorObtenerIdiomas {

    private final ServicioObtenerIdiomas servicioObtenerIdiomas;

    public ManejadorObtenerIdiomas(ServicioObtenerIdiomas servicioObtenerIdiomas) {
        this.servicioObtenerIdiomas = servicioObtenerIdiomas;
    }

    @Transactional
    public List<Idioma> ejecutar() {
        return this.servicioObtenerIdiomas.ejecutar();
    }
}
