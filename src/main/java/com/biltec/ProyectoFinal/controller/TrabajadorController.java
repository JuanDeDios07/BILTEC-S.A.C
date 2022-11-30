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

import com.biltec.ProyectoFinal.entity.Trabajador;
import com.biltec.ProyectoFinal.service.TrabajadorService;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {

	@Autowired
	TrabajadorService trabajadorService;
	
	//LISTAR 
		@GetMapping("/lis")
		public List<Trabajador> listar(){
			return trabajadorService.listar();	
		}
		//REGISTRAR
		@PostMapping("/reg")
		public String Registra01(@RequestBody Trabajador trabajador) {
			if (trabajadorService.registra01(trabajador)) {
				return "Se ha Registrado la Trabajador";
			}else {return "No se ha Registrado la Trabajador";}
		}
		//ACTUALIZAR
		
		@PutMapping("/ac")
		public String Actualizar01(@RequestBody Trabajador trabajador) {
			if (trabajadorService.actualizar01(trabajador)) {
				return "Se ha Actualizo la Trabajador";
			}else {return "No se ha Actualizo la Trabajador";
			   }
			}
		//ELIMINAR
		@DeleteMapping("/eli/{cod}")
		public String eliminarid(@PathVariable String cod) {
			if (trabajadorService.eliminar(cod)) {
				return "Se ha eliminado el Trabajador";
			}else {return "No se ha borrado el Trabajador";}
		}
		
		//LISTAR POR ID
		
		@GetMapping("/list/{id}")
		 public Optional<Trabajador>getUserById(@PathVariable("id")String id){
			 return trabajadorService.ListarId(id);
		 }
}
