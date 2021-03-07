package com.joydeep.test;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class TaxResponseDTO {
	
	private String locRef;

	private List<TaxDTO> taxes = new ArrayList<TaxDTO>();

	public String getLocRef() {
		return locRef;
	}

	public void setLocRef(String locRef) {
		this.locRef = locRef;
	}

	public List<TaxDTO> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<TaxDTO> taxes) {
		this.taxes = taxes;
	}
	
	
}
