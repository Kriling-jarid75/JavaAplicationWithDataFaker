package com.example.demo;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Cliente;
import com.example.demo.model.Pedido;
import com.example.demo.model.Producto;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.PedidosRepository;
import com.example.demo.repository.ProductoRepositroy;
import com.github.javafaker.Faker;

@Component
public class SampleDataLoader implements CommandLineRunner {

	private final ClienteRepository clienteRepository;
	private final ProductoRepositroy productoRepositroy;
	private final PedidosRepository pedidosRepository;
	private final Faker faker;

	String dato;

	public SampleDataLoader(ClienteRepository clienteRepository, ProductoRepositroy productoRepositroy,
			PedidosRepository pedioPedidosRepository) {
		this.clienteRepository = clienteRepository;
		this.productoRepositroy = productoRepositroy;
		this.pedidosRepository = pedioPedidosRepository;
		this.faker = new Faker();
	}

	@Override
	public void run(String... args) throws Exception {
		ejecutarClases();
	}

	private void ejecutarClases() {

		List<Cliente> clientes = IntStream.rangeClosed(1, 20)
				.mapToObj(i -> new Cliente(faker.name().fullName(), faker.internet().emailAddress()))
				.collect(Collectors.toList());

		clienteRepository.saveAll(clientes);

//		System.out.println(dato);

		List<Producto> productos = IntStream.rangeClosed(1, 100)
				.mapToObj(i -> new Producto(faker.commerce().productName(), "$" + faker.commerce().price()))
				.collect(Collectors.toList());
		productoRepositroy.saveAll(productos);

		
		/*
		 * new Cliente( faker.name().fullName(), faker.internet().emailAddress()),
		 * 
		 * new Producto( faker.commerce().productName(), "$"+faker.commerce().price())
		 
		 PARA QUE PUDIERA FUNCINAR SOLO COLOQUE LO QUE TENGO EN ESTE BLOQUE COMENTADO DENTRO DE LOS 
		 PARAMETROS EN QUE ESTAN EN NULL Y ASI ES COMO FUNCIONO
		 */
		List<Pedido> pedidos = IntStream.rangeClosed(1, 30)
				.mapToObj(i -> new Pedido(faker.backToTheFuture().date(), faker.address().streetAddress(),

						null,

						null

				)).collect(Collectors.toList());

		pedidosRepository.saveAll(pedidos);

		System.out.print(pedidos);

	}// end ejecutarClases

}// End Class sampleDataLoader