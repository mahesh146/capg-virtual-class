package com.capg.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capg.model.Product;
@Repository
public class ProductRepo {
	@PersistenceContext
	EntityManager em;
	
	public Product addProduct(Product product) {
		em.persist(product);
		return product;
	}
	
	public  Product getProduct(int productId) {
		return em.find(Product.class, productId);
	}
	
	public List<Product> getAllProducts(){
		TypedQuery<Product> queryGetAll=em.createQuery("from Product",Product.class);
		return queryGetAll.getResultList();
	}
}
