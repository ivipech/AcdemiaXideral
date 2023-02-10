package com.ivipech.tienda.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ivipech.tienda.entity.Item;
import com.ivipech.tienda.service.ItemService;


@Controller
@RequestMapping("/mvc")
public class ItemMvcController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping("/items")
	public String listItems(Model theModel) {
		
	
		List<Item> theItems = itemService.findAll();
		
		theModel.addAttribute("items", theItems);
		
		return "list-items";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		System.out.println("Paso por show form");
		// create model attribute to bind form data
		Item theItem = new Item();
		
		theModel.addAttribute("item", theItem);
		
		return "item-form";
	}
	
	@PostMapping("/saveItem")
	public String saveItem(@ModelAttribute("item") Item theItem) {
		
		// save the customer using our service
		itemService.save(theItem);	
		
		return "redirect:/mvc/items";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("itemId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Item theItem = itemService.findById(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("item", theItem);
		
		// send over to our form		
		return "item-form";
	}
	
	@GetMapping("/delete")
	public String deleteItem(@RequestParam("itemId") int theId) {
		
		// delete the customer
		itemService.deleteById(theId);
		
		return "redirect:/mvc/items";
	}

}










