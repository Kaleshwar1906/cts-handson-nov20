package com.example.UltimateApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository cr;

	public List<Customer> fetchAllCustomers() {
		return cr.findAll();
	}

	public Optional<Customer> fetchCustomerById(int id) {
		return cr.findById(id);
	}

	public void deleteCustomerById(int id) {
		cr.deleteById(id);
	}

	public Customer addCustomer(Customer customer) {
		return cr.save(customer);
	}

	public void updateSalary(int id, int salary) {
		Optional<Customer> customer=cr.findById(id);
		Customer customer1=customer.get();
		customer1.setSalary(customer1.getSalary()+salary);
		cr.save(customer1);
	}
	
	

}	
