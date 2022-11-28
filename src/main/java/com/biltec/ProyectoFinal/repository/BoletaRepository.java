package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Boleta;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta, Integer>{

}
