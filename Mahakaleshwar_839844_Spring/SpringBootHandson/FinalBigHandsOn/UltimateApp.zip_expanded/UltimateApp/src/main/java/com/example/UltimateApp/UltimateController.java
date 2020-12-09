package com.example.UltimateApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class UltimateController {

	@Autowired 
	private CustomerService cs;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer addCustomer(@RequestBody Customer customer) {
		Customer customer1 =cs.addCustomer(customer);
		System.out.println(customer1.getCustomerId()+" "+customer1.getName()+" "+customer1.getSalary());
		return cs.addCustomer(customer1);
	}
	 
	@PutMapping("{id}/{salary}")
	public String updateSalary(@PathVariable("id") int id,@PathVariable("salary") int salary) {
		cs.updateSalary(id,salary); 
		return "Salary updated";
	}
	
	@DeleteMapping("{id}")
	public String deleteCustomerById(@PathVariable("id") int id) {
		cs.deleteCustomerById(id);
		return "Deleted Customer";
	}
	
	
	@GetMapping
	public List<Customer> fetchAllCustomers(){
		return cs.fetchAllCustomers();
	}
	
	@GetMapping("{id}")
	public Optional<Customer> fetchCustomerById(@PathVariable("id")int id) {
		return cs.fetchCustomerById(id);
	}
	
	
	
}
