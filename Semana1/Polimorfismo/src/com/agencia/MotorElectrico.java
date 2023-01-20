package com.agencia;

//La clase Motor Electrico describe la instancia más concreta de Motor, por lo que implementa esa interfaz y está obligada a 
//describir la implementación de los métodos descritos en la interfaz.

public class MotorElectrico implements Motor {

	@Override
	public void encender() {
		System.out.println("Encendiendo motor electrico");

	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor electrico");

	}

}
