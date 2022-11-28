package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Factura;
import com.biltec.ProyectoFinal.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaService{

	@Autowired
	FacturaRepository facturaRepository;

	@Override
	public List<Factura> listar() {

		return facturaRepository.findAll();
	}

	@Override
	public Factura registrar(Factura factura) {
		
		return facturaRepository.save(factura);
	}

	@Override
	public Factura actualizar(Factura factura) {
		
		return facturaRepository.save(factura);
	}

	@Override
	public boolean eliminar(Integer nomFac) {
		try {
			Optional<Factura> u=ListarId(nomFac);
			facturaRepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<Factura> ListarId(Integer nomFac) {
	
		return facturaRepository.findById(nomFac);
	}
	
	
}
