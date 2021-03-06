package com.d47g.comunes.models.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="usuarios")
public class Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long id;
	private String nombre;
	private String apellido;
	
	@Column(unique = true, length = 60)
	private String password;
	
	@Column(unique = true, length = 20)
	private String username;
	
	private String email;
	private Boolean enable;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Rol> roles;

}
