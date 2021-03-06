package com.xworkz.writers.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WriterUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	static {
		System.out.println("static block invoked");
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			factory = configuration.buildSessionFactory();
			if (factory != null) {
				System.out.println("SF can be created");
			} else {
				throw new SingletonCreationException("SF is not init in WriterUtil");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
