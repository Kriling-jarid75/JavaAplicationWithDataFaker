package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombreProducto;
	
	public Productos(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
}
