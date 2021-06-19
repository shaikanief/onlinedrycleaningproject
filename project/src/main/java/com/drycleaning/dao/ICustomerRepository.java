package com.drycleaning.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drycleaning.bean.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String> {

}

