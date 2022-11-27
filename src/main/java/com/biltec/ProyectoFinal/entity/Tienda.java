package com.biltec.ProyectoFinal.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "tienda")
@Entity(name = "Tienda")
public class Tienda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idtienda;
	private String nombre;
	private String direccion;
	@JoinColumn(name = "año_arriendo")
	private Date añoArriendo;
	@JoinColumn(name = "pago_arriendo")
	private Date pagoArriendo;
}
