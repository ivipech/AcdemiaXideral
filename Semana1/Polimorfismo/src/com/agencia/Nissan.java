package com.agencia;

public class Nissan extends Auto {

	public Nissan(Motor motor, String color, int año) {
		super(motor, color, año);
	}

	@Override
	public void describirAuto() {
 System.out.println("Este es un auto Nissan color " + this.color + " y del año " + this.año);
	}

}
