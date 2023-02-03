package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Contacto;

public interface ContactoDAO {

	public List<Contacto> getContactos();

	public void guardarContacto(Contacto theContacto);

	public Contacto getContacto(int theId);

	public void deleteContacto(int theId);
	
}
