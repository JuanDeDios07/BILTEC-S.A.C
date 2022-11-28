package com.biltec.ProyectoFinal.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "ingreso")
@Entity(name = "Ingreso")
public class Ingreso {
	@Id
	private String idingreso;
	
	@JoinColumn(name = "precio_venta")
	private double precioVenta;
	private Date fecha;
	private String garantia;
	
	@ManyToOne
	@JoinColumn(name = "idproducto")
	Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "idventa")
	Ventas ventas;

	public Ingreso() {
		
	}

	public Ingreso(String idingreso, double precioVenta, Date fecha, String garantia, Producto producto,
			Ventas ventas) {
		
		this.idingreso = idingreso;
		this.precioVenta = precioVenta;
		this.fecha = fecha;
		this.garantia = garantia;
		this.producto = producto;
		this.ventas = ventas;
	}

	public String getIdingreso() {
		return idingreso;
	}

	public void setIdingreso(String idingreso) {
		this.idingreso = idingreso;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Ventas getVentas() {
		return ventas;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}
	
	
}
