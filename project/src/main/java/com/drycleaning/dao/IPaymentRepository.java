package com.drycleaning.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drycleaning.bean.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Long> {

}

