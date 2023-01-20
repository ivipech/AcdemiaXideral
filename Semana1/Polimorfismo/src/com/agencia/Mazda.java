package com.agencia;

//Mazda es una de las clases más concretas de las que va a extender auto, aquí se sobreescribe un metodo definido en esa clase.
// y se ve la herencia al ser una hija de una clase abstracta que hereda atributos y sobreescribe sus metodos. 
public class Mazda extends Auto {
	
	public Mazda(Motor motor, String color, int año) {
		super(motor, color, año);
	}

	@Override
	public void describirAuto() {
 System.out.println("Este es un auto Mazda color " + this.color + " y del año " + this.año);
	}
 
}
