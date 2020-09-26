/**
 * 
 */
package com.hatgundi.userportal.exception;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.hatgundi.userportal.io.response.HttpResponse;

/**
 * @author Vishwanath Hatgundi
 *
 */
@ControllerAdvice
public class ExceptionHandling {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	private static final String INTERNAL_SERVER_ERROR_MSG = "An error occurred while processing the request";
	public static final String ERROR_PATH = "/error";

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<HttpResponse> noHandlerFoundException(NoHandlerFoundException e) {
		return createHttpResponse(BAD_REQUEST, e.getLocalizedMessage(), "There is no mapping for this URL");
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<HttpResponse> internalServerErrorException(Exception exception) {
		LOGGER.error(exception.getMessage());
		return createHttpResponse(INTERNAL_SERVER_ERROR, exception.getLocalizedMessage(), INTERNAL_SERVER_ERROR_MSG);
	}

	private ResponseEntity<HttpResponse> createHttpResponse(HttpStatus httpStatus, String message,String error) {
		return new ResponseEntity<>(
				new HttpResponse(httpStatus.value(), error, message), httpStatus);
	}

}
