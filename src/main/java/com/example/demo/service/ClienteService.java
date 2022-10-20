package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Clientes;

public interface ClienteService {
	
	List<Clientes> getTodos();

	Clientes getTodoById(Long id);

	Clientes insert(Clientes clientes);

	void updateTodo(Long id, Clientes clientes);

	void deleteTodo(Long id);
}
