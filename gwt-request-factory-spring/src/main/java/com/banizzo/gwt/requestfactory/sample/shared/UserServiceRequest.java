package com.banizzo.gwt.requestfactory.sample.shared;

import java.util.List;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;
import com.banizzo.gwt.requestfactory.sample.client.models.UserProxy;
import com.banizzo.gwt.requestfactory.sample.server.RequestContextLocator;
import com.banizzo.gwt.requestfactory.sample.server.service.UserService;


@Service(value = UserService.class, locator = RequestContextLocator.class)
public interface UserServiceRequest extends RequestContext{
	Request<UserProxy> findById(long id);
	Request<List<UserProxy>> find(UserProxy userLike);
	Request<UserProxy> save(UserProxy user);
}
