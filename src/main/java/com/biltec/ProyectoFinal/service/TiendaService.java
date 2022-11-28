package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Tienda;

public interface TiendaService {

   public	List<Tienda> listar();
	
	public	Tienda registrar(Tienda tienda);
		
		
	public	Tienda actualizar(Tienda tienda);
		 
	public	boolean eliminar(String idtienda);
		 
	public	Optional<Tienda> ListarId(String idtienda);
	
	public	 boolean registra01(Tienda tienda);
	
	public	boolean actualizar01(Tienda tienda);
}
