package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Product;
import com.capg.service.ProductService;
@CrossOrigin(origins = {"http://localhost:4200"},methods = {
		RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT
})
@RestController
//@CrossOrigin(origins="*")
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService  productService;
	
	@GetMapping("product")
	public List<Product>  getAllProducts()
	{
		  return productService.findAllProducts();
	}
	
	@PostMapping("product")
	public Product  createProduct(@RequestBody Product product)
	{
		return  productService.createProduct(product);
	}
	
	
}
