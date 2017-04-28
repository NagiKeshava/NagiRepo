package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.domain.Supplier;

public interface SupplierDAO {
	
	//get all supplier
	
	public List<Supplier> list();
	
	//create supplier
	public boolean save(Supplier supplier);
	
	//update supplier
	
	public boolean update(Supplier supplier);
	
	//delete supplier
	
	public boolean delete(String id);
	
	//get supplier by id
	
	public Supplier getSupplierById(String id);
	//get supplier by name
	
	public Supplier getSupplierByName(String name);
    
	
	


}
