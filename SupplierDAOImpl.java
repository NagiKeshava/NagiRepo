package com.niit.shoppingcart.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Supplier;

@Repository("supplierDAO")//To create the singleton instance-SupplierDAOImpl supplierDAO=new SupplierDAOImpl();
@Transactional
public class SupplierDAOImpl implements SupplierDAO {
	
	//physical connection to the database
	
	@Autowired private SessionFactory sessionfactory;

	public SupplierDAOImpl(SessionFactory sessionfactory) {
		
		this.sessionfactory = sessionfactory;
	}
	
	private Session getCurrentSession()
	{
		return sessionfactory.getCurrentSession();
	}

	public List<Supplier> list() {
		
	return	getCurrentSession().createQuery("from Supplier").list();
	}

	public boolean save(Supplier supplier) {
		
		try
		{
		getCurrentSession().save(supplier);
		}catch (Exception e){
			e.printStackTrace();
			return false;
			
			
		}
		
		return true;
	}

	public boolean update(Supplier supplier) {
		try
		{
		getCurrentSession().update(supplier);
		}catch (Exception e){
			e.printStackTrace();
			return false;
			
			
		}
		
		return true;
	}

	public boolean delete(String id) {
		
		try
		{
		getCurrentSession().delete(getSupplierById(id));
		}catch (Exception e){
			e.printStackTrace();
			return false;
			
			
		}
		
		return true;
	}

	public Supplier getSupplierById(String id) {
		
		//select * from Supplier where id=?
		
	 return	(Supplier) getCurrentSession().get(Supplier.class, id);
	}

	public Supplier getSupplierByName(String name) {
		
		/*return (Supplier) getCurrentSession().createQuery("from Supplier where name=?")
		.setSerializable(0, name).uniqueResult();*/
		
	Query query=	getCurrentSession().createQuery("from Supplier where name=?");
	query.setString(0, name);
	return(Supplier)  query.uniqueResult();
	
	}

}
