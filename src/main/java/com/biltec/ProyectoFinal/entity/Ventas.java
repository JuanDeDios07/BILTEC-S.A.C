 package com.biltec.ProyectoFinal.entity;


import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "ventas")
@Entity(name = "Ventas")
public class Ventas {

	@Id
	private String idventas;
	
	@JoinColumn(name = "num_comprobante")
	private Integer numComprobante;
	@JoinColumn(name = "total_ventas")
	private double totalVentas;
	private Date fecha;
	private double precio;
	private int cantidad;
	
	@OneToMany(mappedBy = "ventas")
	List<Ingreso> ingresos;
	
	@ManyToOne
	@JoinColumn(name = "nombreComprobante")
	 Comprobantes comprobantes;
	
	
	@ManyToOne
	@JoinColumn(name = "idpersona")
	Persona persona;


	public Ventas() {
	}


	public Ventas(String idventas, Integer numComprobante, double totalVentas, Date fecha, double precio, int cantidad,
			List<Ingreso> ingresos, Comprobantes comprobantes, Persona persona) {
		this.idventas = idventas;
		this.numComprobante = numComprobante;
		this.totalVentas = totalVentas;
		this.fecha = fecha;
		this.precio = precio;
		this.cantidad = cantidad;
		this.ingresos = ingresos;
		this.comprobantes = comprobantes;
		this.persona = persona;
	}


	public String getIdventas() {
		return idventas;
	}


	public void setIdventas(String idventas) {
		this.idventas = idventas;
	}


	public Integer getNumComprobante() {
		return numComprobante;
	}


	public void setNumComprobante(Integer numComprobante) {
		this.numComprobante = numComprobante;
	}


	public double getTotalVentas() {
		return totalVentas;
	}


	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public List<Ingreso> getIngresos() {
		return ingresos;
	}


	public void setIngresos(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}


	public Comprobantes getComprobantes() {
		return comprobantes;
	}


	public void setComprobantes(Comprobantes comprobantes) {
		this.comprobantes = comprobantes;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}