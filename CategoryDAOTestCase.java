package com.niit.shoppingcart;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

public class CategoryDAOTestCase {
	
	//because we used Annotation @Repository,@component,@configuration
	@Autowired static AnnotationConfigApplicationContext context;
	
	@Autowired  static CategoryDAO categoryDAO;
	@Autowired  static Category category;
	
	
	@BeforeClass
	public static void initialize(){
		
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		categoryDAO= (CategoryDAO) context.getBean("categoryDAO");
		
		category= (Category) context.getBean("category");
	}
	
	

	@Test
	public void getAllCategoryrTestCase()
	{
		List<Category> category= categoryDAO.list();
		
		//will compare actual and expected
		//if actual and expected is same - TC will pass
		//if it is different - TC fail
		assertEquals(3, category.size());
	}
}


