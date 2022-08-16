package com.pmp.PensionerAuthApplication.model;

import org.springframework.stereotype.Component;

@Component
public class RegisterModel {
	
	private Pensioner pensioner;
	private DAOUser daoUser;
	public RegisterModel()
	{
		
	}
	public Pensioner getPensioner() {
		return pensioner;
	}
	public void setPensioner(Pensioner pensioner) {
		this.pensioner = pensioner;
	}
	public DAOUser getDaoUser() {
		return daoUser;
	}
	public void setDaoUser(DAOUser daoUser) {
		this.daoUser = daoUser;
	}
	public RegisterModel(Pensioner pensioner, DAOUser daoUser) {
		super();
		this.pensioner = pensioner;
		this.daoUser = daoUser;
	}

}