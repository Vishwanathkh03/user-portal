/**
 * 
 */
package com.hatgundi.userportal.repository;

import org.springframework.stereotype.Repository;

import com.hatgundi.userportal.exception.domain.UserNotFoundException;

/**
 * @author vhatgund
 *
 */
@Repository
public class UserRepository {

	public String getAllUsers() {
		return "Get: all Users";
	}

	public String getUser(String userId) throws UserNotFoundException {
		if (userId == null) {
			throw new UserNotFoundException("User doesn't exist..!");
		}
		return "Get: user by userID:" + userId;
	}

	public String addUser(Object obj) {
		return "Post: user added";
	}

	public Boolean deleteUser(String userId) {
		return Boolean.TRUE;
	}

}
