package com.example.demo.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Clientes;
import com.example.demo.service.ClienteService;
//import com.github.javafaker.Faker;



@RestController
@RequestMapping("/api/v1/todo")
public class ClienteController {
	
	ClienteService clienteService;
	//Faker faker;
	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
		//this.faker = new Faker();
	}
	
	
	@GetMapping
	public ResponseEntity<List<Clientes>> getAllTodos() {
        List<Clientes> clientes = clienteService.getTodos();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }
	

	

	
	
	
	
	

}
