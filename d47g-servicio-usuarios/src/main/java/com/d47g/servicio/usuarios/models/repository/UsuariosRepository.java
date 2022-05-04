package com.d47g.servicio.usuarios.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.d47g.comunes.models.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuariosRepository extends PagingAndSortingRepository<Usuario,Long> {

	@RestResource(path = "buscar-username")
	public Usuario findByUsername(String usuario);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerPorUsuario(String usuario);
}
