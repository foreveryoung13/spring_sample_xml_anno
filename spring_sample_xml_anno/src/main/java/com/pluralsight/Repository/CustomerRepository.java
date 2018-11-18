package com.pluralsight.Repository;

import java.util.List;

import com.pluralsight.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}