package com.joydeep.test;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class GetTaxResponse  {
	
	private String locRef;

	private List<Tax> taxes;

	public String getLocRef() {
		return locRef;
	}

	public void setLocRef(String locRef) {
		this.locRef = locRef;
	}

	public List<Tax> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}
	
	
}
