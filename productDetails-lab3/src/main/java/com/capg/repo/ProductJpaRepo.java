package com.capg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.model.Product;


public interface ProductJpaRepo extends JpaRepository<Product, Integer>{

}
