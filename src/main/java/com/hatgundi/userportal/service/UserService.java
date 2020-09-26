/**
 * 
 */
package com.hatgundi.userportal.service;

import java.util.Map;

import com.hatgundi.userportal.exception.domain.UserNotFoundException;

/**
 * @author vhatgund
 *
 */
public interface UserService {

	String getAllUsers();

	String getUser(String userId) throws UserNotFoundException;

	String addUser(Object obj);

	String updateUser(String userId, Object obj) throws UserNotFoundException;

	Map<String, Boolean> deleteUser(String userId);

}
