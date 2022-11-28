package com.biltec.ProyectoFinal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "producto")
@Entity(name = "Producto")
public class Producto {

	@Id
	private String idproducto;
	
	private String nombre;
	private String modelo;
	private String marca;
	private String codigo;
	private int stock;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idcategoria")
	Categoria categoria;
	
	@OneToMany(mappedBy = "producto")
	List<Ingreso> ingresos;

	public Producto() {
		
	}

	public Producto(String idproducto, String nombre, String modelo, String marca, String codigo, int stock,
			String descripcion, Categoria categoria, List<Ingreso> ingresos) {
		
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.codigo = codigo;
		this.stock = stock;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.ingresos = ingresos;
	}

	public String getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	
	
}
