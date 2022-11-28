package com.biltec.ProyectoFinal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "comprobantes")
@Entity(name = "Comprobantes")
public class Comprobantes {
	
		@Id
		private String nombreComprobante;
		
		

		@OneToMany(mappedBy = "comprobantes")
		List<Ventas> ventas;
		
		@ManyToOne
		@JoinColumn(name = "numBoleta")
		Boleta boleta;
		
		@ManyToOne
		@JoinColumn(name = "numFactura")
		Factura factura;

		public Comprobantes() {
			
		}

		public Comprobantes(String nombreComprobante, List<Ventas> ventas, Boleta boleta, Factura factura) {
			
			this.nombreComprobante = nombreComprobante;
			this.ventas = ventas;
			this.boleta = boleta;
			this.factura = factura;
		}

		public String getNombreComprobante() {
			return nombreComprobante;
		}

		public void setNombreComprobante(String nombreComprobante) {
			this.nombreComprobante = nombreComprobante;
		}

		public List<Ventas> getVentas() {
			return ventas;
		}

		public void setVentas(List<Ventas> ventas) {
			this.ventas = ventas;
		}

		public Boleta getBoleta() {
			return boleta;
		}

		public void setBoleta(Boleta boleta) {
			this.boleta = boleta;
		}

		public Factura getFactura() {
			return factura;
		}

		public void setFactura(Factura factura) {
			this.factura = factura;
		}
		
		
}
