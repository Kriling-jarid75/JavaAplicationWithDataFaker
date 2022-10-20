package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Productos;

public interface ProductoReposotory extends CrudRepository<Productos, Long>{

}
