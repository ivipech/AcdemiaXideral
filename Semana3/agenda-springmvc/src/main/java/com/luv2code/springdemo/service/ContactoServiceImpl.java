package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.ContactoDAO;
import com.luv2code.springdemo.entity.Contacto;

@Service
public class ContactoServiceImpl implements ContactoService {

	// need to inject customer dao
	@Autowired
	@Qualifier("contactoDAOImpljdbc")
	private ContactoDAO contactoDAO;
	
	@Override
	@Transactional
	public List<Contacto> getContactos() {
		return contactoDAO.getContactos();
	}

	@Override
	@Transactional
	public void guardarContacto(Contacto theCustomer) {

		contactoDAO.guardarContacto(theCustomer);
	}

	@Override
	@Transactional
	public Contacto getContacto(int theId) {
		
		return contactoDAO.getContacto(theId);
	}

	@Override
	@Transactional
	public void borrarContacto(int theId) {
		
		contactoDAO.deleteContacto(theId);
	}
}





