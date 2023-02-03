package com.clases;

public abstract class Automovil {
	String marca;
	Motor motor;
	
	
	
	public Automovil(String marca, Motor motor) {
		super();
		this.marca = marca;
		this.motor = motor;
	}

	public abstract String Prender();
		
	
	public abstract String Apagar();


}
