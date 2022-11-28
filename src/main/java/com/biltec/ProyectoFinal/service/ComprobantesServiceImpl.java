package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Comprobantes;
import com.biltec.ProyectoFinal.repository.ComprobanteRepository;

@Service
public class ComprobantesServiceImpl implements ComprobantesService{

	@Autowired
	ComprobanteRepository comprobanteRepository;

	@Override
	public List<Comprobantes> listar() {
		
		return comprobanteRepository.findAll();
	}

	@Override
	public Comprobantes registrar(Comprobantes comprobantes) {
		
		return comprobanteRepository.save(comprobantes);
	}

	@Override
	public Comprobantes actualizar(Comprobantes comprobantes) {
		
		return comprobanteRepository.save(comprobantes);
	}

	@Override
	public boolean eliminar(String nomCom) {
		try {
			Optional<Comprobantes> u=ListarId(nomCom);
			comprobanteRepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<Comprobantes> ListarId(String nomCom) {
		
		return comprobanteRepository.findById(nomCom);
	}
	
	
}
