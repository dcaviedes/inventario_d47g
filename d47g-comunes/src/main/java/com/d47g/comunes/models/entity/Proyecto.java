package com.d47g.comunes.models.entity;

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

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="proyecto_id")
	private Long id;
	private String descripcion;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL , orphanRemoval = true)
	@JoinColumn(name="proyecto_id")
	private List<Equipo> equipos;
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(!(obj instanceof Proyecto))
			return false;
		
		Proyecto p = (Proyecto) obj;
					
		return this.id != null && this.id.equals(p.id);
	}
	
	public void addEquipo(Equipo equipo) {
		this.equipos.add(equipo);
	}
	
	public void removeProyecto(Equipo equipo) {
		this.equipos.remove(equipo);
	}

}
