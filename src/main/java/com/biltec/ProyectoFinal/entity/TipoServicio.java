package com.biltec.ProyectoFinal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "tiposervicio")
@Entity(name = "TipoServicio")
public class TipoServicio {
	@Id
	private String idservicio;
	private String servicios;
	
	@OneToMany(mappedBy = "tiposervicio")
	List<BoletaServicio> boletaservicios;

	public TipoServicio() {
		
	}

	public TipoServicio(String idservicio, String servicios, List<BoletaServicio> boletaservicios) {
		
		this.idservicio = idservicio;
		this.servicios = servicios;
		this.boletaservicios = boletaservicios;
	}

	public String getIdservicio() {
		return idservicio;
	}

	public void setIdservicio(String idservicio) {
		this.idservicio = idservicio;
	}

	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

	public List<BoletaServicio> getBoletaservicios() {
		return boletaservicios;
	}

	public void setBoletaservicios(List<BoletaServicio> boletaservicios) {
		this.boletaservicios = boletaservicios;
	}
	
	
}
