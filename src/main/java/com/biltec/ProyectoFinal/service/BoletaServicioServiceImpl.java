package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.BoletaServicio;
import com.biltec.ProyectoFinal.repository.BoletaServicioRepository;

@Service
public class BoletaServicioServiceImpl implements BoletaServicioService {

	@Autowired
    BoletaServicioRepository boletaServicioRepository;

	@Override
	public List<BoletaServicio> listar() {
		
		return boletaServicioRepository.findAll();
	}

	@Override
	public BoletaServicio registrar(BoletaServicio boletaServicio) {
	
		return boletaServicioRepository.save(boletaServicio);
	}

	@Override
	public BoletaServicio actualizar(BoletaServicio boletaServicio) {
		
		return boletaServicioRepository.save(boletaServicio);
	}

	@Override
	public boolean eliminar(String idboletaSer) {
		try {
			Optional<BoletaServicio> u=ListarId(idboletaSer);
			boletaServicioRepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<BoletaServicio> ListarId(String idboletaSer) {
		
		return boletaServicioRepository.findById(idboletaSer);
	}

	@Override
	public boolean registra01(BoletaServicio boletaServicio) {
		try {
			boletaServicioRepository.save(boletaServicio);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean actualizar01(BoletaServicio boletaServicio) {
		try {
			boletaServicioRepository.save(boletaServicio);
			return true;
		}catch(Exception e) {
		return false;
	}
	}


}
