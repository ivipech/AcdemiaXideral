package com.agencia;

public class Mazda extends Auto {
	
	public Mazda(Motor motor, String color, int año) {
		super(motor, color, año);
	}

	@Override
	public void describirAuto() {
 System.out.println("Este es un auto Mazda color " + this.color + " y del año " + this.año);
	}
 
}
