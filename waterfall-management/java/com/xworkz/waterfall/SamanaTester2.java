package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterfallDAO;
import com.xworkz.waterfall.dao.WaterfallDAOImpl;
import com.xworkz.waterfall.entity.WaterfallEntity;

public class SamanaTester2 {

	public static void main(String[] args) {

		WaterfallEntity entity=new WaterfallEntity();
		entity.setName("Kunchikal falls");
		entity.setLocation("Shimogga");
		entity.setHeight(1493);
		entity.setDepth(1000);
		entity.setElectricityGenerated(true);
		entity.setEntryFees(100);
		entity.setDestination("Indian Ocean");
		entity.setNoOfDeaths(2);
		entity.setNoOfVisitors(5000);
		entity.setRating(4);
		entity.setSourceRiver("Gokak");
		
		WaterfallDAO dao=new WaterfallDAOImpl();
		//dao.create(entity);
		
		WaterfallEntity entity1=new WaterfallEntity();
		entity1.setName("Jog Falls");
		entity1.setLocation("Sagara");
		entity1.setHeight(253);
		entity1.setDepth(290);
		entity1.setElectricityGenerated(true);
		entity1.setEntryFees(80);
		entity1.setDestination("Arabian Ocean");
		entity1.setNoOfDeaths(4);
		entity1.setNoOfVisitors(3000);
		entity1.setRating(4);
		entity1.setSourceRiver("Ambuthirtha");
		//dao.create(entity1);
		
		WaterfallEntity entity2=new WaterfallEntity();
		entity2.setName("Dudhsagar Falls");
		entity2.setLocation("Sagara");
		entity2.setHeight(320);
		entity2.setDepth(270);
		entity2.setElectricityGenerated(false);
		entity2.setEntryFees(120);
		entity2.setDestination("Dudhsagar ");
		entity2.setNoOfDeaths(3);
		entity2.setNoOfVisitors(4000);
		entity2.setRating(5);
		entity2.setSourceRiver("Mahadayi River");
		dao.create(entity2);
	}

}
