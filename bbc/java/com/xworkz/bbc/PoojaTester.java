package com.xworkz.bbc;

import com.xworkz.bbc.dao.BBCDAO;
import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class PoojaTester {

	public static void main(String[] args) {

		BBCDAO dao=new BBCDAOImpl();
		BBCEntity entity=dao.getById(1);
		System.out.println(entity.getName());
		System.out.println(entity.getGender());
		System.out.println(entity);
	}
}
