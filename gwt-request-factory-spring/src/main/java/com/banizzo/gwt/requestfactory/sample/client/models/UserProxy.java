package com.banizzo.gwt.requestfactory.sample.client.models;

import com.google.web.bindery.requestfactory.shared.ValueProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.banizzo.gwt.requestfactory.sample.server.models.User;

@ProxyFor(value = User.class)
public interface UserProxy extends ValueProxy{
	public long getId();
	public void setId(Long id);
	
	public String getName();
	public void setName(String name);
}
