/**
 * 
 */
package com.hatgundi.userportal.repository;

import org.springframework.stereotype.Repository;

/**
 * @author vhatgund
 *
 */
@Repository
public class UserRepository {

	public String getAllUsers() {
		return "Get: all Users";
	}

	public String getUser(String userId) {
		return "Get: user by userID:" + userId;
	}

	public String addUser(Object obj) {
		return "Post: user added";
	}

	public Boolean deleteUser(String userId) {
		return Boolean.TRUE;
	}

}
