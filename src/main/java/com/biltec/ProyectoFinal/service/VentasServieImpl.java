package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Ventas;
import com.biltec.ProyectoFinal.repository.VentasRepository;

@Service
public class VentasServieImpl implements VentasService{

	@Autowired
	VentasRepository ventasRepository;

	@Override
	public List<Ventas> listar() {
		
		return ventasRepository.findAll();
	}

	@Override
	public Ventas registrar(Ventas ventas) {
		
		return ventasRepository.save(ventas);
	}

	@Override
	public Ventas actualizar(Ventas ventas) {
	
		return ventasRepository.save(ventas);
	}

	@Override
	public boolean eliminar(String idventas) {
		try {
			Optional<Ventas> u=ListarId(idventas);
			ventasRepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<Ventas> ListarId(String idventas) {
		
		return ventasRepository.findById(idventas);
	}

	@Override
	public boolean registra01(Ventas ventas) {
		try {
			ventasRepository.save(ventas);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean actualizar01(Ventas ventas) {
		try {
			ventasRepository.save(ventas);
			return true;
		}catch(Exception e) {
		return false;
	}
	}
	
	
}
