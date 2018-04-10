package com.guice.demo.service;

public interface TransactionLogService {

	void log(String transactionId, Double amount);
}
