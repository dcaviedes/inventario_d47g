package com.d47g.servicio.proyectos.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.d47g.comunes.models.entity.Proyecto;

public interface ProyectoRepository extends PagingAndSortingRepository<Proyecto, Long> {

}
