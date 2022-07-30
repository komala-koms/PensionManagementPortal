package com.pmp.pensionerdetail.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Entity
public class PensionerDetailsBank implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	public PensionerDetailsBank() {
		
	}
	public PensionerDetailsBank(long bankId, @NotEmpty String bankName, @NotEmpty boolean typPubPri) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.typPubPri = typPubPri;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bankId;
	
	@NotEmpty
	@Column(unique = true)
	private String bankName;
	
	@NotEmpty
	private boolean typPubPri;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	

}
