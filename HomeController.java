package com.niit.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

/*import com.niit.shoppingcart.domain.Category;*/

@Controller
public class HomeController {
	
	@Autowired HttpSession session;
	
	@Autowired Category category;
	
	@Autowired CategoryDAO categoryDAO;
	
    @RequestMapping("/")
	public ModelAndView landingPage()
	{
    	ModelAndView mv=new ModelAndView("Home");
    	//model.addAttribute("message", "Thank you for visiting  Shopping cart ");
    	mv.addObject("message", "Thank you for visiting  Shopping cart ");
    	
    	List<Category> categoryList= categoryDAO.list();
    	
    	//attach to session
    	
    	session.setAttribute("categoryList", categoryList);
    	session.setAttribute("category", category);
    	
		return mv ;
	
	}
    @RequestMapping("/LoginPage")
    public String loginPage(Model model)
    {
    	model.addAttribute("isUserClickedLogin", "true");
       return "Home";
    }
    
    @RequestMapping("/RegisterPage")
    public String registerPage(Model model)
    {
    	model.addAttribute("isUserClickedRegister", "true");
      return "Home";
    }
    
}
