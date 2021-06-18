package com.sofka.saludos.infraestructura.controlador;

import com.sofka.saludos.aplicacion.manejadores.mensaje.ManejadorObtenerMensaje;
import com.sofka.saludos.dominio.modelo.Mensaje;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/talk")
public class ControladorMensaje {

    private final ManejadorObtenerMensaje manejadorObtenerMensaje;

    public ControladorMensaje(ManejadorObtenerMensaje manejadorObtenerMensaje) {
        this.manejadorObtenerMensaje = manejadorObtenerMensaje;
    }

    @GetMapping("/greet/{idioma}")
    public Mensaje saludar(@PathVariable(name = "idioma") String idioma) {
        return this.manejadorObtenerMensaje.ejecutar("saludo", idioma);
    }

    @GetMapping("/name/{idioma}")
    public Mensaje nombrar(@PathVariable(name = "idioma") String idioma) {
        return this.manejadorObtenerMensaje.ejecutar("nombre", idioma);
    }

    @GetMapping("/goodbye/{idioma}")
    public Mensaje despedirse(@PathVariable(name = "idioma") String idioma) {
        return this.manejadorObtenerMensaje.ejecutar("despedida", idioma);
    }
}
