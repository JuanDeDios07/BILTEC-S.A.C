package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Factura;


public interface FacturaService {

	   public List<Factura> listar();
		
	   public	Factura registrar(Factura factura);
			
			
		public	Factura actualizar(Factura factura);
			 
		public	 boolean eliminar(Integer nomFac);
			 
		public	 Optional<Factura> ListarId(Integer nomFac);
		
}
