package com.d47g.servicio.oauth.services;

import com.d47g.comunes.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
