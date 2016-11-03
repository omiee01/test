package com.omkar_poc.controller;


import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.omkar_poc.entity.CustomerEntity;
import com.sun.research.ws.wadl.Response;

@RestController
@RequestMapping(value="/rest_customer")
public class CustomerController {
	CustomerController()
	{
		System.out.println("Counstructor Invoked");
	}
	
	/*@RequestMapping(value={"","/"})
	public String displayRegistrationForm(ModelMap model)
	{
		System.out.println("In display Controller");
		CustomerEntity cust = new CustomerEntity();
		
		model.addAttribute("customer",cust);
		
		return "customer";
	}*/
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	
	public @ResponseBody CustomerEntity saveCustDetails(@RequestBody CustomerEntity customer)
	{
		System.out.println("In display Save Data");
		System.out.println(customer);
		return customer;
	}
	
	
	
	

}
