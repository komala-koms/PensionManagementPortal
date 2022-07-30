package com.pmp.pensionerauth.model;

import java.util.Date;

import org.springframework.stereotype.Component;



@Component
public class RegisterModel {
	
	public RegisterModel()
	{
		
	}
	public RegisterModel(Pensioner pensioner, DAOUser daoUser) {
		super();
		this.pensioner = pensioner;
		this.daoUser = daoUser;
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
	private Pensioner pensioner;
	private DAOUser daoUser;

}
