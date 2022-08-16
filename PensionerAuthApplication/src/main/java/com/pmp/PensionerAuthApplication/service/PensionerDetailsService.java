package com.pmp.PensionerAuthApplication.service;

import com.pmp.PensionerAuthApplication.exception.PensionerDetailsInvalidParameters;
import com.pmp.PensionerAuthApplication.exception.PensionerDetailsNotFoundException;
import com.pmp.PensionerAuthApplication.model.RegisterModel;

public interface PensionerDetailsService {

	public void save(RegisterModel register) throws Exception;
	public void findUser(Long userId, String password) throws PensionerDetailsNotFoundException;
	public boolean validateDetails(RegisterModel register) throws PensionerDetailsInvalidParameters;
}
