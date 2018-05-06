package com.rolex.explore.beanutils.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Named;

import org.apache.commons.beanutils.PropertyUtils;

import com.rolex.explore.beanutils.model.Address;
import com.rolex.explore.beanutils.model.Place;
import com.rolex.explore.beanutils.model.SampleBean;
import com.rolex.explore.beanutils.model.TourismAward;

@Named
public class BeanUtilsSpecificService {
	
	public void exploreBeanUtil() {
		
		SampleBean bean = new SampleBean();
		
		String property1 = "name";
		
		String property2 = "currentAddress.city";
		
		String property3 = "previousAddresses[0].city";
		
		String property4 = "previousAddresses[3].city";
		
		String property5 = "vehicleLicenseModel(R60)";
		
		Place place1 = new Place("Sentosa", "Singapore");
		Place place2 = new Place("Colombo", "Sri Lanka");
		List<Place> places = new ArrayList<Place>();
		places.add(place1);
		places.add(place2);
		
		String property6 = "yearlyPlacesVisited(2000)";
		
		String property7 = "placesVisited";
		
		String property8 = "placesVisited[0]";
		
		TourismAward award = new TourismAward("World Award Committee", "USA");
		
		String property9 = "yearlyPlacesVisited(2000)[0].tourismAwards[0]";
		
		try {
			PropertyUtils.setSimpleProperty(bean, property1, "Rolex Rolex");
			String value1 = (String)PropertyUtils.getSimpleProperty(bean, property1);
			System.out.println("###Reverse1:   " + value1);
			
			PropertyUtils.setNestedProperty(bean, property2, "Hoffman Estates");
			String value2 = (String)PropertyUtils.getNestedProperty(bean, property2);
			System.out.println("###Reverse2:   " + value2);
			
			PropertyUtils.setNestedProperty(bean, property3 , "Schaumburg");
			String value3 = (String)PropertyUtils.getNestedProperty(bean, property3);
			System.out.println("###Reverse3:   " + value3);
			
			PropertyUtils.setNestedProperty(bean, property4 , "Des Plaines");
			String value4 = (String)PropertyUtils.getNestedProperty(bean, property4);
			System.out.println("###Reverse4:   " + value4);
			
			Address[] arrayValue1 = (Address[])PropertyUtils.getSimpleProperty(bean, "previousAddresses");
			System.out.println("###ReverseArray:   " + Arrays.toString(arrayValue1));
			
			PropertyUtils.setMappedProperty(bean, property5 , "Sonata");
			String value5 = (String)PropertyUtils.getMappedProperty(bean, property5);
			System.out.println("###Reverse5:   " + value5);
			
			PropertyUtils.setMappedProperty(bean, property6 , places);
			List<Place> value6 = (List<Place>)PropertyUtils.getMappedProperty(bean, property6);
			System.out.println("###Reverse6:   " + value6.get(0));
			
			PropertyUtils.setSimpleProperty(bean, property7, places);
			List<Place> value7 = (List<Place>)PropertyUtils.getSimpleProperty(bean, property7);
			System.out.println("###Reverse7:   " + value7.get(0));
			
			PropertyUtils.setIndexedProperty(bean, property8 , place2);
			Place value8 = (Place)PropertyUtils.getIndexedProperty(bean, property8);
			System.out.println("###Reverse8:   " + value8);
			
			PropertyUtils.setNestedProperty(bean, property9 , award);
			TourismAward value9 = (TourismAward)PropertyUtils.getNestedProperty(bean, property9);
			System.out.println("###Reverse8:   " + value8);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
