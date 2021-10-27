package com.milestone.mindtree.vidya.serviceInterface;

import com.milestone.mindtree.vidya.model.Customer;

public interface CustomerInterface {

	public Customer saveCustomer(Customer customer);
	public void findByCustomerid(int id);

}
