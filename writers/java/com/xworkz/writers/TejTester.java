package com.xworkz.writers;

import com.xworkz.writers.dao.WriterDAO;
import com.xworkz.writers.dao.WriterDAOImpl;
import com.xworkz.writers.entity.WriterEntity;

public class TejTester {

	public static void main(String[] args) {

		WriterDAO dao=new WriterDAOImpl();
		WriterEntity entity=dao.getById(3);
		System.out.println(entity.getName());
		System.out.println(entity.getBestWork());
		System.out.println(entity);
		
		dao.deleteById(2);
		
		
	}

}
