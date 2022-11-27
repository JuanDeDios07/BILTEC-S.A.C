package com.biltec.ProyectoFinal.entity;
import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
}
