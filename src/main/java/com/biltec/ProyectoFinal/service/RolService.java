package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;


import com.biltec.ProyectoFinal.entity.Rol;

public interface RolService {

    public	List<Rol> listar();
	
	public	Rol registrar(Rol rol);
		
		
	public	Rol actualizar(Rol rol);
		 
	public	boolean eliminar(String idrol);
		 
	public	Optional<Rol> ListarId(String idrol);
	
   public	 boolean registra01(Rol rol);
	
	public	boolean actualizar01(Rol rol);
}
