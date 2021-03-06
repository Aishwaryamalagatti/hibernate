package com.xworkz.bbc;

import com.xworkz.bbc.dao.BBCDAO;
import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class VaishnaviTester3 {

	public static void main(String[] args) {
		
		

		BBCDAO dao=new BBCDAOImpl();
		BBCEntity entity=dao.updateNoOfTaskAndDaysInById(4	, 1, 7);
		System.out.println(entity);
		
		dao.deleteById(2);
		
	}

}
