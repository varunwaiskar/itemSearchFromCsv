package com.nagarro.a4.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.a4.entities.Tshirt;
import com.nagarro.a4.service.TshirtService;

@Controller
public class TshirtrControllerMain {

	// need to inject our customer service
	@Autowired
	private TshirtService tshirtService;
	
	@RequestMapping("/")
	public String tshirt(Model theModel) {
		
		// create model attribute to bind form data
		List<Tshirt> theTshirt = tshirtService.getTshirt();
		
		// add the customers to the model
		theModel.addAttribute("tshirt", theTshirt);
		
		return "list-tshirt.jsp";
	}
	
	
	@RequestMapping("/list")
	public String listTshirt(Model theModel) {
		
		// get customers from the service
		List<Tshirt> theTshirt = tshirtService.getTshirt();
				
		// add the customers to the model
		theModel.addAttribute("tshirt", theTshirt);
		
		return "list-tshirt";
	}
	
	
	@RequestMapping("/searchTshirt")
	public String searchTshirt(HttpServletRequest request, Model theModel) {
		
		String colour = request.getParameter("colour");
		String size = request.getParameter("size");
		String gender = request.getParameter("gender");
		
		// get customers from the service
		List<Tshirt> theTshirt = tshirtService.searchTshirt(colour, size, gender);
				
		// add the customers to the model
		theModel.addAttribute("tshirt", theTshirt);
		
		return "list-tshirt";
	}
}










