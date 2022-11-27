package com.biltec.ProyectoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "usuario")
@Entity(name = "Usuario")
public class Usuario {

	@Id
	private String idusuario;
	
	private String idrol;
	private String email;
	private String clave;
}