package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Clientes;

@Repository("clienterepository")
public interface ClienteRepository extends CrudRepository<Clientes, Long> {

}
