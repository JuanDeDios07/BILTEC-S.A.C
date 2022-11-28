package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Boleta;
import com.biltec.ProyectoFinal.repository.BoletaRepository;

@Service
public class BoletaServiceImpl implements BoletaService{

	@Autowired
    BoletaRepository boletaRepository;
	
	@Override
	public List<Boleta> listar() {
		return boletaRepository.findAll();
	}

	@Override
	public Boleta registrar(Boleta boleta) {
		return boletaRepository.save(boleta);
	}

	@Override
	public Boleta actualizar(Boleta boleta) {
		
		return boletaRepository.save(boleta);
	}

	@Override
	public boolean eliminar(Integer numB) {
		try {
			Optional<Boleta> u=ListarId(numB);
			boletaRepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<Boleta> ListarId(Integer numB) {
		
		return boletaRepository.findById(numB);
	}

	@Override
	public boolean registra01(Boleta boleta) {
		try {
			boletaRepository.save(boleta);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean actualizar01(Boleta boleta) {
		
		try {
			boletaRepository.save(boleta);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

}
