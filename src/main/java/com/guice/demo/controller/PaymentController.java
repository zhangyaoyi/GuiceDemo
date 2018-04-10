package com.guice.demo.controller;

import java.util.UUID;

import javax.inject.Inject;

import com.google.inject.name.Named;
import com.guice.demo.common.NamedConstant;
import com.guice.demo.service.PaymentService;
import com.guice.demo.service.TransactionLogService;

public class PaymentController {

	private final PaymentService paymentService;
	private final PaymentService paymentCashService;
	private final TransactionLogService transactionLogService;
	
	@Inject
	public PaymentController(PaymentService paymentService, @Named(NamedConstant.CASH) PaymentService paymentCashService, TransactionLogService transactionLogService) {
		this.paymentService = paymentService;
		this.paymentCashService = paymentCashService;
		this.transactionLogService = transactionLogService;
	}
	
	public void pay(Double amount) {
		String paymentId = UUID.randomUUID().toString();
		paymentService.pay(paymentId, amount);
		transactionLogService.log(paymentId, amount);
	}
	
	public void payByCash(Double amount) {
		String paymentId = UUID.randomUUID().toString();
		paymentCashService.pay(paymentId, amount);
		transactionLogService.log(paymentId, amount);
	}
	
}
