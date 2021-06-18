package com.sofka.saludos.infraestructura.persistencia.repositorio.jpa;

import com.sofka.saludos.infraestructura.persistencia.entidad.MensajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RepositorioMensajeJPA extends JpaRepository<MensajeEntity, Integer> {

    /**
     * Permite obtener un mensaje entity por tipo e idioma
     *
     * @param tipo
     * @param idioma
     * @return MensajeEntity
     */
    @Query("select p from Mensaje p where p.tipo = :tipo and p.idioma = :idioma")
    Optional<MensajeEntity> findByTipoAndfindByIdioma(@Param("tipo") String tipo, @Param("idioma") String idioma);

}
