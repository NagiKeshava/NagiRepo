package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

@Controller
public class CategoryController {

	//create
	//fetch all
	//delete
	//update
	
	@Autowired CategoryDAO categoryDAO;
	@Autowired Category category;
	
	@RequestMapping("/manage_category_add")
	public ModelAndView createCategory(@RequestParam("id") String id,
			@RequestParam("name") String name,
			@RequestParam("description") String description){
				
				category.setId(id);
				category.setName(name);
				category.setDescription(description);
				
				ModelAndView mv=new ModelAndView("Home");
				mv.addObject("isAdminClickedCategories", "true");
				mv.addObject("isAdmin", "true");
				
				//Before calling save method,check wheter the category id  already exist in db or not
				//if it is does not exist,then only call save method
				
				if(categoryDAO.getCategoryById(id)!=null)
				{
				  //Category already exist
					
					mv.addObject("message", "Category already exist with the id" +id);
					return mv;
				}
				else//actually else  is not requiered if return stmt is in if condition
				{
				categoryDAO.save(category);
				mv.addObject("message", " Category created successfully" +id);
				
				}
		
		return mv;
	}
}
