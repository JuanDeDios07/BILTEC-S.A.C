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

import com.biltec.ProyectoFinal.entity.Persona;
import com.biltec.ProyectoFinal.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	PersonaService personaservice;
	
	//LISTAR 
		@GetMapping("/lis")
		public List<Persona> listar(){
			return personaservice.listar();	
		}
		//REGISTRAR
		@PostMapping("/reg")
		public String Registra01(@RequestBody Persona persona) {
			if (personaservice.registra01(persona)) {
				return "Se ha Registrado la persona";
			}else {return "No se ha Registrado la persona";}
		}
		//ACTUALIZAR
		
		@PutMapping("/ac")
		public String Actualizar01(@RequestBody Persona persona) {
			if (personaservice.actualizar01(persona)) {
				return "Se ha Actualizo la persona";
			}else {return "No se ha Actualizo la persona";
			   }
			}
		//ELIMINAR
		@DeleteMapping("/eli/{cod}")
		public String eliminarid(@PathVariable String cod) {
			if (personaservice.eliminar(cod)) {
				return "Se ha eliminado el persona";
			}else {return "No se ha borrado el persona";}
		}
		
		//LISTAR POR ID
		
		@GetMapping("/list/{id}")
		 public Optional<Persona>getUserById(@PathVariable("id")String id){
			 return personaservice.ListarId(id);
		 }
		
}
