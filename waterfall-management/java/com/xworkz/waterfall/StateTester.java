package com.xworkz.waterfall;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class StateTester {

	public static void main(String[] args) {
		
		StateEntity entity=new StateEntity();
		entity.setName("Karnataka");
		entity.setLanguage("Kannada");
		entity.setNoOfDistricts(29);
		entity.setPopulation(7.3);
		
		StateEntity entity2=new StateEntity();
		entity2.setName("Kerala");
		entity2.setLanguage("Malayalam");
		entity2.setNoOfDistricts(14);
		entity2.setPopulation(3.43);
		
		StateEntity entity3=new StateEntity();
		entity3.setName("Kerala");
		entity3.setLanguage("Malayalam");
		entity3.setNoOfDistricts(14);
		entity3.setPopulation(3.43);
		
		StateEntity entity4=new StateEntity();
		entity4.setName("Maharashtra");
		entity4.setLanguage("Marathi");
		entity4.setNoOfDistricts(36);
		entity4.setPopulation(12.8);
		
		StateEntity entity5=new StateEntity();
		entity5.setName("Punjab");
		entity5.setLanguage("Punjabi");
		entity5.setNoOfDistricts(22);
		entity5.setPopulation(2.96);
		
		List<StateEntity> listEntity=new ArrayList<StateEntity>();
		listEntity.add(entity);
		listEntity.add(entity2);
		listEntity.add(entity3);
		listEntity.add(entity4);
		listEntity.add(entity5);
		
		StateDAO dao=new StateDAOImpl();
		dao.create(listEntity);
	}	
}
