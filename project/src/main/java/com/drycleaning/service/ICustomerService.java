package com.drycleaning.service;
import java.util.List;

import com.drycleaning.bean.Customer;

public interface ICustomerService {
	Customer addCustomer(Customer customer);

	Customer removeCustomer(String custId);

	Customer updateCustomer(Customer customer);

	Customer getCustomer(String custId);

	List<Customer> getAllCustomers();

}
