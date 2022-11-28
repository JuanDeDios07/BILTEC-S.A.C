package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Ingreso;
import com.biltec.ProyectoFinal.repository.IngresoRepository;

@Service
public class IngresoServiceImpl implements IngresoService{

	@Autowired
	IngresoRepository ingresoRepository;

	@Override
	public List<Ingreso> listar() {
	
		return ingresoRepository.findAll();
	}

	@Override
	public Ingreso registrar(Ingreso ingreso) {
	
		return ingresoRepository.save(ingreso);
	}

	@Override
	public Ingreso actualizar(Ingreso ingreso) {
		
		return ingresoRepository.save(ingreso);
	}

	@Override
	public boolean eliminar(String idingre) {
		try {
			Optional<Ingreso> u=ListarId(idingre);
			ingresoRepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<Ingreso> ListarId(String idingre) {
		
		return ingresoRepository.findById(idingre);
	}
	
	
}
