package com.ivipech.tienda.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivipech.tienda.entity.Item;
import com.ivipech.tienda.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemRestController {
	
	private ItemService itemService;
	
	@Autowired
	public ItemRestController(ItemService theItemService) {
		itemService = theItemService;
	}
	
	// expose /items and return list of items
	
	@GetMapping("/items")
	public List<Item> findAll(){
		return itemService.findAll();
	}
	
	// Add mapping for GET /items/{itemId}
	
	@GetMapping("/items/{itemId}")
	public Item getItem(@PathVariable int itemId) {
		Item theItem = itemService.findById(itemId);
		 //**Falta implementar exceptions
		
		if (theItem == null) {
			throw new ItemNotFoundException("Item no encontrado: " + itemId);
		}
		return theItem;
	}
	
	//Add mapping for POST
	
	@PostMapping("/items")
	public Item addItem(@RequestBody Item theItem) {
		theItem.setId(0);
		itemService.save(theItem);
		return theItem;
	}
	
	//Add Mapping for PUT
	
	@PutMapping("/items")
	public Item updateItem(@RequestBody Item theItem) {
		itemService.save(theItem);
		return theItem;
	}
	
	//Mapping for DELETE
	
	@DeleteMapping("/items/{itemId}")
		public String deleteItem(@PathVariable int itemId) {
			Item itemTemp = itemService.findById(itemId);
			
			if (itemTemp == null) {
				throw new ItemNotFoundException("Item id o ncontrado: " + itemId);
			}
			
			
			itemService.deleteById(itemId);
			return "Id del Item eliminado: " + itemId;
		}	


}
