package com.agencia.inyecciond;

public class Distribuidor {
	
	static void asignarMotor(Auto auto, String tipoMotor) {
		if(tipoMotor == "electrico") 
			auto.motor = new MotorElectrico();
		else 
			auto.motor = new MotorGasolina();
	}   

}
