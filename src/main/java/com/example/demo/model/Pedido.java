package com.example.demo.model;



import javax.persistence.*;

@Entity
@Table(name = "Pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fechaPedido;
	private String direccion;

    /*Aqui se hace la refencia a la tabla donde iran las FK de las otras 
     tablas
     */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id")
	Cliente cliente;
	

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "producto_id", referencedColumnName = "id")
	Producto producto;
	
	
	
	
	public Pedido(String fechaPedido, String direccion, Cliente cliente, Producto producto) {
		this.fechaPedido = fechaPedido;
		this.direccion = direccion;
		this.cliente = cliente;
		this.producto = producto;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public Producto getProducto() {
		return producto;
	}

	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fechaPedido=" + fechaPedido + ", direccion=" + direccion
				+ "]";
	}

}
