package com.ivipech.tienda.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
public class ItemErrorResponse {
	
	private int status;
	private String message;
	private long timeStamp;	
	
}
