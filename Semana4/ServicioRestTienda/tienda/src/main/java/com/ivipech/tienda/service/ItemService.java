package com.ivipech.tienda.service;

import java.util.List;

import com.ivipech.tienda.entity.Item;

public interface ItemService {
	
    public List<Item> findAll();
	
	public Item findById(int theId);
	
	public void save(Item theItem);
	
	public void deleteById(int theId);

}
