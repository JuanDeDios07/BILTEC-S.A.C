package com.biltec.ProyectoFinal.service;

import java.util.List;
import java.util.Optional;

import com.biltec.ProyectoFinal.entity.Usuario;

public interface UsuarioService {


	    public	List<Usuario> listar();
		
		public	Usuario registrar(Usuario usuario);
					
		public	Usuario actualizar(Usuario usuario);
			 
		public	boolean eliminar(String idusuario);
			 
		public	Optional<Usuario> ListarId(String idusuario);
		
		public	 boolean registra01(Usuario usuario);
		
		public	boolean actualizar01(Usuario usuario);
}
