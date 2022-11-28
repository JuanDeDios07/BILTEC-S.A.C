package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Producto;
import com.biltec.ProyectoFinal.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

   @Autowired
   ProductoRepository productorepository;

@Override
public List<Producto> listar() {
	
	return productorepository.findAll();
}

@Override
public Producto registrar(Producto producto) {
	
	return productorepository.save(producto);
}

@Override
public Producto actualizar(Producto producto) {
	
	return productorepository.save(producto);
}

@Override
public boolean eliminar(String idproducto) {
	try {
		Optional<Producto> u=ListarId(idproducto);
		productorepository.delete(u.get());
		return true;
	}catch(Exception e) {
	return false;
}
}

@Override
public Optional<Producto> ListarId(String idproducto) {

	return productorepository.findById(idproducto);
}

@Override
public boolean registra01(Producto producto) {
	try {
		productorepository.save(producto);
		return true;
	}catch(Exception e) {
	return false;
}
}

@Override
public boolean actualizar01(Producto producto) {
	try {
		productorepository.save(producto);
		return true;
	}catch(Exception e) {
	return false;
}
}
   
	
}
