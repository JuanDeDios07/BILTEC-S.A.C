package com.biltec.ProyectoFinal.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "factura")
@Entity(name = "Factura")
public class Factura {
	@Id
	@JoinColumn(name = "num_factura")
	private String numFactura;
	@JoinColumn(name = "ruc")
	private int ruc;
	private Date fecha;
	private String señor;
	private String direccion;
	private String descripcion;
	@JoinColumn(name = "tipo_moneda")
	private String tipoMoneda;
	private int cantidad;
	private double igv;
	private double precio;
	private double total;

	@OneToMany(mappedBy = "factura")
	List<Comprobantes> tipocomprobantes;

	public Factura() {
		
	}

	public Factura(String numFactura, int ruc, Date fecha, String señor, String direccion, String descripcion,
			String tipoMoneda, int cantidad, double igv, double precio, double total,
			List<Comprobantes> tipocomprobantes) {
		
		this.numFactura = numFactura;
		this.ruc = ruc;
		this.fecha = fecha;
		this.señor = señor;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.tipoMoneda = tipoMoneda;
		this.cantidad = cantidad;
		this.igv = igv;
		this.precio = precio;
		this.total = total;
		this.tipocomprobantes = tipocomprobantes;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getSeñor() {
		return señor;
	}

	public void setSeñor(String señor) {
		this.señor = señor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Comprobantes> getTipocomprobantes() {
		return tipocomprobantes;
	}

	public void setTipocomprobantes(List<Comprobantes> tipocomprobantes) {
		this.tipocomprobantes = tipocomprobantes;
	}
	
	
}
