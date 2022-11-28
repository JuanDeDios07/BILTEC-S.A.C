package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, String>{

}
