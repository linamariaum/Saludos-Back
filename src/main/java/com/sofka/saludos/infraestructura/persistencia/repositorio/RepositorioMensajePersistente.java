package com.sofka.saludos.infraestructura.persistencia.repositorio;

import com.sofka.saludos.dominio.exception.DataNotFoundException;
import com.sofka.saludos.dominio.modelo.Mensaje;
import com.sofka.saludos.dominio.repositorio.RepositorioMensaje;
import com.sofka.saludos.infraestructura.persistencia.builder.MensajeBuilder;
import com.sofka.saludos.infraestructura.persistencia.entidad.MensajeEntity;
import com.sofka.saludos.infraestructura.persistencia.repositorio.jpa.RepositorioMensajeJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RepositorioMensajePersistente implements RepositorioMensaje {

    @Autowired
    private RepositorioMensajeJPA repositorioMensajeJPA;

    @Override
    public Mensaje obtenerMensajePorTipoYIdioma(String tipo, String idioma) {
        Optional<MensajeEntity> mensajeEntityOptional = this.repositorioMensajeJPA.findByTipoAndfindByIdioma(tipo, idioma);
        if (mensajeEntityOptional.isPresent()) {
            return MensajeBuilder.convertirADominio(mensajeEntityOptional.get());
        }
        throw new DataNotFoundException("No se encuentra el mensaje con los parámetros ingresados");
    }
}
