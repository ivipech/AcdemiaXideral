package com.clases;

public class motorGasolina implements Motor {

	@Override
	public String encender() {
		return "Encendiendo motor gasolina";
	}

	@Override
	public String apagar() {
		return "Apagando motor gasolina";
	}

}
