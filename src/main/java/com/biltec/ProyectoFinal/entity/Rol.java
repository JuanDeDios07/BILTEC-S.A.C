package com.biltec.ProyectoFinal.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "rol")
@Entity(name = "Rol")
public class Rol {

	@Id
	private String idrol;
	private String nombre;
	
	@OneToMany(mappedBy = "rol")
	List<Usuario> usuarios;

	public Rol() {
		
	}

	public Rol(String idrol, String nombre, List<Usuario> usuarios) {
	
		this.idrol = idrol;
		this.nombre = nombre;
		this.usuarios = usuarios;
	}

	public String getIdrol() {
		return idrol;
	}

	public void setIdrol(String idrol) {
		this.idrol = idrol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
