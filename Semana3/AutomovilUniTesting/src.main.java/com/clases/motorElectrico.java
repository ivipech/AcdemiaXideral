package com.clases;

public class motorElectrico implements Motor {

	@Override
	public String encender() {
		return "Encendiendo motor electrico";
	}

	@Override
	public String apagar() {
		return "Apagando motor electrico";
	}

}
