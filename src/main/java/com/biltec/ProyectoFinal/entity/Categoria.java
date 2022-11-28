package com.biltec.ProyectoFinal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "categoria")
@Entity(name = "Categoria")
public class Categoria {
	@Id
	private String idcategoria;
	private String nombre;
	
	@OneToMany(mappedBy = "categoria")
	List<Producto> producto;

	public Categoria() {
		
	}

	public Categoria(String idcategoria, String nombre, List<Producto> producto) {
		
		this.idcategoria = idcategoria;
		this.nombre = nombre;
		this.producto = producto;
	}

	public String getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	
	
}
