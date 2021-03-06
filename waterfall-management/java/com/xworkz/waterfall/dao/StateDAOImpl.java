package com.xworkz.waterfall.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.util.SFUtil;

public class StateDAOImpl implements StateDAO {

	SessionFactory factory = SFUtil.getFactory();
	
	public StateDAOImpl() {
	}

	public StateDAOImpl(List<StateEntity> listEntity) {
	}

	@Override
	public void create(StateEntity entity) {
	}

	@Override
	public void create(List<StateEntity> entity) {
		System.out.println("invoked create");
		System.out.println("entity:" + entity);
		Transaction transaction = null;
		try (
			Session session = factory.openSession()){
			 transaction = session.beginTransaction();
			for (StateEntity stateEntity : entity) {
				session.save(stateEntity);
				//session.flush();
			}
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
	}
}
}
