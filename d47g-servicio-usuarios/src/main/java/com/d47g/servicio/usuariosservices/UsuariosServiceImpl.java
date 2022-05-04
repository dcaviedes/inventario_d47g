package com.d47g.servicio.usuariosservices;

import org.springframework.stereotype.Service;

import com.d47g.comunes.models.entity.Usuario;
import com.d47g.comunes.services.GenericServiceImpl;
import com.d47g.servicio.usuarios.models.repository.UsuariosRepository;

@Service
public class UsuariosServiceImpl extends GenericServiceImpl<Usuario, UsuariosRepository> implements UsuariosService{

}
