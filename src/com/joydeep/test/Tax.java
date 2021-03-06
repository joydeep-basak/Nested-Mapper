package com.joydeep.test;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tax {

	private int num;
	
	private String name;
	
	private int mstrNum;
	
	private String mstrName;
	
	private int type;
	
	private double taxRate;
	
	private Date effFrDt;
	
	private Date effToDt;
}
