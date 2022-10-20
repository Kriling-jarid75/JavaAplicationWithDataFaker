package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "Clientes")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	private String nombreCliente;
	private String correoElectronico;
	
	public Clientes(String nombreCliente, String correoElectronico) {
		this.nombreCliente = nombreCliente;
		this.correoElectronico = correoElectronico;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
}