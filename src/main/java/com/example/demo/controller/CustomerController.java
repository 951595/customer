package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
@RestController
public class CustomerController {
	
	 @Autowired
		private CustomerService service;
	    @PostMapping("/addUniversityApp")
	    public Customer addCustomer(@RequestBody Customer k) {
	    	return service.saveCustomer(k);
	    }
	    @PostMapping("/addUniversityApps")
	    public List<Customer> addCustomers(@RequestBody List<Customer> m){
	    	return service .saveCustomers(m);
	    }
	    @GetMapping("/UniversityApps")
	    public Optional<Customer> findAllCustomers(){
	    	return service.getCustomer();
	    }
	    @GetMapping("/UniversityApp/{id}")
	    public Customer findCustomerById(@PathVariable Integer id) {
	    	return service.getCustomerById(id);
	    	
	    }
	    @GetMapping("/UniversityApp/{name}")
	    public Customer findCustomerByName(@PathVariable String name) {
	    	return service.getCustomerByName(name);
	    }
	    @PostMapping("/update")
	    public Customer updateCustomer(@RequestBody Customer k) {
	    	return service.saveCustomer(k);
	    }
	    @DeleteMapping("/delete/{id}")
	    public String deleteCustomer(@PathVariable int id) {
	    	return service.deleteCustomer(id);
	    }
	}



