package com.ivipech.tienda.dao;

import java.util.List;

import com.ivipech.tienda.entity.Item;

public interface ItemDAO {
	
	public List<Item> findAll();
	
	public Item findById(int theId);
	
	public void save(Item theItem);
	
	public void deleteById(int theId);
	

}
