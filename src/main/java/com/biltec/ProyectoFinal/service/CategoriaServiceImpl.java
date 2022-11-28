package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Categoria;
import com.biltec.ProyectoFinal.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> listar() {
		
		return categoriaRepository.findAll();
	}

	@Override
	public Categoria registrar(Categoria categoria) {
		
		return categoriaRepository.save(categoria);
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		
		return categoriaRepository.save(categoria);
	}

	@Override
	public boolean eliminar(Integer idcat) {
		try {
			Optional<Categoria> u=ListarId(idcat);
			categoriaRepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<Categoria> ListarId(Integer idcat) {
		
		return categoriaRepository.findById(idcat);
	}

	@Override
	public boolean registra01(Categoria categoria) {
		try {
			categoriaRepository.save(categoria);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean actualizar01(Categoria categoria) {
		try {
			categoriaRepository.save(categoria);
			return true;
		}catch(Exception e) {
		return false;
	}
	}
	
	
}
