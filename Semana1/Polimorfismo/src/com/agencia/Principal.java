package com.agencia;

//En esta practica se pone en práctica un principio muy importante de la POO; el polimorfismo.
//En POO, el polimorfismo es la capacidad de los objetos o las funciones de tomar diferentes formas.
// En el caso de los objetos esto es logrado mediante la herencia y la implementación de las interfaces.

public class Principal {

	public static void main(String[] args) {
		
	  Motor m1 = new MotorElectrico(); //En este ejemplo se puede ver como una interfaz Motor puede tomar dos formas más concretas:
	  Motor m2 = new MotorGasolina(); // Motor Electrico o Motor de Gas, a esto se le conoce como overloading
	  
	  Motor m3 = new MotorElectrico();
	  Motor m4 = new MotorGasolina();
	  
	  Auto auto1 = new Mazda(m1, "Azul", 2021);
	  Auto auto2 = new Mazda(m2, "Blanco", 2020);
	  
	  Auto auto3 = new Nissan(m3, "Rojo", 2022);
	  Auto auto4 = new Nissan(m4, "Negro", 2020);
	  
	  
	  auto1.encender();         
	  auto1.describirAuto(); //Aqui tambien podemos ver el polimorfismo aplicado en overriding, ya que
	  auto1.apagar();       // Dos objetos MAZDA y NISSAN ejecutan un metodo que fue sobreescrito diferente
	                        // en ambas clases.   
	  auto3.encender();
	  auto3.describirAuto();
	  auto3.apagar();

	}

}
