package com.guice.demo;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;
import com.guice.demo.annotations.Cash;
import com.guice.demo.common.NamedConstant;
import com.guice.demo.interceptor.LoggingInterceptor;
import com.guice.demo.service.PaymentService;
import com.guice.demo.service.TransactionLogService;
import com.guice.demo.service.impl.PaymentCashServiceImp;
import com.guice.demo.service.impl.PaymentServiceImpl;
import com.guice.demo.service.impl.TransactionLogServiceImpl;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		
		bindInterceptor(Matchers.any(), Matchers.any(), new LoggingInterceptor());
		bind(PaymentService.class).to(PaymentServiceImpl.class);
		bind(PaymentService.class).annotatedWith(Names.named(NamedConstant.CASH)).to(PaymentCashServiceImp.class);
		bind(PaymentService.class).annotatedWith(Cash.class).to(PaymentCashServiceImp.class);
		bind(TransactionLogService.class).to(TransactionLogServiceImpl.class);
	}

}
