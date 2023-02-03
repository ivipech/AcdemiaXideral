package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Contacto;
import com.luv2code.springdemo.service.ContactoService;

@Controller
@RequestMapping("/contacto")
public class ContactoController {

	// need to inject our customer service
	@Autowired
	private ContactoService contactoService;
	
	@GetMapping("/list")
	public String listContactos(Model theModel) {
		
		// get customers from the service
		List<Contacto> theContactos = contactoService.getContactos();
				
		// add the customers to the model
		theModel.addAttribute("contactos", theContactos);
		
		return "list-contactos";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Contacto theContacto = new Contacto();
		
		theModel.addAttribute("contacto", theContacto);
		
		return "contacto-form";
	}
	
	@PostMapping("/saveContacto")
	public String saveCustomer(@ModelAttribute("contacto") Contacto theContacto) {
		
		// save the customer using our service
		contactoService.guardarContacto(theContacto);	
		
		return "redirect:/contacto/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int theId,
									Model theModel) {
		
		// get the customer from our service
		Contacto theContacto = contactoService.getContacto(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("contacto", theContacto);
		
		// send over to our form		
		return "contacto-form";
	}
	
	@GetMapping("/delete")
	public String deleteContacto(@RequestParam("id") int theId) {
		
		// delete the customer
		contactoService.borrarContacto(theId);
		
		return "redirect:/contacto/list";
	}
}










