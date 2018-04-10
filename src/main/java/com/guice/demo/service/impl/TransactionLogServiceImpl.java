package com.guice.demo.service.impl;

import com.google.inject.Singleton;
import com.guice.demo.service.TransactionLogService;

@Singleton
public class TransactionLogServiceImpl implements TransactionLogService{

	@Override
	public void log(String transactionId, Double amount) {
		System.out.println("log transaction: id " + transactionId + " amount " + amount);
	}

}
