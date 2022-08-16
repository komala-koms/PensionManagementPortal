package com.pmp.PensionerAuthApplication.exception;

public class PensionerDetailsExceptionFeign extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PensionerDetailsExceptionFeign(String msg) {
		super(msg);
	}

}