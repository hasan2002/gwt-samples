package com.banizzo.gwt.requestfactory.sample.server.service;

import com.banizzo.gwt.requestfactory.sample.server.models.User;
import java.util.List;

public interface UserService{
	User findById(long id);
	List<User> find(User userLike);
	User save(User user);
}
