package com.xworkz.writers.dao;

import java.util.List;

import com.xworkz.writers.entity.WriterEntity;

public interface WriterDAO {
	
	public void create(WriterEntity entity);
	
	public void create(List<WriterEntity> entities);
	
	public WriterEntity getById(int id);
	
	public void deleteById(int id);
	
	public WriterEntity gettAll(List<WriterEntity> entities);
	
	public WriterEntity updateBestWorkById(int id,String bestWork);
	
	
	

}
