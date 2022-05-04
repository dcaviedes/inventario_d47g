package com.d47g.comunes.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String marca;
	private String producto;
	private String modelo;
	private String procesador;
	private String disco;
	private String ram;
	private String serial;
	private String ciudad;
	private String bits;
	private String ac;
	private String instalacion;
	
	@Column(name="centro_costos")
	private String centroCostos;
	private String observaciones;
	private Float costo;
	
	@Column(name="fecha_instalacion")
	private Date fechaInstalacion;
	
	@Column(name="fecha_entrega")
	private Date fechaEntrega;
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(!(obj instanceof Equipo))
			return false;
		
		Equipo p = (Equipo) obj;
					
		return this.id != null && this.id.equals(p.id);
	}

}
