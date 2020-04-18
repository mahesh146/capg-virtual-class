package com.capg.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.product.model.Product;
import com.capg.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService  service;
	
	@GetMapping("/id/{id}")
	public Product getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
	
	@GetMapping("/product")
	public List<Product>  getAllProducts()
	{
		  return service.findAllProducts();
	}
	
	@PostMapping("/add")
	public Product  createProduct(@RequestBody Product product)
	{
		return  service.createProduct(product);
	}
	
	
}
