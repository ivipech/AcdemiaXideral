package com.agencia.inyecciond;

public abstract class Auto {
	protected String color;
	protected int año;
    Motor motor;
	
	//No me importa que motor pero necesito uno: polimorfismo
	public Auto(String color, int año) {
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
