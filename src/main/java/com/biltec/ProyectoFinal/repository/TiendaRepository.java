package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Tienda;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda, String> {

}
