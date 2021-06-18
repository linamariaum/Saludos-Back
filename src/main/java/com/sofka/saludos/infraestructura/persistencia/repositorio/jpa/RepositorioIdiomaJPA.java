package com.sofka.saludos.infraestructura.persistencia.repositorio.jpa;

import com.sofka.saludos.infraestructura.persistencia.entidad.IdiomaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioIdiomaJPA extends JpaRepository<IdiomaEntity, Integer> {
}
