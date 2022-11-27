package com.biltec.ProyectoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "producto")
@Entity(name = "Producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idproducto;
	
	private String idcategoria;
	private String nombre;
	private String modelo;
	private String marca;
	private String codigo;
	private int stock;
	private String descripcion;
	
	
}
