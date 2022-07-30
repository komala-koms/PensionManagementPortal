package com.pmp.processpension.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Component
public class PensionerDetailsBank {

	private long bankId;
	private String bankName;
	private boolean typPubPri;
	
	public PensionerDetailsBank()
	{
		
	}
	public PensionerDetailsBank(long bankId, String bankName, boolean typPubPri) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.typPubPri = typPubPri;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public boolean isTypPubPri() {
		return typPubPri;
	}
	public void setTypPubPri(boolean typPubPri) {
		this.typPubPri = typPubPri;
	}

	
}
