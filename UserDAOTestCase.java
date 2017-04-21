package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;


public class UserDAOTestCase {
	
	@Autowired static AnnotationConfigApplicationContext context;

	@Autowired static UserDAO userDAO;
	
    @Autowired static User user;
	
	//The above objects need to initialize
    
	/*This method is going to execute before calling any one of test case
	and will execute only once*/  
    
    @BeforeClass
	public static void initalize()
	{
	    context=new AnnotationConfigApplicationContext();
	    context.scan("com.niit");
	    context.refresh();
	    //get the userDAO from context
	      userDAO=(UserDAO) context.getBean("UserDAO");
	 	//get the user from context
	       user=(User)context.getBean("User");
	}
	
	@Test
	public void createUserTestCase()
	{
	user.setId("Keshava");
	user.setName("Keshava Priya");
	user.setPassword("Krishna");
	user.setContact("7062485931");
	user.setRole("ROLE_USER");
	
	boolean flag=userDAO.save(user);
	//take three parameter assertfuntion since two parameter method deprecated
	//this assertEquals method
	//error-if there is in runtime errors-red mark
	//success-if expected and actual is same- green mark
	//fails-if expected and actual is different-blue mark.
	assertEquals("createUserTestCase", true,flag);
	}
	
	
	
	@Test
	public void updateUserTestCase()
	{
	user.setId("Keshava");
	user.setName("Keshava Priya");
	user.setPassword("KrishnaSP");
	user.setContact("7062485931");
	user.setRole("ROLE_USER");
	
	boolean flag=userDAO.update(user);
	//take three parameter assertfuntion since two parameter method deprecated
	//this assertEquals method
	//error-if there is in runtime errors-red mark
	//success-if expected and actual is same- green mark
	//fails-if expected and actual is different-blue mark.
	assertEquals("updateUserTestCase", true,flag);
	}

	@Test
	public void validateUserTestCase(){
		
		boolean flag=userDAO.validate("Keshava", "KrishnaSP");
		
		
		assertEquals(true,flag);
	}
	
	
	@Test
	public void getAllUserTestCase(){
		
		int actualsize=userDAO.list().size();
		
		//1-number of records in database
		assertEquals(1,actualsize);
		
	}
	
	
}
