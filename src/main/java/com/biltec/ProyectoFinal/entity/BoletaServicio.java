package com.biltec.ProyectoFinal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(name = "boletaServicio")
@Entity(name = "BoletaServicio")

public class BoletaServicio {
	@Id
	private Integer idboletaservicio;
	@Column(length = 50)
	private String garantia;
	@JoinColumn(name = "precio_servico")
	private double precioSrevico;
	@Column(length = 10)
	private String telefono;
	private Date fecha;
	@JoinColumn(name = "tipo_producto")
	@Column(length = 50)
	private String tipoProducto;
	@Column(length = 50)
	private String marca;
	@Column(length = 50)
	private String modelo;
	
	@ManyToOne
	@JoinColumn(name = "idpersona")
	Persona persona;
	
	@ManyToOne
	@JoinColumn(name = "idservicio")
	TipoServicio tiposervicio;

	public BoletaServicio() {
		
	}

	public BoletaServicio(Integer idboletaservicio, String garantia, double precioSrevico, String telefono, Date fecha,
			String tipoProducto, String marca, String modelo, Persona persona, TipoServicio tiposervicio) {
		this.idboletaservicio = idboletaservicio;
		this.garantia = garantia;
		this.precioSrevico = precioSrevico;
		this.telefono = telefono;
		this.fecha = fecha;
		this.tipoProducto = tipoProducto;
		this.marca = marca;
		this.modelo = modelo;
		this.persona = persona;
		this.tiposervicio = tiposervicio;
	}

	public Integer getIdboletaservicio() {
		return idboletaservicio;
	}

	public void setIdboletaservicio(Integer idboletaservicio) {
		this.idboletaservicio = idboletaservicio;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public double getPrecioSrevico() {
		return precioSrevico;
	}

	public void setPrecioSrevico(double precioSrevico) {
		this.precioSrevico = precioSrevico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public TipoServicio getTiposervicio() {
		return tiposervicio;
	}

	public void setTiposervicio(TipoServicio tiposervicio) {
		this.tiposervicio = tiposervicio;
	}

	
	
	
}
