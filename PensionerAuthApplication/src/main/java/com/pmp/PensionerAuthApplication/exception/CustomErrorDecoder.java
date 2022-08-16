package com.pmp.PensionerAuthApplication.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomErrorDecoder implements ErrorDecoder {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Override
	public Exception decode(String methodKey, Response response) { 
		
		log.info("in customErrorDecoder");
		
		String msg =  response.body().toString();
		return new PensionerDetailsExceptionFeign(msg.substring(msg.indexOf("message")+10, msg.indexOf("error")-3));
	}
	
	

}
