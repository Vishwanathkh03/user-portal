/**
 * 
 */
package com.hatgundi.userportal.exception.domain;

/**
 * @author Vishwanath Hatgundi
 *
 */
public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super(message);
	}

	public UserNotFoundException(String message, Throwable t) {
		super(message, t);
	}
}
