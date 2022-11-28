package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Persona;

public interface PersonaService {

	public	List<Persona> listar();
	
	public	Persona registrar(Persona persona);
		
		
	public	Persona actualizar(Persona persona);
		 
	public	 boolean eliminar(String idpersona);
		 
	public	 Optional<Persona> ListarId(String idpersona);
}
