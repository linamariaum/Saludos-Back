package com.sofka.saludos.aplicacion.fabrica;

import com.sofka.saludos.aplicacion.comando.ComandoIdioma;
import com.sofka.saludos.dominio.dto.Idioma;
import org.springframework.stereotype.Component;

@Component
public class FabricaIdioma {
    public Idioma crearIdioma(ComandoIdioma comandoIdioma) {
        return new Idioma(comandoIdioma.getCode(), comandoIdioma.getValue());
    }
}
