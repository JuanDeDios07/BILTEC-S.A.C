package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.TipoServicio;
import com.biltec.ProyectoFinal.repository.TipoServicioRepository;

@Service
public class TipoServicioServiceImpl implements TipoServicioService{

	@Autowired
	TipoServicioRepository tiposerviciorepository;

	@Override
	public List<TipoServicio> listar() {
		
		return tiposerviciorepository.findAll();
	}

	@Override
	public TipoServicio registrar(TipoServicio tiposervicio) {
		
		return tiposerviciorepository.save(tiposervicio);
	}

	@Override
	public TipoServicio actualizar(TipoServicio tiposervicio) {
		
		return tiposerviciorepository.save(tiposervicio);
	}

	@Override
	public boolean eliminar(String idservicio) {
		try {
			Optional<TipoServicio> u=ListarId(idservicio);
			tiposerviciorepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
		}
	}

	@Override
	public Optional<TipoServicio> ListarId(String idservicio) {
		
		return tiposerviciorepository.findById(idservicio);
	}
	
	
	
}
