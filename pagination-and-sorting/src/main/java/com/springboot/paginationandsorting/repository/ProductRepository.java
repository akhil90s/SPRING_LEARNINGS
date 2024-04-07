package com.springboot.paginationandsorting.repository;


import com.springboot.paginationandsorting.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
