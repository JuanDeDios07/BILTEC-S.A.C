package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Ingreso;

@Repository
public interface IngresoRepository extends JpaRepository<Ingreso, String>{

}
