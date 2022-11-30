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

import com.biltec.ProyectoFinal.entity.Rol;
import com.biltec.ProyectoFinal.service.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {

	@Autowired
	RolService rolservice;
	
	//LISTAR 
	@GetMapping("/lis")
	public List<Rol> listar(){
		return rolservice.listar();	
	}
	//REGISTRAR
	@PostMapping("/reg")
	public String Registra01(@RequestBody Rol rol) {
		if (rolservice.registra01(rol)) {
			return "Se ha Registrado el rol";
		}else {return "No se ha Registrado el rol";}
	}
	//ACTUALIZAR
	
	@PutMapping("/ac")
	public String Actualizar01(@RequestBody Rol rol) {
		if (rolservice.actualizar01(rol)) {
			return "Se ha Actualizo el rol";
		}else {return "No se ha Actualizo el rol";
		   }
		}
	//ELIMINAR
	@DeleteMapping("/eli/{cod}")
	public String eliminarid(@PathVariable String cod) {
		if (rolservice.eliminar(cod)) {
			return "Se ha eliminado el rol";
		}else {return "No se ha borrado el rol";}
	}
	
	//LISTAR POR ID
	
	@GetMapping("/list/{id}")
	 public Optional<Rol>getUserById(@PathVariable("id")String id){
		 return rolservice.ListarId(id);
	 }
}
