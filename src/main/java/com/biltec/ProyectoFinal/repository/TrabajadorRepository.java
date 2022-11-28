package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Trabajador;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, String> {

}
