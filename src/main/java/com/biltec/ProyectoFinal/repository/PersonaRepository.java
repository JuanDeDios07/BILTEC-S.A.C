package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,String >{

}
