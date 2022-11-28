package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Trabajador;



public interface TrabajadorService {

	   public	List<Trabajador> listar();
		
		public	Trabajador registrar(Trabajador trabajador);
			
			
		public	Trabajador actualizar(Trabajador trabajador);
			 
		public	boolean eliminar(String dni);
			 
		public	Optional<Trabajador> ListarId(String dni);
}
