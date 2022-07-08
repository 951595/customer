package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer ua) {
		return repository.save(ua);
	}
	
	public List<Customer> saveCustomers(List<Customer> uas) {
		return repository.saveAll(uas);
	}
	
	public List<Customer> getCustomers(){
		return repository.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Customer getCustomerByName(String name) {
		return repository.findByName(name);
		
	}
	
	public String deleteCustomer(int id) {
		repository.deleteById(id);
		return "university is removed"+id;
	}
	public Customer updateCustomer(Customer k) {
		Customer es=repository.findById(k.getId()).orElse(null);
		es.setName(k.getName());
		es.setAge(k.getAge());
		return repository.save(es);
	}

	public Optional<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}



