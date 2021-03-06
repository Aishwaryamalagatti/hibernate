package com.xworkz.waterfall.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	static {
		System.out.println("static block invoked");
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			// cfg.addAnnotatedClass(annotatedClass);
			factory = cfg.buildSessionFactory();
			if (factory != null) {
				System.out.println("SF can be created");
			} else {
				throw new SingletonCreationException("SF not init in SFUtil");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
