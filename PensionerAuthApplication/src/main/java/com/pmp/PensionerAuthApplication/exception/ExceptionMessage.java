package com.pmp.PensionerAuthApplication.exception;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ExceptionMessage {
	
	public ExceptionMessage()
	{
		
	}
	public ExceptionMessage(Date date, String message, String error, String path) {
		super();
		this.date = date;
		this.message = message;
		this.error = error;
		this.path = path;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	private Date date;
	private String message;
	private String error;
	private String path;

}