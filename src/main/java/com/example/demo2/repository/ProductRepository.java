package com.example.demo2.repository;

import com.example.demo2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
//     기본적으로 CRUD 제공

}
