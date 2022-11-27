package com.biltec.ProyectoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tipo_servicio")
@Entity(name = "TipoServicio")
public class TipoServicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idservicio;
	private String servicio;
}
