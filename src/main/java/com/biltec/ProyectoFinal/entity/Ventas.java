package com.biltec.ProyectoFinal.entity;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "ventas")
@Entity(name = "Ventas")
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idventas;
	
	private String idpersona;
	@JoinColumn(name = "tipo_comprobante")
	private String tipoComprobante;
	@JoinColumn(name = "num_comprobante")
	private Integer numComprobante;
	@JoinColumn(name = "total_ventas")
	private double totalVentas;
	private Date fecha;
	private double precio;
	private int cantidad;
	
}