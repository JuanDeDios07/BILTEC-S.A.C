package com.biltec.ProyectoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "trabajador")
@Entity(name = "Trabajador")
public class Trabajador {

	@Id
	private String dni;
	
	private String idpersona;
	private String idtienda;
	private String idusuario;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
}