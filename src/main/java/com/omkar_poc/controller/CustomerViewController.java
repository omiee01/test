package com.omkar_poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.omkar_poc.entity.CustomerEntity;

@Controller
@RequestMapping(value="/customer")
public class CustomerViewController {
	@RequestMapping(value={"","/"})
	public String displayRegistrationForm(ModelMap model)
	{
		System.out.println("In display Controller");
		CustomerEntity cust = new CustomerEntity();
		cust.setId(1);
		cust.setName("omkar");
		model.addAttribute("customer",cust);
		
		return "customer";
	}

}
