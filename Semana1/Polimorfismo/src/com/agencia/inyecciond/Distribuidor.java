package com.agencia.inyecciond;

//Este actor propio de la Inyeccion de dependencias tiene un metodo que es el que asigna los motores, los crea 
//y de acuerdo a la petición de agencia crea un motor y se lo asigna a un carro. 

public class Distribuidor {
	
	static void asignarMotor(Auto auto, String tipoMotor) {
		if(tipoMotor == "electrico") 
			auto.motor = new MotorElectrico();
		else 
			auto.motor = new MotorGasolina();
	}   

}
