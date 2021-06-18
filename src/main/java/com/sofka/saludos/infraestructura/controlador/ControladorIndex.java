package com.sofka.saludos.infraestructura.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorIndex {

    @GetMapping("/")
    public String index() {
        return "Saludos-Back working!";
    }

}
