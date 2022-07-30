package com.pmp.processpension.model;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
public class PensionerDetails {

	private long id;	
	private long aadhar;
	private String name;	
	//not validated
	private Date dob;	
	private String pan;	
	private long salaryEarned;	
	private long allowances;
	//default false
	private boolean typeSefFamily;	
	private long bankId;
	private long accountNumber;
	public PensionerDetails()
	{
		
	}
	
	public PensionerDetails(long id, long aadhar, String name, Date dob, String pan, long salaryEarned, long allowances,
			boolean typeSefFamily, long bankId, long accountNumber) 
	{
		super();
		this.id = id;
		this.aadhar = aadhar;
		this.name = name;
		this.dob = dob;
		this.pan = pan;
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.typeSefFamily = typeSefFamily;
		this.bankId = bankId;
		this.accountNumber = accountNumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(long salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public long getAllowances() {
		return allowances;
	}
	public void setAllowances(long allowances) {
		this.allowances = allowances;
	}
	public boolean isTypeSefFamily() {
		return typeSefFamily;
	}
	public void setTypeSefFamily(boolean typeSefFamily) {
		this.typeSefFamily = typeSefFamily;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}	
	
}

