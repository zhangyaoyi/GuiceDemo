package com.guice.demo.service.impl;


import javax.inject.Inject;

import com.google.inject.Singleton;
import com.guice.demo.dao.PaymentDao;
import com.guice.demo.service.PaymentService;

@Singleton
public class PaymentServiceImpl implements PaymentService{
	
	private final PaymentDao paymentDao;
	
	@Inject
	public PaymentServiceImpl(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}


	@Override
	public void pay(String paymentId, Double amount) {
		paymentDao.makePayment(paymentId, amount);
	}

}
