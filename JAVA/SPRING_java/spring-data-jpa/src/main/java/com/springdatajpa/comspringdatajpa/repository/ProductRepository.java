package com.springdatajpa.comspringdatajpa.repository;

import com.springdatajpa.comspringdatajpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
