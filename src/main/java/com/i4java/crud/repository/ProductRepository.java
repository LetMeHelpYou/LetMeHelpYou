package com.i4java.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.i4java.crud.enitity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public Product findByName(String name);
	
}
