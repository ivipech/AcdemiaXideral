package com.agencia.inyecciond;

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
