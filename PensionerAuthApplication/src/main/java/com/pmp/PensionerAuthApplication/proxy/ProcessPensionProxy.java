package com.pmp.PensionerAuthApplication.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pmp.PensionerAuthApplication.exception.PensionDetailsFeignConfiguration;
import com.pmp.PensionerAuthApplication.model.Pensioner;

@FeignClient(name="process-pension",configuration=PensionDetailsFeignConfiguration.class)
public interface ProcessPensionProxy {
	@PostMapping("/pmp/process-pension/addpensioner")
	public void addPensioner(@RequestBody Pensioner pensioner);
	
}
