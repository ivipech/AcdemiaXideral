package com.agencia.inyecciond;

//Este ejemplo es el que describia el principio de polimorfismo en la POO con el uso de clases abstractas e interfaces
// Este ejemplo también se puede ocupar para ejemplificar lo que es la inyección de dependencias.
//La inyección de dependencias es una tecnica en programacion en la que el objeto recibe sus dependencias o objetos o recursos
// en lugar de crearlas él mismo.
//En este ejemplo, anteriormente el motor se creaba a parte y se asignaba a un carro con ayuda de su constructor
//En este ejemplo tenemos otro actor; que es el distribuidor de las agenciasÑ ahora es el encargado de inyectar las dependencias (motores) a los carros

public class Principal {

	public static void main(String[] args) {
	  
	  Auto auto1 = new Mazda("Azul", 2021);
	  Auto auto2 = new Mazda("Blanco", 2020);
	  
	  Auto auto3 = new Nissan("Rojo", 2022);
	  Auto auto4 = new Nissan("Negro", 2020);
	  
	  Distribuidor.asignarMotor(auto1, "Electrico");
	  Distribuidor.asignarMotor(auto2, "Gasolina");
	  Distribuidor.asignarMotor(auto3, "Gasolina");
	  Distribuidor.asignarMotor(auto4, "Electrico");
	  
	  auto1.describirAuto();
	  auto1.encender();
	  auto1.apagar();
	  
	  auto2.describirAuto();
	  auto2.encender();
	  auto2.apagar();
	  
	  auto3.describirAuto();
	  auto3.encender();
	  auto3.apagar();
	  
	  auto3.describirAuto();
	  auto3.encender();
	  auto3.apagar();

	}

}
