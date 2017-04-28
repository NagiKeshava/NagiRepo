package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.domain.Product;

public interface ProductDAO {
	
	//get all product
	
	public List<Product> list();
	
	//create product
	public boolean save(Product product);
	
	//update product
	
	public boolean update(Product product);
	
	//delete product
	
	public boolean delete(String id);
	
	//get product by id
	
	public Product getProductById(String id);
	//get product by name
	
	public Product getProductByName(String name);
    
	
	


}
