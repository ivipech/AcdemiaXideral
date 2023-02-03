package com.clases;

public class AutoElectrico extends Automovil {

	public AutoElectrico(String marca, Motor motor) {
		super(marca, motor);
	}
	
	@Override
	public String Prender() {
		System.out.println("Presionando boton encendido");
		System.out.println(motor.encender());
		return "Auto electrico Encendido";
	}
	
	@Override
	public String Apagar() {
		System.out.println("Presionando boton apagado");
		System.out.println(motor.encender());
		return "Auto electrico apagado";
	}

}
