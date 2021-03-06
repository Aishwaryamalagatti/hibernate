package com.xworkz.writers;

import com.xworkz.writers.dao.WriterDAO;
import com.xworkz.writers.dao.WriterDAOImpl;
import com.xworkz.writers.entity.WriterEntity;

public class UpdateTester {

	public static void main(String[] args) {
		
		WriterDAO dao=new WriterDAOImpl();
		WriterEntity entity=dao.updateBestWorkById(1, "Romeo and Juliet");
		System.out.println(entity);
		
	}

}
