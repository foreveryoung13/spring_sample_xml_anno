package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.Repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

//	@Autowired
	CustomerRepository customerRepository;

	/* @Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using Setter Injection");
		this.customerRepository = customerRepository;
	} */
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Using Constructor Injection");
		this.customerRepository = customerRepository;
	} 

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
