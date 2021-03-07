package com.joydeep.test;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Tax {

	private int num;
	
	private String name;
	
	private int mstrNum;
	
	private String mstrName;
	
	private int type;
	
	private double taxRate;
	
	private Date effFrDt;
	
	private Date effToDt;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMstrNum() {
		return mstrNum;
	}

	public void setMstrNum(int mstrNum) {
		this.mstrNum = mstrNum;
	}

	public String getMstrName() {
		return mstrName;
	}

	public void setMstrName(String mstrName) {
		this.mstrName = mstrName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
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
