package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Tienda;
import com.biltec.ProyectoFinal.repository.TiendaRepository;

@Service
public class TiendaServiceImple implements TiendaService{

	@Autowired
	TiendaRepository tiendarepository;

	@Override
	public List<Tienda> listar() {

		return tiendarepository.findAll();
	}

	@Override
	public Tienda registrar(Tienda tienda) {
	
		return tiendarepository.save(tienda);
	}

	@Override
	public Tienda actualizar(Tienda tienda) {
	
		return tiendarepository.save(tienda);
	}

	@Override
	public boolean eliminar(String idtienda) {
		try {
			Optional<Tienda> u=ListarId(idtienda);
			tiendarepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<Tienda> ListarId(String idtienda) {
		
		return tiendarepository.findById(idtienda);
	}

	@Override
	public boolean registra01(Tienda tienda) {
		try {
			tiendarepository.save(tienda);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean actualizar01(Tienda tienda) {
		try {
			tiendarepository.save(tienda);
			return true;
		}catch(Exception e) {
		return false;
	}
	}
	
	
}
