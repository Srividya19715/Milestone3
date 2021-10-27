package com.milestone.mindtree.vidya.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milestone.mindtree.vidya.dao.CustomerRepo;
import com.milestone.mindtree.vidya.model.Customer;
import com.milestone.mindtree.vidya.serviceInterface.CustomerInterface;


@Service
public class CustomerImpl implements CustomerInterface {
	@Autowired
	private CustomerRepo service;
	@Override
	public Customer saveCustomer(Customer student) {
		return service.save(student);
	}
	@Override
	public void findByCustomerid(int id) {
		service.findById(id);
		
	}

}
