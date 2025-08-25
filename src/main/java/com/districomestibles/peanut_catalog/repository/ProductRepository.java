package com.districomestibles.peanut_catalog.repository;


import com.districomestibles.peanut_catalog.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
