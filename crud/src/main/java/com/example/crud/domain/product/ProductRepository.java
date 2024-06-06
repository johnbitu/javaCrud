package com.example.crud.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
//Implementando os métodos(GET, UPDATE, DELETE) em runtime
public interface ProductRepository extends JpaRepository<Product, String> { }