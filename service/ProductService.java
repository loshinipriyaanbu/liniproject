package com.shopping.service;

import java.util.List;

import com.shopping.model.Product;


public interface ProductService { Product saveProduct(Product Product);


	List<Product> getAllProducts();
	Product getProductById(int id);
	void deleteProduct(int id);
	void updateProduct(Product product);
	
}