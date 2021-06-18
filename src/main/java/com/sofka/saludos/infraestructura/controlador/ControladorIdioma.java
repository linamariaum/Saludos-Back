package com.sofka.saludos.infraestructura.controlador;

import com.sofka.saludos.aplicacion.manejadores.idioma.ManejadorObtenerIdiomas;
import com.sofka.saludos.dominio.dto.Idioma;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/idioms")
public class ControladorIdioma {

    private final ManejadorObtenerIdiomas manejadorObtenerIdiomas;

    public ControladorIdioma(ManejadorObtenerIdiomas manejadorObtenerIdiomas) {
        this.manejadorObtenerIdiomas = manejadorObtenerIdiomas;
    }

    @GetMapping
    public List<Idioma> buscarIdiomas() {
        return this.manejadorObtenerIdiomas.ejecutar();
    }
}
