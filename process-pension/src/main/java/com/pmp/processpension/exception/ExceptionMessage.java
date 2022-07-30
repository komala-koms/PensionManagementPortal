package com.pmp.processpension.exception;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@JsonIgnoreProperties
public class ExceptionMessage {
	
	private Date date;
	private String message;
	private String error;
	private String path;
	
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
	
}
