package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Trabajador;
import com.biltec.ProyectoFinal.repository.TrabajadorRepository;

@Service
public class TrabajadorServiceImpl implements TrabajadorService{

	@Autowired
	TrabajadorRepository trabajadorrepository;

	@Override
	public List<Trabajador> listar() {
		
		return trabajadorrepository.findAll();
	}

	@Override
	public Trabajador registrar(Trabajador trabajador) {
		
		return trabajadorrepository.save(trabajador);
	}

	@Override
	public Trabajador actualizar(Trabajador trabajador) {
		
		return trabajadorrepository.save(trabajador);
	}

	@Override
	public boolean eliminar(String dni) {
		try {
			Optional<Trabajador> u=ListarId(dni);
			trabajadorrepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
		}
	
	}

	@Override
	public Optional<Trabajador> ListarId(String dni) {
		
		return trabajadorrepository.findById(dni);
	}
	
	
}
