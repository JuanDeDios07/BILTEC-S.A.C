package com.biltec.ProyectoFinal.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "tienda")
@Entity(name = "Tienda")
public class Tienda {
	@Id
	private String idtienda;
	private String nombre;
	private String direccion;
	@JoinColumn(name = "año_arriendo")
	private Date añoArriendo;
	@JoinColumn(name = "pago_arriendo")
	private Date pagoArriendo;
	
	@OneToMany(mappedBy = "tienda")
	List<Trabajador> trabajadors;

	public Tienda() {
		
	}

	public Tienda(String idtienda, String nombre, String direccion, Date añoArriendo, Date pagoArriendo,
			List<Trabajador> trabajadors) {
		
		this.idtienda = idtienda;
		this.nombre = nombre;
		this.direccion = direccion;
		this.añoArriendo = añoArriendo;
		this.pagoArriendo = pagoArriendo;
		this.trabajadors = trabajadors;
	}

	public String getIdtienda() {
		return idtienda;
	}

	public void setIdtienda(String idtienda) {
		this.idtienda = idtienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getAñoArriendo() {
		return añoArriendo;
	}

	public void setAñoArriendo(Date añoArriendo) {
		this.añoArriendo = añoArriendo;
	}

	public Date getPagoArriendo() {
		return pagoArriendo;
	}

	public void setPagoArriendo(Date pagoArriendo) {
		this.pagoArriendo = pagoArriendo;
	}

	public List<Trabajador> getTrabajadors() {
		return trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}
	
	
}
