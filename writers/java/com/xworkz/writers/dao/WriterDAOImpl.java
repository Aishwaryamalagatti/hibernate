package com.xworkz.writers.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.writers.entity.WriterEntity;
import com.xworkz.writers.util.WriterUtil;

public class WriterDAOImpl implements WriterDAO {
	SessionFactory factory = WriterUtil.getFactory();

	public WriterDAOImpl() {
	}

	@Override
	public void create(WriterEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity is:" + entity);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		}
	}

	@Override
	public void create(List<WriterEntity> entities) {
		System.out.println("creating list of entities");
		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			for (WriterEntity writerEntity : entities) {
				session.save(writerEntity);
			}
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

	@Override
	public WriterEntity getById(int id) {
		System.out.println("invoked getById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WriterEntity entityFromDB = session.get(WriterEntity.class, id);
			transaction.commit();
			return entityFromDB;
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WriterEntity ent = session.get(WriterEntity.class, id);
			if (ent != null) {
				System.out.println("ent is not null,can delete");
				session.delete(ent);
				transaction.commit();
			} else {
				System.out.println("ent is null,cannot delete");
			}
		}
	}

	@Override
	public WriterEntity gettAll(List<WriterEntity> entities) {
		System.out.println("invoked gettAll");
		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			for (WriterEntity writerEntity : entities) {
				// WriterEntity entityFromDB=session.get(WriterEntity.class, );
				transaction.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return null;
	}

	@Override
	public WriterEntity updateBestWorkById(int id, String bestWork) {
		System.out.println("invoked updateBestWorkById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WriterEntity ent = session.get(WriterEntity.class, id);
			if (ent != null) {
				System.out.println("ent is not null,can update");
				ent.setBestWork(bestWork);
				transaction.commit();
			} else {
				System.out.println("ent is null,cannot update");
			}
			return ent;
		}
	}
}
