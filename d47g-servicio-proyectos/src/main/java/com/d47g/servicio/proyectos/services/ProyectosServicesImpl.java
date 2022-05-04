package com.d47g.servicio.proyectos.services;

import org.springframework.stereotype.Service;

import com.d47g.comunes.models.entity.Proyecto;
import com.d47g.comunes.services.GenericServiceImpl;
import com.d47g.servicio.proyectos.models.repository.ProyectoRepository;

@Service
public class ProyectosServicesImpl extends GenericServiceImpl<Proyecto, ProyectoRepository> implements ProyectosService{

}
