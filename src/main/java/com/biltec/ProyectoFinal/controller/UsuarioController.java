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

import com.biltec.ProyectoFinal.entity.Usuario;
import com.biltec.ProyectoFinal.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired 
	UsuarioService usuarioService;
	
	//LISTAR 
		@GetMapping("/lis")
		public List<Usuario> listar(){
			return usuarioService.listar();	
		}
		//REGISTRAR
		@PostMapping("/reg")
		public String Registra01(@RequestBody Usuario usuario) {
			if (usuarioService.registra01(usuario)) {
				return "Se ha Registrado la Usuario";
			}else {return "No se ha Registrado la Usuario";}
		}
		//ACTUALIZAR
		
		@PutMapping("/ac")
		public String Actualizar01(@RequestBody Usuario usuario) {
			if (usuarioService.actualizar01(usuario)) {
				return "Se ha Actualizo la Usuario";
			}else {return "No se ha Actualizo la Usuario";
			   }
			}
		//ELIMINAR
		@DeleteMapping("/eli/{cod}")
		public String eliminarid(@PathVariable String cod) {
			if (usuarioService.eliminar(cod)) {
				return "Se ha eliminado el Usuario";
			}else {return "No se ha borrado el Usuario";}
		}
		
		//LISTAR POR ID
		
		@GetMapping("/list/{id}")
		 public Optional<Usuario>getUserById(@PathVariable("id")String id){
			 return usuarioService.ListarId(id);
		 }
}
