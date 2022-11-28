package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Boleta;

	public interface BoletaService {
		
	public List<Boleta> listar();
	
		//NO USAR
	public Boleta registrar(Boleta boleta);
		//NO USAR
	public	Boleta actualizar(Boleta boleta);
	
		 
	public	 boolean eliminar(Integer numB);
		 
	public	 Optional<Boleta> ListarId(Integer numB);

	
	public	 boolean registra01(Boleta boleta);
	
	public	boolean actualizar01(Boleta boleta);
}
