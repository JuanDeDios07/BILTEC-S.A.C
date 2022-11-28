package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.TipoServicio;



public interface TipoServicioService {

    public	List<TipoServicio> listar();
	
	public	TipoServicio registrar(TipoServicio tiposervicio);
		
		
	public	TipoServicio actualizar(TipoServicio tiposervicio);
		 
	public	boolean eliminar(String idservicio);
		 
	public	Optional<TipoServicio> ListarId(String idservicio);
}
