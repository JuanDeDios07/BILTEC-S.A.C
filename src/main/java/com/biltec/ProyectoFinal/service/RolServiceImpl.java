package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Rol;
import com.biltec.ProyectoFinal.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	RolRepository rolrepository;

	@Override
	public List<Rol> listar() {
		
		return rolrepository.findAll();
	}

	@Override
	public Rol registrar(Rol rol) {
		
		return rolrepository.save(rol);
	}

	@Override
	public Rol actualizar(Rol rol) {
		
		return rolrepository.save(rol);
	}

	@Override
	public boolean eliminar(String idrol) {
		try {
			Optional<Rol> u=ListarId(idrol);
			rolrepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}
	
	@Override
	public Optional<Rol> ListarId(String idrol) {
		
		return rolrepository.findById(idrol);
	}

	@Override
	public boolean registra01(Rol rol) {
		try {
			rolrepository.save(rol);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean actualizar01(Rol rol) {
		try {
			rolrepository.save(rol);
			return true;
		}catch(Exception e) {
		return false;
	}
	}
	
	
}
