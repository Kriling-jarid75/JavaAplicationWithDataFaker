package com.example.demo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repository.ClienteRepository;
import com.github.javafaker.Faker;
import com.example.demo.model.*;

@Component
public class SampleDataLoaderClientes implements CommandLineRunner {

	private final ClienteRepository clienteRepository;
	private final Faker faker;

	public SampleDataLoaderClientes(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
		this.faker = new Faker();
	}

	@Override
	public void run(String... args) throws Exception {
		insertarDatos();
	}

	
	private void insertarDatos() {
		List<Clientes> clientes = IntStream.rangeClosed(1, 20)
				.mapToObj(i -> new Clientes(faker.name().fullName(), faker.internet().emailAddress()))
				.collect(Collectors.toList());
		clienteRepository.saveAll(clientes);
	}
	

}
