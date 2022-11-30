package com.biltec.ProyectoFinal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biltec.ProyectoFinal.entity.Factura;
import com.biltec.ProyectoFinal.service.FacturaService;

@RestController
@RequestMapping("/factura")
public class FacturaController {

@Autowired
FacturaService facturaService;

//LISTAR 
	@GetMapping("/lis")
	public List<Factura> listar(){
		return facturaService.listar();	
	}
	//REGISTRAR
	@PostMapping("/reg")
	public String Registra01(@RequestBody Factura factura) {
		if (facturaService.registra01(factura)) {
			return "Se ha Registrado la Factura";
		}else {return "No se ha Registrado la Factura";}
	}
	//ACTUALIZAR
	
	@PutMapping("/ac")
	public String Actualizar01(@RequestBody Factura factura) {
		if (facturaService.actualizar01(factura)) {
			return "Se ha Actualizo la Factura";
		}else {return "No se ha Actualizo la Factura";
		   }
		}
	//ELIMINAR
	@DeleteMapping("/eli/{cod}")
	public String eliminarid(@PathVariable Integer cod) {
		if (facturaService.eliminar(cod)) {
			return "Se ha eliminado el Factura";
		}else {return "No se ha borrado el Factura";}
	}
	
	//LISTAR POR ID
	
	@GetMapping("/list/{id}")
	 public Optional<Factura>getUserById(@PathVariable("id")Integer id){
		 return facturaService.ListarId(id);
	 }
}
