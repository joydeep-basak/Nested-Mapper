package com.joydeep.test;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GetTaxResponse  {
	
	private String locRef;

	private List<Tax> taxes;
}
