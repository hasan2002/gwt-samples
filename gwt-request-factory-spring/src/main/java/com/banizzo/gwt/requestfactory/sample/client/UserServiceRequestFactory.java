package com.banizzo.gwt.requestfactory.sample.client;

import com.google.web.bindery.requestfactory.shared.RequestFactory;
import com.banizzo.gwt.requestfactory.sample.shared.UserServiceRequest;

public interface UserServiceRequestFactory extends RequestFactory{
	UserServiceRequest userServiceRequest();
}
