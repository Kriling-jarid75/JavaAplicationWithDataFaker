package com.example.demo.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Clientes;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

	ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	
	@Override
	public List<Clientes> getTodos() {
		List<Clientes> clientes = new ArrayList<>();
        clienteRepository.findAll().forEach(clientes::add);
        return clientes;
		
	}

	@Override
	public Clientes getTodoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clientes insert(Clientes clientes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTodo(Long id, Clientes clientes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTodo(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
