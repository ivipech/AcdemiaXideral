package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Contacto;

@Repository
public class ContactoDAOImpl implements ContactoDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Contacto> getContactos() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Contacto> theQuery = 
				currentSession.createQuery("from Contacto order by nombre",
											Contacto.class);
		
		// execute query and get result list
		List<Contacto> contactos = theQuery.getResultList();
				
		// return the results		
		return contactos;
	}

	@Override
	public void guardarContacto(Contacto theContacto) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theContacto);
		
	}

	@Override
	public Contacto getContacto(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Contacto theContacto = currentSession.get(Contacto.class, theId);
		
		return theContacto;
	}

	@Override
	public void deleteContacto(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Contacto where id=:Id");
		theQuery.setParameter("Id", theId);
		
		theQuery.executeUpdate();		
	}

}











