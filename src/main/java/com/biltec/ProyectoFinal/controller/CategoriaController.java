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

import com.biltec.ProyectoFinal.entity.Categoria;
import com.biltec.ProyectoFinal.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	CategoriaService categoriaService;
	
	//LISTAR 
	@GetMapping("/lis")
	public List<Categoria> listar(){
		return categoriaService.listar();	
	}
	//REGISTRAR
	@PostMapping("/reg")
	public String Registra01(@RequestBody Categoria categoria) {
		if (categoriaService.registra01(categoria)) {
			return "Se ha Registrado la Categoria";
		}else {return "No se ha Registrado la Categoria";}
	}
	//ACTUALIZAR
	
	@PutMapping("/ac")
	public String Actualizar01(@RequestBody Categoria categoria) {
		if (categoriaService.actualizar01(categoria)) {
			return "Se ha Actualizo la Categoria";
		}else {return "No se ha Actualizo la Categoria";
		   }
		}
	//ELIMINAR
	@DeleteMapping("/eli/{cod}")
	public String eliminarid(@PathVariable Integer cod) {
		if (categoriaService.eliminar(cod)) {
			return "Se ha eliminado el Categoria";
		}else {return "No se ha borrado el Categoria";}
	}
	
	//LISTAR POR ID
	
	@GetMapping("/list/{id}")
	 public Optional<Categoria>getUserById(@PathVariable("id")Integer id){
		 return categoriaService.ListarId(id);
	 }
	
	
}
