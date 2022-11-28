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
import com.biltec.ProyectoFinal.entity.Boleta;
import com.biltec.ProyectoFinal.service.BoletaService;

@RestController
@RequestMapping("/boleta")
public class BoletaController {

	@Autowired
	BoletaService boletaService;
	
	//LISTAR 
	@GetMapping("/lis")
	public List<Boleta> listar(){
		return boletaService.listar();	
	}
	//REGISTRAR
	@PostMapping("/reg")
	public String Registra01(@RequestBody Boleta boleta) {
		if (boletaService.registra01(boleta)) {
			return "Se ha Registrado la Boleta";
		}else {return "No se ha Registrado la Boleta";}
	}
	//ACTUALIZAR
	
	@PutMapping("/ac")
	public String Actualizar01(@RequestBody Boleta boleta) {
		if (boletaService.actualizar01(boleta)) {
			return "Se ha Actualizo la Boleta";
		}else {return "No se ha Actualizo la Boleta";
		   }
		}
	//ELIMINAR
	@DeleteMapping("/eli/{cod}")
	public String eliminarid(@PathVariable Integer cod) {
		if (boletaService.eliminar(cod)) {
			return "Se ha eliminado el personal";
		}else {return "No se ha borrado el personal";}
	}
	
	//LISTAR POR ID
	
	@GetMapping("/list/{id}")
	 public Optional<Boleta>getUserById(@PathVariable("id")Integer id){
		 return boletaService.ListarId(id);
	 }
	
	
}
