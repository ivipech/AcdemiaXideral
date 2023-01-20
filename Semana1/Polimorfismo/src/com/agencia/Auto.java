package com.agencia;

//Este programa maneja la clase abstract de esta foma podemos entender la herencia y el polimorfismo aplicado.
// Auto es una clase abstracta porque no puede tener instancias hasta que se defina que tipo de auto es (Mazda, Nissan o futuros)
// No es una interfaz porque también describe atributos y metodos que son concretos. 
public abstract class Auto {
	protected String color;
	protected int año;
	private Motor motor;
	
	//En este constructor  se puede ver otro ejemplo de polomorfismo aplicado, declaro que necesito un motor,
	//en este punto no sé qué tipo de motor, pero la clase sabe que necesita uno. 
	public Auto(Motor motor, String color, int año) {
		this.motor = motor;
		this.color = color;
		this.año = año;
	}
	
	public void encender() {
		System.out.println("Metiendo llave");
		this.motor.encender();
	}
	
	public void apagar() {
		this.motor.apagar();
		System.out.println("Sacando llave");
	}
	
	public abstract void describirAuto();
}
