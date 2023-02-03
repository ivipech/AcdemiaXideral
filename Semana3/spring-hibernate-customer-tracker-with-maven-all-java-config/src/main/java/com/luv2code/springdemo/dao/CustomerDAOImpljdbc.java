package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpljdbc implements CustomerDAO {

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		
	}

}











