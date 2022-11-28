package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Persona;
import com.biltec.ProyectoFinal.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	PersonaRepository personarepository;
	
	@Override
	public List<Persona> listar() {
	
		return personarepository.findAll();
	}

	@Override
	public Persona registrar(Persona persona) {
		
		return personarepository.save(persona);
	}

	@Override
	public Persona actualizar(Persona persona) {
		
		return personarepository.save(persona);
	}

	@Override
	public boolean eliminar(String idpersona) {
		try {
			Optional<Persona> u=ListarId(idpersona);
			personarepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
}
	@Override
	public Optional<Persona> ListarId(String idpersona) {
		
		return personarepository.findById(idpersona);
	}

	@Override
	public boolean registra01(Persona persona) {
		try {
			personarepository.save(persona);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean actualizar01(Persona persona) {
		try {
			personarepository.save(persona);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	
}
