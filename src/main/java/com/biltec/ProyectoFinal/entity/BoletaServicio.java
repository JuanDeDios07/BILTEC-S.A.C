package com.biltec.ProyectoFinal.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "boletaServicio")
@Entity(name = "BoletaServicio")

public class BoletaServicio {
	@Id
	private String idpersona;
	private String idtienda;
	private String garantia;
	@JoinColumn(name = "precio_servico")
	private double precioSrevico;
	private String telefono;
	private Date fecha;
	@JoinColumn(name = "tipo_producto")
	private String tipoProducto;
	private String marca;
	private String modelo;
}
