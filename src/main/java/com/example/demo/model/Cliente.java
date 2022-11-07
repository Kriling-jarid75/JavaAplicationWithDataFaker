package com.example.demo.model;

import java.util.List;


import javax.persistence.*;

@Entity
@Table(name="Clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreCliente;
	private String correoElectronico;
	
	/*Aqui se refencia la llave a la que ira en la otra tabla*/
	@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
	List<Pedido> pedidos;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nombreCliente, String correoElectronico) {
		super();
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


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombreCliente=" + nombreCliente + ", correoElectronico=" + correoElectronico + "]";
	}

	
	public List<Pedido> getPedido() { 
		return pedidos; 
		}
	 
    public void setPedido(List<Pedido> pedidos){
        this.pedidos = pedidos;
    }
	
	
	

}
