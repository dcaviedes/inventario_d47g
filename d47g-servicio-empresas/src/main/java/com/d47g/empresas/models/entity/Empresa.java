package com.d47g.empresas.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.d47g.comunes.models.entity.Equipo;
import com.d47g.comunes.models.entity.Proyecto;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;


@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empresas_id")
	private Long id;
	
	private String nombre;
	private String nit;
	private String direccion;
	private String telefono;
	private String email;
	private String ciudad;
	
	//@OneToMany(fetch = FetchType.LAZY)
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL , orphanRemoval = true)
	@JoinColumn(name="empresas_id")
	private List<Proyecto> proyectos;

	

	public Empresa() {
		this.proyectos = new ArrayList<>();
	}

	public void addProyecto(Proyecto proyecto) {
		this.proyectos.add(proyecto);
	}
	
	public void removeProyecto(Proyecto proyecto) {
		this.proyectos.remove(proyecto);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

}
