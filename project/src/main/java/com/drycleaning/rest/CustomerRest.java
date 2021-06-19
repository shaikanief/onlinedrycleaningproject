package com.drycleaning.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drycleaning.bean.Customer;
import com.drycleaning.service.ICustomerService;


@RestController
@RequestMapping("/v1")
public class CustomerRest {

	@Autowired
	private ICustomerService iCustomerService;


	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		Customer customer2 = null;
		customer2 = this.iCustomerService.addCustomer(customer);
		return customer2;
	}

	@GetMapping("/getcustomer")
	public List<Customer> getAllCustomers() {
		List<Customer> customers = this.iCustomerService.getAllCustomers();
		return customers;
	}


	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") String custId) {
		Customer customer = this.iCustomerService.getCustomer(custId);
		return customer;
	}

	

	@DeleteMapping("/removecustomer/{id}")
	public Customer removeCustomer(@PathVariable("id") String custId) {
		Customer customer = this.iCustomerService.removeCustomer(custId);
		return customer;
	}


	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		Customer customer2 = this.iCustomerService.updateCustomer(customer);
		return customer2;
	}


}
