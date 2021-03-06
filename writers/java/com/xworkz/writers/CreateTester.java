package com.xworkz.writers;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.writers.dao.WriterDAO;
import com.xworkz.writers.dao.WriterDAOImpl;
import com.xworkz.writers.entity.WriterEntity;

public class CreateTester {

	public static void main(String[] args) {

		WriterEntity entity=new WriterEntity();
		entity.setName("Willaim Shakesspeare");
		entity.setCountry("United Kingdoms");
		entity.setLanguage("English");
		entity.setBestWork("The Merchant of Venice");
		entity.setAwards(1);
		
		
		WriterEntity entity2=new WriterEntity();
		entity2.setName("Rabindranath Tagore");
		entity2.setCountry("India");
		entity2.setLanguage("Bengali");
		entity2.setBestWork("Gitanjali");
		entity2.setAwards(2);
				
		List<WriterEntity> list=new ArrayList<WriterEntity>();
		list.add(entity);
		list.add(entity2);
		
		WriterDAO dao=new WriterDAOImpl();
		dao.create(list);
	}

}
