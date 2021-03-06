package com.joydeep.test;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxResponseDTO {
	
	private String locRef;

	private List<TaxDTO> taxes;
}
