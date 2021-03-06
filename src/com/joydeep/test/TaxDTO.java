package com.joydeep.test;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
