package com.oumnia.activite2.repository;

import com.oumnia.activite2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameAndPrice(String name,double price);
}
