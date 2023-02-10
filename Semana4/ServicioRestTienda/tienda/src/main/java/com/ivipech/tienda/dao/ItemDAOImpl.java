package com.ivipech.tienda.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ivipech.tienda.entity.Item;

@Repository
public class ItemDAOImpl implements ItemDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public ItemDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Item> findAll() {
		
		//sesion actual
		Session sesionActual = entityManager.unwrap(Session.class);
		//hacer un query
		Query<Item> theQuery = sesionActual.createQuery("from Item", Item.class);
		
		List<Item> items = theQuery.getResultList();
		
		return items;
	}

	@Override
	public Item findById(int theId) {
		Session sesionActual = entityManager.unwrap(Session.class);
		
		Item elItem = sesionActual.get(Item.class, theId);
		
		return elItem;
	}

	@Override
	public void save(Item theItem) {
		Session sesionActual = entityManager.unwrap(Session.class);
		
		sesionActual.saveOrUpdate(theItem);
		
	}

	@Override
	public void deleteById(int theId) {
		Session sesionActual = entityManager.unwrap(Session.class);
		
		Query theQuery = sesionActual.createQuery("delete from Item where id=:id");
		theQuery.setParameter("id", theId);
		
		theQuery.executeUpdate();
		
	}

}
