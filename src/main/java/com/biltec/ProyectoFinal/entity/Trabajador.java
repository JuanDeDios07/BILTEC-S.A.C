package com.biltec.ProyectoFinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "trabajador")
@Entity(name = "Trabajador")
public class Trabajador {

	@Id
	@Column(length = 8)
	private String dni;
	@Column(length = 80)
	private String nombre;
	@Column(length = 80)
	private String apellidos;
	@Column(length = 100)
	private String direccion;
	@Column(length = 9)
	private String telefono;
	
	
	@ManyToOne
	@JoinColumn(name = "idpersona")
	Persona persona;
	
	@ManyToOne
	@JoinColumn(name = "idtienda")
	Tienda tienda;
	
	@ManyToOne
	@JoinColumn(name = "idusuario")
	Usuario usuario;

	public Trabajador() {
	}

	public Trabajador(String dni, String nombre, String apellidos, String direccion, String telefono, Persona persona,
			Tienda tienda, Usuario usuario) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.persona = persona;
		this.tienda = tienda;
		this.usuario = usuario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}