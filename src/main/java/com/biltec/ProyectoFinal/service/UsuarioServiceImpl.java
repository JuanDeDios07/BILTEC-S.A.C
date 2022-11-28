package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biltec.ProyectoFinal.entity.Usuario;
import com.biltec.ProyectoFinal.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> listar() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario registrar(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario actualizar(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

	@Override
	public boolean eliminar(String idusuario) {
		try {
			Optional<Usuario> u=ListarId(idusuario);
			usuarioRepository.delete(u.get());
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public Optional<Usuario> ListarId(String idusuario) {
		
		return usuarioRepository.findById(idusuario);
	}

	@Override
	public boolean registra01(Usuario usuario) {
		try {
			usuarioRepository.save(usuario);
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean actualizar01(Usuario usuario) {
		try {
			usuarioRepository.save(usuario);
			return true;
		}catch(Exception e) {
		return false;
	}
	}
	
	
}
