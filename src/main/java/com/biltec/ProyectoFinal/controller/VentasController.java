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

import com.biltec.ProyectoFinal.entity.Ventas;
import com.biltec.ProyectoFinal.service.VentasService;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	
	@Autowired
	VentasService  ventasService;

	//LISTAR 
		@GetMapping("/lis")
		public List<Ventas> listar(){
			return ventasService.listar();	
		}
		//REGISTRAR
		@PostMapping("/reg")
		public String Registra01(@RequestBody Ventas ventas) {
			if (ventasService.registra01(ventas)) {
				return "Se ha Registrado la Ventas";
			}else {return "No se ha Registrado la Ventas";}
		}
		//ACTUALIZAR
		
		@PutMapping("/ac")
		public String Actualizar01(@RequestBody Ventas ventas) {
			if (ventasService.actualizar01(ventas)) {
				return "Se ha Actualizo la Ventas";
			}else {return "No se ha Actualizo la Ventas";
			   }
			}
		//ELIMINAR
		@DeleteMapping("/eli/{cod}")
		public String eliminarid(@PathVariable String cod) {
			if (ventasService.eliminar(cod)) {
				return "Se ha eliminado el Ventas";
			}else {return "No se ha borrado el Ventas";}
		}
		
		//LISTAR POR ID
		
		@GetMapping("/list/{id}")
		 public Optional<Ventas>getUserById(@PathVariable("id")String id){
			 return ventasService.ListarId(id);
		 }
}
