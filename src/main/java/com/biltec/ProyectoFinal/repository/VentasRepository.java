package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Ventas;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, String>{

}
