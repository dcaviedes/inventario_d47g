package com.d47g.servicio.equipos.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.d47g.comunes.models.entity.Equipo;

public interface EquiposRepository extends PagingAndSortingRepository<Equipo, Long>{

}
