package com.joydeep.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class NestedMapper {

	private <T> void iterateAndCopyProperties(Object source, Class<T> destinationClass) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field[] fields = source.getClass().getDeclaredFields();
		T destination = destinationClass.newInstance();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getDeclaringClass().isInstance(String.class)) {
				destination.getClass().getField(fields[i].getName()).set(destination, source.getClass().getField(fields[i].getName()));
			} else if (fields[i].getDeclaringClass().isInstance(Integer.class)) {
				destination.getClass().getField(fields[i].getName()).set(destination, source.getClass().getField(fields[i].getName()));
			} else if (fields[i].getDeclaringClass().isInstance(Double.class)) {
				destination.getClass().getField(fields[i].getName()).set(destination, source.getClass().getField(fields[i].getName()));
			} else if (fields[i].getDeclaringClass().isInstance(Long.class)) {
				destination.getClass().getField(fields[i].getName()).set(destination, source.getClass().getField(fields[i].getName()));
			} else if (fields[i].getDeclaringClass().isInstance(Object.class)) {
				Object innerObject = fields[i].getDeclaringClass().getField(fields[i].getName());
				if (destinationClass.getField(fields[i].getName()).isAccessible() && destinationClass.getField(fields[i].getName()).equals(null)) {
					Object destinationClassInnerObject = Class.forName(fields[i].getName());
					destination.getClass().getField(fields[i].getName()).set(destination, destinationClassInnerObject);
					iterateAndCopyProperties(innerObject, destinationClassInnerObject.getClass());
				}
				iterateAndCopyProperties(innerObject, destinationClass);
			}
		}
	}
	
	public TaxResponseDTO taxTypeResponseTransform(GetTaxResponse taxResponse, Class<TaxResponseDTO> TaxResponseDTOClass) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		TaxResponseDTO taxResponseDTO = TaxResponseDTOClass.newInstance();
		taxResponseDTO.setLocRef(taxResponse.getLocRef());
		/*
		 * List<TaxDTO> taxes = new ArrayList<TaxDTO>();
		 * taxResponse.getTaxes().forEach(tax -> { TaxDTO taxDTO = new TaxDTO();
		 * BeanUtils.copyProperties(tax, taxDTO); taxes.add(taxDTO); });
		 * 
		 * taxResponseDTO.setTaxes(taxes);
		 */
		
		try {
			iterateAndCopyProperties(taxResponse, TaxResponseDTOClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return taxResponseDTO;
	}
}
