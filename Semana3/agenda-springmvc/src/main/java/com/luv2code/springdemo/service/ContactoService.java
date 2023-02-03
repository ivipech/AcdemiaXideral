package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Contacto;

public interface ContactoService {

	public List<Contacto> getContactos();

	public void guardarContacto(Contacto theContacto);

	public Contacto getContacto(int theId);

	public void borrarContacto(int theId);
	
}
