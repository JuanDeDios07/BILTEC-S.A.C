package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Boleta;

	public interface BoletaService {
		
	public	List<Boleta> listar();
		
	public	Boleta registrar(Boleta boleta);
		
		
	public	Boleta actualizar(Boleta boleta);
		 
	public	 boolean eliminar(String numB);
		 
	public	 Optional<Boleta> ListarId(String numB);

}
