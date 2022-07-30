package com.pmp.processpension.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


	@Component
	public class PensionCharges {
		
		private long aadhar;
		private long pensioneramt;
		private long pensionerbc;
		
		public PensionCharges()
		{
			
		}
		public PensionCharges(long aadhar, long pensioneramt, long pensionerbc) {
			super();
			this.aadhar = aadhar;
			this.pensioneramt = pensioneramt;
			this.pensionerbc = pensionerbc;
		}
		public long getAadhar() {
			return aadhar;
		}
		public void setAadhar(long aadhar) {
			this.aadhar = aadhar;
		}
		public long getPensioneramt() {
			return pensioneramt;
		}
		public void setPensioneramt(long pensioneramt) {
			this.pensioneramt = pensioneramt;
		}
		public long getPensionerbc() {
			return pensionerbc;
		}
		public void setPensionerbc(long pensionerbc) {
			this.pensionerbc = pensionerbc;
		}
		
	}

