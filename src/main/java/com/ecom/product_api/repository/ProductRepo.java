package com.ecom.product_api.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.product_api.entity.Product;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;

public interface ProductRepo extends JpaRepository<Product, String>{
    @Query(value = "SELECT * FROM product WHERE description LIKE %?1%", nativeQuery = true)
    Page<Product> search(String searchTect, Pageable pageable);
    @Query(value = "SELECT COUNT(*) FROM product WHERE description LIKE %?1%", nativeQuery = true)
    long searchCount(String searchTect);

}
