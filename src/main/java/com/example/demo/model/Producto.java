package com.example.demo.model;


import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreProducto;
	private String precioProducto;

	

	@OneToMany(mappedBy = "producto",cascade = CascadeType.ALL)
	List<Pedido> pedidos;
	
	public Producto() {
		super();
	}
	
	public Producto(String nombreProducto, String precioProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id_producto) {
		this.id = id_producto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(String precioProducto) {
		this.precioProducto = precioProducto;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombreProducto=" + nombreProducto +
				", precioProducto=" + precioProducto;
	}
	public List<Pedido> getEmployee() { 
		return pedidos; 
		}
	 
    public void setEmployee(List<Pedido> pedidos){
        this.pedidos = pedidos;
    }
	
	

}
