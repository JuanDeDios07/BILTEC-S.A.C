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

import com.biltec.ProyectoFinal.entity.Tienda;
import com.biltec.ProyectoFinal.service.TiendaService;

@RestController
@RequestMapping("/tienda")
public class TiendaController {

	@Autowired
	TiendaService tiendaservice;
	
	//LISTAR 
		@GetMapping("/lis")
		public List<Tienda> listar(){
			return tiendaservice.listar();	
		}
		//REGISTRAR
		@PostMapping("/reg")
		public String Registra01(@RequestBody Tienda tienda) {
			if (tiendaservice.registra01(tienda)) {
				return "Se ha Registrado la tienda";
			}else {return "No se ha Registrado la tienda";}
		}
		//ACTUALIZAR
		
		@PutMapping("/ac")
		public String Actualizar01(@RequestBody Tienda tienda) {
			if (tiendaservice.actualizar01(tienda)) {
				return "Se ha Actualizo la tienda";
			}else {return "No se ha Actualizo la tienda";
			   }
			}
		//ELIMINAR
		@DeleteMapping("/eli/{cod}")
		public String eliminarid(@PathVariable String cod) {
			if (tiendaservice.eliminar(cod)) {
				return "Se ha eliminado la tienda";
			}else {return "No se ha borrado la tienda";}
		}
		
		//LISTAR POR ID
		
		@GetMapping("/list/{id}")
		 public Optional<Tienda>getUserById(@PathVariable("id")String id){
			 return tiendaservice.ListarId(id);
		 }
}
