package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Cliente;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Cliente,Cliente> {

    public Cliente process(Cliente cliente) throws Exception {
      if(cliente.getPais().equals("China")) {
          return cliente;
      }
      return null;  
      
      
  	//return customer;
  }

}
