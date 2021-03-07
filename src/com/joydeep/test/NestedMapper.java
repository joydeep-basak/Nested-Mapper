package com.joydeep.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class NestedMapper<V> {

	private <T> T iterateAndCopyProperties(Object source, Class<T> destinationClass) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Field[] fields = source.getClass().getDeclaredFields();
		T destination = destinationClass.newInstance();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getType().getTypeName().equals(String.class.getTypeName())) {
				String sourcefieldName = source.getClass().getDeclaredField(fields[i].getName()).getName();
				String getterMethodName = "get" + sourcefieldName.substring(0, 1).toUpperCase() + sourcefieldName.substring(1);
				Object sourceObjectValue = source.getClass().getDeclaredMethod(getterMethodName).invoke(source);
				
				String destinationFieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String setterMethodName = "set" + destinationFieldName.substring(0, 1).toUpperCase() + destinationFieldName.substring(1);
				
				if (destination.getClass().getDeclaredField(fields[i].getName()) != null) {
					Method destinationMethod = destination.getClass().getDeclaredMethod(setterMethodName,
							destination.getClass().getDeclaredField(fields[i].getName()).getType());
					destinationMethod.invoke(destination, sourceObjectValue);
				}
				
//				destination.getClass().getDeclaredField(fields[i].getName()).set(destination,  source.getClass().getDeclaredMethod(getterMethodName).invoke(source));
			} else if (fields[i].getType().getTypeName().equals(Date.class.getTypeName())) {
				String sourcefieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String getterMethodName = "get" + sourcefieldName.substring(0, 1).toUpperCase() + sourcefieldName.substring(1);
				Object sourceObjectValue = source.getClass().getDeclaredMethod(getterMethodName).invoke(source);
				
				String destinationFieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String setterMethodName = "set" + destinationFieldName.substring(0, 1).toUpperCase() + destinationFieldName.substring(1);
				
				if (destination.getClass().getDeclaredField(fields[i].getName()) != null) {
					Method destinationMethod = destination.getClass().getDeclaredMethod(setterMethodName,
							destination.getClass().getDeclaredField(fields[i].getName()).getType());
					destinationMethod.invoke(destination, sourceObjectValue);
				}
			} else if (fields[i].getType().getTypeName().equals(Boolean.class.getTypeName()) || fields[i].getType().getTypeName().equals("boolean")) {
				String sourcefieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String getterMethodName = "is" + sourcefieldName.substring(0, 1).toUpperCase() + sourcefieldName.substring(1);
				Object sourceObjectValue = source.getClass().getDeclaredMethod(getterMethodName).invoke(source);
				
				String destinationFieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String setterMethodName = "set" + destinationFieldName.substring(0, 1).toUpperCase() + destinationFieldName.substring(1);
				
				if (destination.getClass().getDeclaredField(fields[i].getName()) != null) {
					Method destinationMethod = destination.getClass().getDeclaredMethod(setterMethodName,
							destination.getClass().getDeclaredField(fields[i].getName()).getType());
					destinationMethod.invoke(destination, sourceObjectValue);
				}
			} else if (fields[i].getType().getTypeName().equals(Integer.class.getTypeName()) || fields[i].getType().getTypeName().equals("int")) {
				String sourcefieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String getterMethodName = "get" + sourcefieldName.substring(0, 1).toUpperCase() + sourcefieldName.substring(1);
				Object sourceObjectValue = source.getClass().getDeclaredMethod(getterMethodName).invoke(source);
				
				String destinationFieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String setterMethodName = "set" + destinationFieldName.substring(0, 1).toUpperCase() + destinationFieldName.substring(1);
				
				if (destination.getClass().getDeclaredField(fields[i].getName()) != null) {
					Method destinationMethod = destination.getClass().getDeclaredMethod(setterMethodName,
							destination.getClass().getDeclaredField(fields[i].getName()).getType());
					destinationMethod.invoke(destination, sourceObjectValue);
				}
			} else if (fields[i].getType().getTypeName().equals(Long.class.getTypeName()) || fields[i].getType().getTypeName().equals("long")) {
				String sourcefieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String getterMethodName = "get" + sourcefieldName.substring(0, 1).toUpperCase() + sourcefieldName.substring(1);
				Object sourceObjectValue = source.getClass().getDeclaredMethod(getterMethodName).invoke(source);
				
				String destinationFieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String setterMethodName = "set" + destinationFieldName.substring(0, 1).toUpperCase() + destinationFieldName.substring(1);
				
				if (destination.getClass().getDeclaredField(fields[i].getName()) != null) {
					Method destinationMethod = destination.getClass().getDeclaredMethod(setterMethodName,
							destination.getClass().getDeclaredField(fields[i].getName()).getType());
					destinationMethod.invoke(destination, sourceObjectValue);
				}
			} else if (fields[i].getType().getTypeName().equals(Double.class.getTypeName()) || fields[i].getType().getTypeName().equals("double")) {
				String sourcefieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String getterMethodName = "get" + sourcefieldName.substring(0, 1).toUpperCase() + sourcefieldName.substring(1);
				Object sourceObjectValue = source.getClass().getDeclaredMethod(getterMethodName).invoke(source);
				
				String destinationFieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String setterMethodName = "set" + destinationFieldName.substring(0, 1).toUpperCase() + destinationFieldName.substring(1);
				
				if (destination.getClass().getDeclaredField(fields[i].getName()) != null) {
					Method destinationMethod = destination.getClass().getDeclaredMethod(setterMethodName,
							destination.getClass().getDeclaredField(fields[i].getName()).getType());
					destinationMethod.invoke(destination, sourceObjectValue);
				}
			} else if (fields[i].getType().getTypeName().equals(List.class.getTypeName())) {
				String sourcefieldName = source.getClass().getDeclaredField(fields[i].getName()).getName();
				String getterMethodName = "get" + sourcefieldName.substring(0, 1).toUpperCase() + sourcefieldName.substring(1);
				Object sourceObjectValue = source.getClass().getDeclaredMethod(getterMethodName).invoke(source);
				
				String destinationFieldName = destination.getClass().getDeclaredField(fields[i].getName()).getName();
				String setterMethodName = "set" + destinationFieldName.substring(0, 1).toUpperCase() + destinationFieldName.substring(1);
				String getterDestMethodName = "get" + destinationFieldName.substring(0, 1).toUpperCase() + destinationFieldName.substring(1);
				
				
				ParameterizedType t = (ParameterizedType) destination.getClass().getDeclaredField(fields[i].getName()).getGenericType();
				Type[] type = t.getActualTypeArguments();
				String className = type[0].getTypeName();
				Object innerGenericObject = Class.forName(className).newInstance();
				type[0].getClass();
//				
//				
//				Class<?> destInnerInnerReturnType = destination.getClass().getDeclaredMethod(getterDestMethodName).getReturnType().getComponentType();
//				destInnerInnerReturnType.getTypeParameters();
//				System.out.println(setterMethodName);
				
				if (destination.getClass().getDeclaredField(fields[i].getName()) != null) {
					Method destinationMethod = destination.getClass().getDeclaredMethod(setterMethodName,
							destination.getClass().getDeclaredField(fields[i].getName()).getType());
					destinationMethod.invoke(destination, createListOfType(innerGenericObject.getClass()));
					System.out.println(destination);
				}
				
				((List<?>)sourceObjectValue).forEach(object -> {
					try {
						Object ob = iterateAndCopyProperties(object, innerGenericObject.getClass());
						
						List lst = (List) destination.getClass().getDeclaredMethod(getterDestMethodName).invoke(destination);
						lst.add(ob);
						
//						@SuppressWarnings("rawtypes")
//						List internalElem = (List) destination.getClass().getDeclaredMethod(getterMethodName).invoke(destination);
//						@SuppressWarnings("unchecked")
//						V internalObject = (V) Class.forName(className);
//						//internalObject = (V) iterateAndCopyProperties(object, internalObject.class);
//						
//						internalElem.add(internalObject);
						System.out.println(destination);
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				
				/*Object innerObject = fields[i].getType().getClass().getField(fields[i].getName());
				if (destinationClass.getField(fields[i].getName()).isAccessible() && destinationClass.getField(fields[i].getName()).equals(null)) {
					Object destinationClassInnerObject = Class.forName(fields[i].getName());
					destination.getClass().getDeclaredField(fields[i].getName()).set(destination, destinationClassInnerObject);
					iterateAndCopyProperties(innerObject, destinationClassInnerObject.getClass());
				}
				iterateAndCopyProperties(innerObject, destinationClass);*/
			}
		}
		return destination;
	}
	
	public static <T> List<T> createListOfType(Class<T> type) {
	    return new ArrayList<T>();
	}
	
	public TaxResponseDTO taxTypeResponseTransform(GetTaxResponse taxResponse, Class<TaxResponseDTO> TaxResponseDTOClass) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		
		TaxResponseDTO taxResponseDTO = TaxResponseDTOClass.newInstance();
		taxResponseDTO.setLocRef(taxResponse.getLocRef());
		
//		  List<TaxDTO> taxes = new ArrayList<TaxDTO>();
//		  taxResponse.getTaxes().forEach(tax -> { TaxDTO taxDTO = new TaxDTO();
//		  BeanUtils.copyProperties(tax, taxDTO); taxes.add(taxDTO); });
//		  
//		  taxResponseDTO.setTaxes(taxes);
		 
		
		try {
			try {
				taxResponseDTO = iterateAndCopyProperties(taxResponse, TaxResponseDTOClass);
			} catch (NoSuchMethodException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return taxResponseDTO;
	}
	
	public static void main(String[] a) {
		GetTaxResponse res = new GetTaxResponse();
		res.setLocRef("1234");
		
		List<Tax> taxes = new ArrayList<>();
		Tax tax = new Tax();
		tax.setEffFrDt(new Date());
		tax.setEffToDt(new Date());
		tax.setMstrName("TEST");
		tax.setMstrNum(12354);
		tax.setTaxRate(12345);
		taxes.add(tax);
		
		res.setTaxes(taxes);
		
		NestedMapper mapper = new NestedMapper();
		try {
			mapper.iterateAndCopyProperties(res, TaxResponseDTO.class);
		} catch (InstantiationException | IllegalAccessException | NoSuchFieldException | SecurityException
				| ClassNotFoundException | NoSuchMethodException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}
}
