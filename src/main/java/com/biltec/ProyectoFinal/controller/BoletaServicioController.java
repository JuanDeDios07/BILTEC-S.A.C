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

import com.biltec.ProyectoFinal.entity.BoletaServicio;
import com.biltec.ProyectoFinal.service.BoletaServicioService;

@RestController
@RequestMapping("/boletaservicio")
public class BoletaServicioController {

	@Autowired
	 BoletaServicioService boletaServicioService;
	
	//LISTAR 
	@GetMapping("/lis")
	public List<BoletaServicio> listar(){
		return boletaServicioService.listar();	
	}
	//REGISTRAR
	@PostMapping("/reg")
	public String Registra01(@RequestBody BoletaServicio boletaServicio) {
		if (boletaServicioService.registra01(boletaServicio)) {
			return "Se ha Registrado la BoletaServicio";
		}else {return "No se ha Registrado la BoletaServicio";}
	}
	//ACTUALIZAR
	
	@PutMapping("/ac")
	public String Actualizar01(@RequestBody BoletaServicio boletaServicio) {
		if (boletaServicioService.actualizar01(boletaServicio)) {
			return "Se ha Actualizo la BoletaServicio";
		}else {return "No se ha Actualizo la BoletaServicio";
		   }
		}
	//ELIMINAR
	@DeleteMapping("/eli/{cod}")
	public String eliminarid(@PathVariable String cod) {
		if (boletaServicioService.eliminar(cod)) {
			return "Se ha eliminado el BoletaServicio";
		}else {return "No se ha borrado el BoletaServicio";}
	}
	
	//LISTAR POR ID
	
	@GetMapping("/list/{id}")
	 public Optional<BoletaServicio>getUserById(@PathVariable("id")String id){
		 return boletaServicioService.ListarId(id);
	 }
	
	
}
