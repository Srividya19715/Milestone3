package com.milestone.mindtree.vidya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.milestone.mindtree.vidya.model.Customer;
import com.milestone.mindtree.vidya.serviceImpl.CustomerImpl;



@RestController
@CrossOrigin 
public class Homecontroller {
	@Autowired
	CustomerImpl s;
	@PostMapping(value="savecustomer")
	public Customer saveStudent(@RequestBody Customer customer) {
		s.saveCustomer(customer);
		return customer;
	}
	@RequestMapping(value="findbyid")
	public void deleteStudent(@RequestParam int id) {
		s.findByCustomerid(id);
	}

}
