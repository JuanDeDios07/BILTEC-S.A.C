package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
