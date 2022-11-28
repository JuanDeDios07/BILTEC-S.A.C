package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.BoletaServicio;


public interface BoletaServicioService {

		public	List<BoletaServicio> listar();
			
		public	BoletaServicio registrar(BoletaServicio boletaServicio);
			
		public	BoletaServicio actualizar(BoletaServicio boletaServicio);
			 
		public	 boolean eliminar(String idboletaSer);
			 
		public	 Optional<BoletaServicio> ListarId(String idboletaSer);
		
		public	 boolean registra01(BoletaServicio boletaServicio);
		
		public	boolean actualizar01(BoletaServicio boletaServicio);
		
}
