/**
 * 
 */
package com.hatgundi.userportal.io.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Vishwanath Hatgundi
 *
 */
public class HttpResponse {

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date timeStamp;
	private int status;
	private String message;
	private Object data;
	private String error;

	public HttpResponse() {
	}

	public HttpResponse(int status, String error, String message) {
		this.timeStamp = new Date();
		this.status = status;
		this.error = error;
		this.message = message;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
