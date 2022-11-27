package com.biltec.ProyectoFinal.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "ingreso")
@Entity(name = "Ingreso")
public class Ingreso {
	@Id
	private String idproducto;
	private String idventa;
	@JoinColumn(name = "precio_venta")
	private double precioVenta;
	private Date fecha;
	private String garantia;
}
