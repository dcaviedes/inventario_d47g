package com.d47g.empresas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.d47g.comunes.controller.GenericController;
import com.d47g.comunes.models.entity.Proyecto;
import com.d47g.empresas.models.entity.Empresa;
import com.d47g.empresas.services.EmpresaService;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class EmpresaController extends GenericController<Empresa, EmpresaService>{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Empresa empresa, @PathVariable Long id){
		Optional<Empresa> o = service.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Empresa empresaDb = o.get();
		empresaDb.setNombre(empresa.getNombre());
		empresaDb.setCiudad(empresa.getCiudad());
		empresaDb.setDireccion(empresa.getDireccion());
		empresaDb.setEmail(empresa.getEmail());
		empresaDb.setNit(empresa.getNit());
		empresaDb.setTelefono(empresa.getTelefono());
		empresaDb.setProyectos(empresa.getProyectos());
		empresaDb.setId(empresa.getId());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(empresaDb));
	}
	
	@PutMapping("/{id}/asignar-proyecto")
	public ResponseEntity<?> asignarProyecto(@RequestBody Proyecto proyecto, @PathVariable Long id ){
		Optional<Empresa> o = this.service.findById(id);
		if(!o.isPresent()){
			return ResponseEntity.notFound().build();
		}
		Empresa dbEmpresa = o.get();
		dbEmpresa.addProyecto(proyecto);

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbEmpresa));
		
	}

}
