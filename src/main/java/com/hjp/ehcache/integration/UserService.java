package com.hjp.ehcache.integration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;

public class UserService {

	private Map<Integer, User> users = new HashMap<Integer, User>();
	{
        users.put(1, new User(1, "Kenan", "5554332088", 37));
        users.put(2, new User(2, "Mert", "5552345060", 34));
    }
	
    @Cacheable(value = "users", condition = "#user.age < 35")
	public User getUser(User user){
		System.out.println("User with id "+user.getId()+" requested");
		return users.get(user.getId());
	}
}
