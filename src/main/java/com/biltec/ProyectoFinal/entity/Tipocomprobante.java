package com.biltec.ProyectoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "tipocomprobante")
@Entity(name = "Tipocomprobante")
public class Tipocomprobante {
	
		@Id
		private String nombreComprobante;
		@JoinColumn(name = "num_boleta")
		private String numBoleta;
		@JoinColumn(name = "num_factura")
		private String numFactura;


}
