package com.biltec.ProyectoFinal.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "persona")
@Entity(name = "Persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idpersona;
	
	@JoinColumn(name = "tipo_persona")
	private String tipoPersona;
	private String nombre;
	@JoinColumn(name = "tipo_documento")
	private String tipoDocumento;
	@JoinColumn(name = "num_documento")
	private String numDocumento;
	private String direccion;
	private String telefono;
	
}
