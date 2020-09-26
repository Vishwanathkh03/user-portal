/**
 * 
 */
package com.hatgundi.userportal.exception.domain;

/**
 * @author Vishwanath Hatgundi
 *
 */
public class UserPortalException extends Exception {
	private static final long serialVersionUID = 1L;

	public UserPortalException(String message) {
		super(message);
	}

	public UserPortalException(String message, Throwable t) {
		super(message, t);
	}
}
