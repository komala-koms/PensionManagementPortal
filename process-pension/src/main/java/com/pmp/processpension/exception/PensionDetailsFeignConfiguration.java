package com.pmp.processpension.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class PensionDetailsFeignConfiguration extends FeignClientProperties.FeignClientConfiguration{
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Bean
	public ErrorDecoder errorDecoder() {
		log.info("in errordecoder");
		return new CustomErrorDecoder();
	}

}
