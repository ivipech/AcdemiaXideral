package com.ivipech.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ivipech.tienda.dao.ItemDAO;
import com.ivipech.tienda.entity.Item;

@Service
public class ItemServiceImpl implements ItemService{
	
	private ItemDAO itemDAO;
	
	@Autowired
	public ItemServiceImpl (ItemDAO theItemDAO) {
		itemDAO = theItemDAO;
	}

	@Override
	@Transactional
	public List<Item> findAll() {
		
		return itemDAO.findAll();
	}

	@Override
	@Transactional
	public Item findById(int theId) {
	
		return itemDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Item theItem) {
	
		itemDAO.save(theItem);
		
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		itemDAO.deleteById(theId);
		
	}
	

}
