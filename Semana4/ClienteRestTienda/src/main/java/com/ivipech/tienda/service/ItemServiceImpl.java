package com.ivipech.tienda.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ivipech.tienda.entity.Item;


@Service
public class ItemServiceImpl implements ItemService {

	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public ItemServiceImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	@Override
	public List<Item> findAll() {
//		logger.info("in getCustomers(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<Item>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<Item>>() {});

		// get the list of customers from response
		List<Item> items = responseEntity.getBody();

		logger.info("in findAll(): items" + items);
		
		return items;
	}

	@Override
	public Item findById(int theId) {

//		logger.info("in getCustomer(): Calling REST API " + crmRestUrl);

		// make REST call
		Item theItem = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
						Item.class);

		logger.info("in findById(): theItem=" + theItem);
		
		return theItem;
	}

	@Override
	public void save(Item theItem) {
//		logger.info("in saveCustomer(): Calling REST API " + crmRestUrl);
		
		int itemId = theItem.getId();

		// make REST call
		if (itemId == 0) {
			// add employee
			restTemplate.postForEntity(crmRestUrl, theItem, String.class);			
		
		} else {
			// update employee
			restTemplate.put(crmRestUrl, theItem);
		}

		logger.info("in Item save(): success");	
		
	}

	@Override
	public void deleteById(int theId) {
		
//		logger.info("in deleteById(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("in deleteById(): deleted item theId=" + theId);
		
	}

	

	
	
}






