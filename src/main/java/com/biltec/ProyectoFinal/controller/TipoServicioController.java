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

import com.biltec.ProyectoFinal.entity.TipoServicio;
import com.biltec.ProyectoFinal.service.TipoServicioService;

@RestController
@RequestMapping("/tiposervicio")
public class TipoServicioController {

	@Autowired
	TipoServicioService tiposervicioservice;
	
	//LISTAR 
			@GetMapping("/lis")
			public List<TipoServicio> listar(){
				return tiposervicioservice.listar();	
			}
			//REGISTRAR
			@PostMapping("/reg")
			public String Registra01(@RequestBody TipoServicio tiposervicio) {
				if (tiposervicioservice.registra01(tiposervicio)) {
					return "Se ha Registrado el tipo_servicio";
				}else {return "No se ha Registrado el tipo_servicio";}
			}
			//ACTUALIZAR
			
			@PutMapping("/ac")
			public String Actualizar01(@RequestBody TipoServicio tipoServicio) {
				if (tiposervicioservice.actualizar01(tipoServicio)) {
					return "Se ha Actualizo el tipo_servicio";
				}else {return "No se ha Actualizo el tipo_servicio";
				   }
				}
			//ELIMINAR
			@DeleteMapping("/eli/{cod}")
			public String eliminarid(@PathVariable String cod) {
				if (tiposervicioservice.eliminar(cod)) {
					return "Se ha eliminado el tipo_servicio";
				}else {return "No se ha borrado el tipo_servicio";}
			}
			
			//LISTAR POR ID
			
			@GetMapping("/list/{id}")
			 public Optional<TipoServicio>getUserById(@PathVariable("id")String id){
				 return tiposervicioservice.ListarId(id);
			 }
}
