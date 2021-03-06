package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.WaterfallEntity;

public interface WaterfallDAO {
	
	public void create(WaterfallEntity entity);
	
	public void deleteById(int id);
	
	public WaterfallEntity updateHeightAndDepthById(int id, double height, double depth);
	
	public WaterfallEntity getById(int id);

}
