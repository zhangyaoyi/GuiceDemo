package com.guice.demo.dao;

import com.google.inject.Singleton;

@Singleton
public class PaymentDao {

	public void makePayment(String paymentId, Double amount) {
		System.out.println("pay " + amount + "for payment id " + paymentId);
	}
}
