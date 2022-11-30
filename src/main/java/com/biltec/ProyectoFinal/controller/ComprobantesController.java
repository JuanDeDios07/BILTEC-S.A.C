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

import com.biltec.ProyectoFinal.entity.Comprobantes;
import com.biltec.ProyectoFinal.service.ComprobantesService;

@RestController
@RequestMapping("/comprobantes")
public class ComprobantesController {

	@Autowired 
	ComprobantesService comprobantesService;
	
	//LISTAR 
		@GetMapping("/lis")
		public List<Comprobantes> listar(){
			return comprobantesService.listar();	
		}
		//REGISTRAR
		@PostMapping("/reg")
		public String Registra01(@RequestBody Comprobantes comprobantes) {
			if (comprobantesService.registra01(comprobantes)) {
				return "Se ha Registrado la Comprobantes";
			}else {return "No se ha Registrado la Comprobantes";}
		}
		//ACTUALIZAR
		
		@PutMapping("/ac")
		public String Actualizar01(@RequestBody Comprobantes comprobantes) {
			if (comprobantesService.actualizar01(comprobantes)) {
				return "Se ha Actualizo la Comprobantes";
			}else {return "No se ha Actualizo la Comprobantes";
			   }
			}
		//ELIMINAR
		@DeleteMapping("/eli/{cod}")
		public String eliminarid(@PathVariable String cod) {
			if (comprobantesService.eliminar(cod)) {
				return "Se ha eliminado el Comprobantes";
			}else {return "No se ha borrado el Comprobantes";}
		}
		
		//LISTAR POR ID
		
		@GetMapping("/list/{id}")
		 public Optional<Comprobantes>getUserById(@PathVariable("id")String id){
			 return comprobantesService.ListarId(id);
		 }
}
