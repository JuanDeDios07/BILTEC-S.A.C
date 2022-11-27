package com.biltec.ProyectoFinal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

}
