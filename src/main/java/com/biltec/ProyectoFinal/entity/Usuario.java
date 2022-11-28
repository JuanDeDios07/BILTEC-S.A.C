package com.biltec.ProyectoFinal.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "usuario")
@Entity(name = "Usuario")
public class Usuario {

	@Id
	private String idusuario;

	private String email;
	private String clave;
	
	@OneToMany(mappedBy = "usuario")
	List<Trabajador> trabajador;
	
	@ManyToOne
	@JoinColumn(name = "idroles")
	Rol rol;

	public Usuario() {
	}

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public List<Trabajador> getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(List<Trabajador> trabajador) {
		this.trabajador = trabajador;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}