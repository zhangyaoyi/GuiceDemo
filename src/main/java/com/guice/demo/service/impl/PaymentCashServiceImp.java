package com.guice.demo.service.impl;

import com.guice.demo.service.PaymentService;

public class PaymentCashServiceImp implements PaymentService{

	public void pay(String paymentId, Double amount) {
		System.out.println("pay by cash");
	}
}
