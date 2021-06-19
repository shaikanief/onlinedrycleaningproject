package com.service;

import java.util.List;

import com.bean.Payment;

public interface IPaymentService {

	public Payment addPayment(Payment payment);
		
	public Payment removePayment(long id);

	public Payment updatePayment(Payment payment);

	public Payment getPaymentDetails(long id);

	public List<Payment> getAllPaymentDetails();

}

