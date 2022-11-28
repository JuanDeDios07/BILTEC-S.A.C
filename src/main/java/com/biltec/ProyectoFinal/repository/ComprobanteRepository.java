package com.biltec.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biltec.ProyectoFinal.entity.Comprobantes;

@Repository
public interface ComprobanteRepository extends JpaRepository<Comprobantes, String> {

}
