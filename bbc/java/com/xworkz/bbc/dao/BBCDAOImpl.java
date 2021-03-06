package com.xworkz.bbc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bbc.entity.BBCEntity;

public class BBCDAOImpl implements BBCDAO {

	public BBCDAOImpl() {
		System.out.println("created BBCDAOImpl");
	}

	@Override
	public void create(BBCEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity is:" + entity);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();
	}

	@Override
	public BBCEntity getById(int id) {
		System.out.println("invoked getById");
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entityFromDB = session.get(BBCEntity.class, id);
		transaction.commit();
		session.close();
		factory.close();
		return entityFromDB;

	}

	@Override
	public BBCEntity updateNoOfTaskAndDaysInById(int id, int noOfTask, int daysIn) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity bbc = session.get(BBCEntity.class, id);
		if (bbc != null) {
			System.out.println("entity found,can update:" + id);
			bbc.setNoOfTask(noOfTask);
			bbc.setDaysIn(daysIn);
			transaction.commit();
			session.close();
			factory.close();
		} else {
			System.out.println("entity not found,cannot update");
		}
		return bbc;
	}

	@Override
	public void deleteById(int id) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity bbcEntity = session.get(BBCEntity.class, id);
		if (bbcEntity != null) {
			System.out.println("entity found,can delete");
			session.delete(bbcEntity);
			transaction.commit();
			session.close();
			factory.close();
		} else {
			System.out.println("entity not found,cannot delete");
		}
	}
}
