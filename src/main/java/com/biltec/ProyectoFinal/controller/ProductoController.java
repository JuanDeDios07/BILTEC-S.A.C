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

import com.biltec.ProyectoFinal.entity.Producto;
import com.biltec.ProyectoFinal.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService productoservice;
	
	//LISTAR 
			@GetMapping("/lis")
			public List<Producto> listar(){
				return productoservice.listar();	
			}
			//REGISTRAR
			@PostMapping("/reg")
			public String Registra01(@RequestBody Producto producto) {
				if (productoservice.registra01(producto)) {
					return "Se ha Registrado el producto";
				}else {return "No se ha Registrado el producto";}
			}
			//ACTUALIZAR
			
			@PutMapping("/ac")
			public String Actualizar01(@RequestBody Producto producto) {
				if (productoservice.actualizar01(producto)) {
					return "Se ha Actualizo el producto";
				}else {return "No se ha Actualizo el producto";
				   }
				}
			//ELIMINAR
			@DeleteMapping("/eli/{cod}")
			public String eliminarid(@PathVariable String cod) {
				if (productoservice.eliminar(cod)) {
					return "Se ha eliminado el producto";
				}else {return "No se ha borrado el producto";}
			}
			
			//LISTAR POR ID
			
			@GetMapping("/list/{id}")
			 public Optional<Producto>getUserById(@PathVariable("id")String id){
				 return productoservice.ListarId(id);
			 }
}
