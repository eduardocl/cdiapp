package com.ecl.trainning.cdi.interceptors;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.slf4j.Logger;

@Interceptor
@OrderTransation
public class OrderTransactionInterceptor {

	@Inject
	private Logger logger;
	
	@AroundInvoke
	public Object executeInterceptor(InvocationContext ctx) throws Exception {
		System.out.println("Interceptor being called");
		Object o = ctx.proceed();
		return o;
	}
	
}
