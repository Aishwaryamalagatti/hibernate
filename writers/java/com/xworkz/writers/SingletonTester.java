package com.xworkz.writers;

import org.hibernate.SessionFactory;

import com.xworkz.writers.util.WriterUtil;

public class SingletonTester {

	public static void main(String[] args) {

		SessionFactory factory=WriterUtil.getFactory();
		System.out.println(factory);
	}

}
