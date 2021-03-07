package com.joydeep.test;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
public class TaxDTO {

	private long num;
	
	private String name;
	
	private long mstrNum;
	
	private String mstrName;
	
	private long type;
	
	private double taxRate;
	
	private Date effFrDt;
	
	private Date effToDt;

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMstrNum() {
		return mstrNum;
	}

	public void setMstrNum(long mstrNum) {
		this.mstrNum = mstrNum;
	}

	public String getMstrName() {
		return mstrName;
	}

	public void setMstrName(String mstrName) {
		this.mstrName = mstrName;
	}

	public long getType() {
		return type;
	}

	public void setType(long type) {
		this.type = type;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public Date getEffFrDt() {
		return effFrDt;
	}

	public void setEffFrDt(Date effFrDt) {
		this.effFrDt = effFrDt;
	}

	public Date getEffToDt() {
		return effToDt;
	}

	public void setEffToDt(Date effToDt) {
		this.effToDt = effToDt;
	}
	
	
}
