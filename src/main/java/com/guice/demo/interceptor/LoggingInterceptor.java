package com.guice.demo.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.common.base.Joiner;

public class LoggingInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String className = invocation.getMethod().getDeclaringClass().getName();
		String methodName = invocation.getMethod().getName();
		String arguments = Joiner.on(",").skipNulls().join(invocation.getArguments());
		System.out.println(className);
		System.out.println(methodName);
		System.out.println(arguments);
		return invocation.proceed();
	}

}
