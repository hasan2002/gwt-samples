package com.banizzo.gwt.requestfactory.sample.server.service.sample;


import com.banizzo.gwt.requestfactory.sample.server.service.UserService;
import com.banizzo.gwt.requestfactory.sample.server.models.User;
import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service("userService")
public class SampleUserService implements UserService{
	
	@Override
	public User findById(long id){
		User user = new User();
		user.setId(1L);
		user.setName("Hasan");
		return user;
	}
	
	@Override
	public List<User> find(User userLike){
		User user = new User();
		user.setId(1L);
		user.setName("Hasan");
		return Arrays.asList(user);
	}
	
	@Override
	public User save(User user){
		return user;
	}

}
