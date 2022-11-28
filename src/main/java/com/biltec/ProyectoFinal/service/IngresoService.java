package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;
import com.biltec.ProyectoFinal.entity.Ingreso;

public interface IngresoService {

	    public List<Ingreso> listar();
	
	    public	Ingreso registrar(Ingreso ingreso);
				
		public	Ingreso actualizar(Ingreso ingreso);
			 
		public	 boolean eliminar(String idingre);
			 
		public	 Optional<Ingreso> ListarId(String idingre);
		
}
