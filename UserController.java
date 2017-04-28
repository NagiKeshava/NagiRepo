package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Controller
public class UserController {
	
	@Autowired UserDAO userDAO;
	
	
	
	@Autowired User user;
	
	
	
	//get the user id and password from login page.
	//send the values to userDAO.validate
	//besed on response,you can navigate to home.jsp or login.jsp;
	
	//whenever we configure spring security-we can remove this method.
	@RequestMapping("validate")
	public ModelAndView Login(@RequestParam("username") String id,
			@RequestParam("password") String password){
		
		ModelAndView mv=new ModelAndView("/Home");
		
		if(userDAO.validate(id,password)==true)
		{
			user=userDAO.get(id);
			
			//${message}- to display in the Home.jsp
			
			mv.addObject("message", "Welcome  "+user.getName());
			
			}
			else
			{
			mv.addObject("message","Invalid credentials please try again later");
			
			}
			
			return mv;
		}
		
	//we needd to implement
	//create user
	//update user
	

}
