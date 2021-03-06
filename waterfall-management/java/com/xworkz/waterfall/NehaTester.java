package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterfallDAO;
import com.xworkz.waterfall.dao.WaterfallDAOImpl;
import com.xworkz.waterfall.entity.WaterfallEntity;

public class NehaTester {

	public static void main(String[] args) {
		WaterfallDAO dao=new WaterfallDAOImpl();
		dao.deleteById(2);
		
		WaterfallEntity entity=dao.updateHeightAndDepthById(3, 350, 280);
		System.out.println(entity);
		
		WaterfallEntity ent=dao.getById(1);
		System.out.println(ent.getName());
		System.out.println(ent.getLocation());
		System.out.println(ent);
	}

}
