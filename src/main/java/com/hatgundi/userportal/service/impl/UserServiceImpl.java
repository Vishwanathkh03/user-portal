/**
 * 
 */
package com.hatgundi.userportal.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hatgundi.userportal.exception.domain.UserNotFoundException;
import com.hatgundi.userportal.repository.UserRepository;
import com.hatgundi.userportal.service.UserService;

/**
 * @author vhatgund
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public String getAllUsers() {
		return userRepo.getAllUsers();
	}

	@Override
	public String getUser(String userId) throws UserNotFoundException  {
		String user = userRepo.getUser(userId);
		return user;
	}

	@Override
	public String addUser(Object obj) {
		return userRepo.addUser(obj);
	}

	@Override
	public String updateUser(String userId, Object obj) throws UserNotFoundException {
		userRepo.getUser(userId);// get the stored(db) object and update values from obj.
		userRepo.addUser(obj); // Only one method for save and update in JPA Repo
		return "Put: user updated";
	}

	@Override
	public Map<String, Boolean> deleteUser(String userId) {
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", userRepo.deleteUser(userId));
		return response;
	}

}
