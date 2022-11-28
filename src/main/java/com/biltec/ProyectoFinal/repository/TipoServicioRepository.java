package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.TipoServicio;

@Repository
public interface TipoServicioRepository extends JpaRepository<TipoServicio, String> {

}
