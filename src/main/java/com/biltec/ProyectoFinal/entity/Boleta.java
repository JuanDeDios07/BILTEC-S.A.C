package com.biltec.ProyectoFinal.entity;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "boleta")
@Entity(name = "Boleta")
public class Boleta {

	@Id
	@JoinColumn(name = "num_boleta")
	private String numBoleta;

	private char dni;
	private Date fecha;
	private String señor;
	private String direccion;
	private int cantidad;
	private String descripcion;
	private double importe;
	private double total;
	
	@OneToMany(mappedBy = "boleta")
	List<Comprobantes> tipocomprobantes;

	public Boleta() {
		
	}

	public Boleta(String numBoleta, char dni, Date fecha, String señor, String direccion, int cantidad,
			String descripcion, double importe, double total, List<Comprobantes> tipocomprobantes) {
		
		this.numBoleta = numBoleta;
		this.dni = dni;
		this.fecha = fecha;
		this.señor = señor;
		this.direccion = direccion;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.importe = importe;
		this.total = total;
		this.tipocomprobantes = tipocomprobantes;
	}

	public String getNumBoleta() {
		return numBoleta;
	}

	public void setNumBoleta(String numBoleta) {
		this.numBoleta = numBoleta;
	}

	public char getDni() {
		return dni;
	}

	public void setDni(char dni) {
		this.dni = dni;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
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
