package com.milestone.mindtree.vidya.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.milestone.mindtree.vidya.model.Customer;


@Repository
public interface CustomerRepo extends CrudRepository<Customer,Integer>{

}