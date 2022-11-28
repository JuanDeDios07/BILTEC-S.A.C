package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Producto;

public interface ProductoService {

	public	List<Producto> listar();
	
	public	Producto registrar(Producto producto);
		
		
	public	Producto actualizar(Producto producto);
		 
	public	 boolean eliminar(String idproducto);
		 
	public	 Optional<Producto> ListarId(String idproducto);
}
