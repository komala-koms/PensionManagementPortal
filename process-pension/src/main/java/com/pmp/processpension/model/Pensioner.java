package com.pmp.processpension.model;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
public class Pensioner {
	
	private long aadhar;
	private String username;
	 private Date dob;
	 private  boolean typselffam;
	 private String pan ;
	 private  long salaryearned;
	 private long allowances;
	 private String bankName;
	 private boolean typepubpri;
	 private long accountnumber;
	 
	 public Pensioner()
	 {
		 
	 }
	public Pensioner(long aadhar, String username, Date dob, boolean typselffam, String pan, long salaryearned,
			long allowances, String bankName, boolean typepubpri, long accountnumber) {
		super();
		this.aadhar = aadhar;
		this.username = username;
		this.dob = dob;
		this.typselffam = typselffam;
		this.pan = pan;
		this.salaryearned = salaryearned;
		this.allowances = allowances;
		this.bankName = bankName;
		this.typepubpri = typepubpri;
		this.accountnumber = accountnumber;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isTypselffam() {
		return typselffam;
	}
	public void setTypselffam(boolean typselffam) {
		this.typselffam = typselffam;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getSalaryearned() {
		return salaryearned;
	}
	public void setSalaryearned(long salaryearned) {
		this.salaryearned = salaryearned;
	}
	public long getAllowances() {
		return allowances;
	}
	public void setAllowances(long allowances) {
		this.allowances = allowances;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public boolean isTypepubpri() {
		return typepubpri;
	}
	public void setTypepubpri(boolean typepubpri) {
		this.typepubpri = typepubpri;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	 
}
