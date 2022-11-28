package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Ventas;


public interface VentasService {


	    public	List<Ventas> listar();
		
		public	Ventas registrar(Ventas ventas);
						
		public	Ventas actualizar(Ventas ventas);
			 
		public	boolean eliminar(String idventas);
			 
		public	Optional<Ventas> ListarId(String idventas);
}
