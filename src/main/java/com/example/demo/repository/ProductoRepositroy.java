package com.example.demo.repository;

import com.example.demo.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("productorepository")
public interface ProductoRepositroy  extends CrudRepository<Producto, Long>{

}
