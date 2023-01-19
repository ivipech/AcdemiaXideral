package com.agencia;

public class Principal {

	public static void main(String[] args) {
		
	  Motor m1 = new MotorElectrico();
	  Motor m2 = new MotorGasolina();
	  
	  Motor m3 = new MotorElectrico();
	  Motor m4 = new MotorGasolina();
	  
	  Auto auto1 = new Mazda(m1, "Azul", 2021);
	  Auto auto2 = new Mazda(m2, "Blanco", 2020);
	  
	  Auto auto3 = new Nissan(m3, "Rojo", 2022);
	  Auto auto4 = new Nissan(m4, "Negro", 2020);
	  
	  
	  auto1.encender();
	  auto1.describirAuto();
	  auto1.apagar();
	  
	  auto2.encender();
	  auto2.describirAuto();
	  auto2.apagar();

	}

}
