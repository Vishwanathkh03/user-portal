/**
 * 
 */
package com.hatgundi.userportal.io.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hatgundi.userportal.exception.domain.UserNotFoundException;
import com.hatgundi.userportal.service.UserService;

/**
 * @author vhatgund
 *
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<String> getAllUsers() {
		String allUsers = userService.getAllUsers();
		return new ResponseEntity<String>(allUsers, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<String> getUser(String userId) throws UserNotFoundException {
		String user = userService.getUser(userId);
		return new ResponseEntity<String>(user, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addUser(Object obj) {
		String addUser = userService.addUser(obj);
		return new ResponseEntity<String>(addUser, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<String> updateUser(String userId, Object obj) throws UserNotFoundException {
		String updateUser = userService.updateUser(userId, obj);
		return new ResponseEntity<String>(updateUser, HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<Map<String, Boolean>> deleteUser(String userId) {
		Map<String, Boolean> response = userService.deleteUser(userId);
		return new ResponseEntity<Map<String, Boolean>>(response, HttpStatus.OK);
	}

}
