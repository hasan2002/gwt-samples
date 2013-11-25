package com.banizzo.gwt.requestfactory.sample.server;

import com.google.web.bindery.requestfactory.shared.ServiceLocator;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.context.ApplicationContext;
import com.banizzo.gwt.requestfactory.sample.server.service.sample.SampleUserService;

public class RequestContextLocator implements ServiceLocator{
	public Object getInstance(java.lang.Class<?> clazz){
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(
				RequestFactoryServlet.getThreadLocalServletContext());
		return context.getBean(clazz);
	}
}
