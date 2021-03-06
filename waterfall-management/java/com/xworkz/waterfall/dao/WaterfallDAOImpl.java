package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.WaterfallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class WaterfallDAOImpl implements WaterfallDAO {
	private SessionFactory factory = SFUtil.getFactory();

	public WaterfallDAOImpl() {
	}

	@Override
	public void create(WaterfallEntity entity) {
		System.out.println("invoked create method");
		System.out.println("entity is:" + entity);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();

		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterfallEntity waterfallEntity = session.get(WaterfallEntity.class, id);
			if (waterfallEntity != null) {
				System.out.println("waterfallEntity found,can delete");
				session.delete(waterfallEntity);
				transaction.commit();

			} else {
				System.out.println("waterfallEntity not found,cannot delete");
			}
		}
	}

	@Override
	public WaterfallEntity updateHeightAndDepthById(int id, double height, double depth) {
		System.out.println("invoked updateHeightAndDepthById ");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterfallEntity ent = session.get(WaterfallEntity.class, id);
			if (ent != null) {
				System.out.println("ent found,can update");
				ent.setHeight(height);
				ent.setDepth(depth);
				transaction.commit();
			} else {
				System.out.println("ent not found,cannot update");
			}
			return ent;
		}
	}

	@Override
	public WaterfallEntity getById(int id) {
		System.out.println("invoked getById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterfallEntity entityFromDB = session.get(WaterfallEntity.class, id);
			transaction.commit();
			return entityFromDB;
		}
	}
}
