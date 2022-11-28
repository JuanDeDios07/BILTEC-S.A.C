package com.biltec.ProyectoFinal.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "persona")
@Entity(name = "Persona")
public class Persona {

	@Id
	private String idpersona;
	
	@JoinColumn(name = "tipo_persona")
	private String tipoPersona;
	private String nombre;
	@JoinColumn(name = "tipo_documento")
	private String tipoDocumento;
	@JoinColumn(name = "num_documento")
	private String numDocumento;
	private String direccion;
	private String telefono;
	
	@OneToMany(mappedBy = "persona")
	List<Ventas> ventas;
	
	@OneToMany(mappedBy = "persona")
	List<BoletaServicio> boletaservicos;
	
	@OneToMany(mappedBy = "persona")
	List<Trabajador> trabajadors;

	public Persona() {
		
	}

	public Persona(String idpersona, String tipoPersona, String nombre, String tipoDocumento, String numDocumento,
			String direccion, String telefono, List<Ventas> ventas, List<BoletaServicio> boletaservicos,
			List<Trabajador> trabajadors) {
		
		this.idpersona = idpersona;
		this.tipoPersona = tipoPersona;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ventas = ventas;
		this.boletaservicos = boletaservicos;
		this.trabajadors = trabajadors;
	}

	public String getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
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

	public List<Ventas> getVentas() {
		return ventas;
	}

	public void setVentas(List<Ventas> ventas) {
		this.ventas = ventas;
	}

	public List<BoletaServicio> getBoletaservicos() {
		return boletaservicos;
	}

	public void setBoletaservicos(List<BoletaServicio> boletaservicos) {
		this.boletaservicos = boletaservicos;
	}

	public List<Trabajador> getTrabajadors() {
		return trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}
	
	
}
