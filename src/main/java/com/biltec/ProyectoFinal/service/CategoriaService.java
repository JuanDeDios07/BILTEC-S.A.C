package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Categoria;


public interface CategoriaService {

	public	List<Categoria> listar();
	
	public	Categoria registrar(Categoria categoria);
		
		
	public	Categoria actualizar(Categoria categoria);
		 
	public	 boolean eliminar(String idcat);
		 
	public	 Optional<Categoria> ListarId(String idcat);
}
