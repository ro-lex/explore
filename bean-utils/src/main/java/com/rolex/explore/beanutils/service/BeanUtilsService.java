package com.rolex.explore.beanutils.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Named;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import com.rolex.explore.beanutils.model.Address;
import com.rolex.explore.beanutils.model.Place;
import com.rolex.explore.beanutils.model.SampleBean;
import com.rolex.explore.beanutils.model.TourismAward;

@Named
public class BeanUtilsService {
	
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
			PropertyUtils.setProperty(bean, property1, "Rolex Rolex");
			String value1 = (String)PropertyUtils.getProperty(bean, property1);
			System.out.println("###Reverse1:   " + value1);
			
			PropertyUtils.setProperty(bean, property2, "Hoffman Estates");
			String value2 = (String)PropertyUtils.getProperty(bean, property2);
			System.out.println("###Reverse2:   " + value2);
			
			PropertyUtils.setProperty(bean, property3 , "Schaumburg");
			String value3 = (String)PropertyUtils.getProperty(bean, property3);
			System.out.println("###Reverse3:   " + value3);
			
			PropertyUtils.setProperty(bean, property4 , "Des Plaines");
			String value4 = (String)PropertyUtils.getProperty(bean, property4);
			System.out.println("###Reverse4:   " + value4);
			
			Address[] arrayValue1 = (Address[])PropertyUtils.getProperty(bean, "previousAddresses");
			System.out.println("###ReverseArray:   " + Arrays.toString(arrayValue1));
			
			PropertyUtils.setProperty(bean, property5 , "Sonata");
			String value5 = (String)PropertyUtils.getProperty(bean, property5);
			System.out.println("###Reverse5:   " + value5);
			
			PropertyUtils.setProperty(bean, property6 , places);
			List<Place> value6 = (List<Place>)PropertyUtils.getProperty(bean, property6);
			System.out.println("###Reverse6:   " + value6.get(0));
			
			PropertyUtils.setProperty(bean, property7, places);
			List<Place> value7 = (List<Place>)PropertyUtils.getProperty(bean, property7);
			System.out.println("###Reverse7:   " + value7.get(0));
			
			PropertyUtils.setProperty(bean, property8 , place2);
			Place value8 = (Place)PropertyUtils.getProperty(bean, property8);
			System.out.println("###Reverse8:   " + value8);
			
			PropertyUtils.setProperty(bean, property9 , award);
			TourismAward value9 = (TourismAward)PropertyUtils.getProperty(bean, property9);
			System.out.println("###Reverse8:   " + value8);
			
			System.out.println("Bean: " + bean);
			
			SampleBean copyBean = new SampleBean();
			BeanUtils.copyProperties(copyBean, bean);
			System.out.println("Bean: " + bean);
			System.out.println("Copy Bean: " + copyBean);
			
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
