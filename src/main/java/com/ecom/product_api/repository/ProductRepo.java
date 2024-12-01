package com.ecom.product_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.product_api.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

}
