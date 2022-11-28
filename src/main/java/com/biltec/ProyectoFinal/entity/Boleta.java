package com.biltec.ProyectoFinal.entity;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "boleta")
@Entity(name = "Boleta")
public class Boleta {
	
	@Id
	@JoinColumn(name = "num_boleta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numBoleta;
	@Column(length = 8)
	private String dni;
	private Date fecha;
	@Column(length = 90)
	private String señor;
	@Column(length = 50)
	private String direccion;
	private int cantidad;
	@Column(length = 120)
	private String descripcion;
	private double importe;
	private double total;
	
	@OneToMany(mappedBy = "boleta")
	List<Comprobantes> tipocomprobantes;

	public Boleta() {
		
	}

	public Boleta(Integer numBoleta, String dni, Date fecha, String señor, String direccion, int cantidad,
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

	public Integer getNumBoleta() {
		return numBoleta;
	}

	public void setNumBoleta(Integer numBoleta) {
		this.numBoleta = numBoleta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
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
