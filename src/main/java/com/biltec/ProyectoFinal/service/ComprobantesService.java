package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Comprobantes;


public interface ComprobantesService {

    public	List<Comprobantes> listar();
	
	public	Comprobantes registrar(Comprobantes comprobantes);
		
		
	public	Comprobantes actualizar(Comprobantes comprobantes);
		 
	public	 boolean eliminar(String nomCom);
		 
	public	 Optional<Comprobantes> ListarId(String nomCom);
	
	public	 boolean registra01(Comprobantes comprobantes);
		
		public	boolean actualizar01(Comprobantes comprobantes);
}
