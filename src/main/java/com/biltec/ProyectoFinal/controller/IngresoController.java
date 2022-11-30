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

import com.biltec.ProyectoFinal.entity.Ingreso;
import com.biltec.ProyectoFinal.service.IngresoService;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {
@Autowired
IngresoService ingresoService;

//LISTAR 
	@GetMapping("/lis")
	public List<Ingreso> listar(){
		return ingresoService.listar();	
	}
	//REGISTRAR
	@PostMapping("/reg")
	public String Registra01(@RequestBody Ingreso ingreso) {
		if (ingresoService.registra01(ingreso)) {
			return "Se ha Registrado la Ingreso";
		}else {return "No se ha Registrado la Ingreso";}
	}
	//ACTUALIZAR
	
	@PutMapping("/ac")
	public String Actualizar01(@RequestBody Ingreso ingreso) {
		if (ingresoService.actualizar01(ingreso)) {
			return "Se ha Actualizo la Ingreso";
		}else {return "No se ha Actualizo la Ingreso";
		   }
		}
	//ELIMINAR
	@DeleteMapping("/eli/{cod}")
	public String eliminarid(@PathVariable String cod) {
		if (ingresoService.eliminar(cod)) {
			return "Se ha eliminado el Ingreso";
		}else {return "No se ha borrado el Ingreso";}
	}
	
	//LISTAR POR ID
	
	@GetMapping("/list/{id}")
	 public Optional<Ingreso>getUserById(@PathVariable("id")String id){
		 return ingresoService.ListarId(id);
	 }
}
