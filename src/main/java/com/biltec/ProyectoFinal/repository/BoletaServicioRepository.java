package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.BoletaServicio;

@Repository
public interface BoletaServicioRepository extends JpaRepository<BoletaServicio, String>{

}
