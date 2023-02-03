package com.clases;

public class AutoGasolina extends Automovil {
	
	public AutoGasolina(String marca, Motor motor) {
		super(marca, motor);
	}
	
	@Override
	public String Prender() {
		System.out.println("Presionando boton encendido");
		System.out.println(motor.encender());
		return "Auto gasolina Encendido";
	}
	
	@Override
	public String Apagar() {
		System.out.println("Presionando boton apagado");
		System.out.println(motor.encender());
		return "Auto gasolina apagado";
	}

}
