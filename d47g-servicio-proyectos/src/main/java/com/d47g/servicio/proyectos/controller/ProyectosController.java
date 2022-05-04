package com.d47g.servicio.proyectos.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.d47g.comunes.controller.GenericController;
import com.d47g.comunes.models.entity.Equipo;
import com.d47g.comunes.models.entity.Proyecto;
import com.d47g.servicio.proyectos.services.ProyectosService;

@RestController
public class ProyectosController extends GenericController<Proyecto, ProyectosService> {
	
	@PutMapping("/{id}/asignar-equipo")
	public ResponseEntity<?> asignarProyecto(@RequestBody Equipo equipo, @PathVariable Long id ){
		Optional<Proyecto> o = this.service.findById(id);
		if(!o.isPresent()){
			return ResponseEntity.notFound().build();
		}
		Proyecto dbProyecto = o.get();
		dbProyecto.addEquipo(equipo);

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbProyecto));
		
	}

}
