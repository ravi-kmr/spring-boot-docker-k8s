package com.app.ravi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private CustomerRepository repository;
	
	@GetMapping("/")
	List<Customer> helloworld() {
		return repository.findAll();
	}
	
	@PostMapping
	Customer postCustomer(@RequestBody Customer customer) {
		 repository.save(customer);
		return customer;
	}
	
}
