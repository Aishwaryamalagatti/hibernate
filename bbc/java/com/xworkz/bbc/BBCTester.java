package com.xworkz.bbc;

import com.xworkz.bbc.dao.BBCDAO;
import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class BBCTester {

	public static void main(String[] args) {
 
		BBCEntity bbc=new BBCEntity();
		bbc.setId(1);
		bbc.setName("Amana");
		bbc.setSeasonNo(8);
		bbc.setContestantType("YouTuber");
		bbc.setGender("Female");
		bbc.setDaysIn(7);
		bbc.setNoOfTask(1);
		
		BBCDAO dao=new BBCDAOImpl();
		//dao.create(bbc);
		
		BBCEntity bbc1=new BBCEntity();
		bbc1.setId(1);
		bbc1.setName("Vikas");
		bbc1.setSeasonNo(8);
		bbc1.setContestantType("Model");
		bbc1.setGender("Male");
		bbc1.setDaysIn(9);
		bbc1.setNoOfTask(2);
		dao.create(bbc1);
		
		BBCEntity bbc2=new BBCEntity();
		bbc2.setId(4);
		bbc2.setName("Siya");
		bbc2.setSeasonNo(8);
		bbc2.setContestantType("Singer");
		bbc2.setGender("Female");
		bbc2.setDaysIn(9);
		bbc2.setNoOfTask(2);
		dao.create(bbc2);
		
		BBCEntity bbc3=new BBCEntity();
		bbc3.setId(5);
		bbc3.setName("Rehaan");
		bbc3.setSeasonNo(8);
		bbc3.setContestantType("Dancer");
		bbc3.setGender("Male");
		bbc3.setDaysIn(10);
		bbc3.setNoOfTask(2);
		dao.create(bbc3);
		
		BBCEntity bbc4=new BBCEntity();
		bbc4.setId(6);
		bbc4.setName("Dhruv");
		bbc4.setSeasonNo(8);
		bbc4.setContestantType("Model");
		bbc4.setGender("Male");
		bbc4.setDaysIn(8);
		bbc4.setNoOfTask(1);
		dao.create(bbc4);
	}

}
