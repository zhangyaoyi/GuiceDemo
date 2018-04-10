package junit.test;


import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.demo.GuiceModule;
import com.guice.demo.controller.PaymentController;

public class PaymentControllerTest {
	
	private Injector injector;
	
	@Before
	public void configurate() {
		injector = Guice.createInjector(new GuiceModule());
	}
	
	@Test
	public void test() {
		PaymentController paymentController = injector.getInstance(PaymentController.class);
		paymentController.pay(512.0);
		paymentController.payByCash(513.0);
	}
}
