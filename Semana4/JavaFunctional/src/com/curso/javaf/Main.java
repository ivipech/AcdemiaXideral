package com.curso.javaf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	//Lo perros deben comer entre el 2-2.5% de su peso corporal
	public static void main(String[] args) {
		String[] ow1 = {"Sara", "Juan"};
		String[] ow2 = {"Wilfrido", "Erick"};
		String[] ow3 = {"Monica"};
		String[] ow4 = {"Camila"};
		String[] ow5 = {"Jose", "Marta"};
		String[] ow6 = {"Ingrid"};
		
		Perro[] perros = {
		new Perro(ow1, "Thor", 1.0, 100, 6), //120 150
		new Perro(ow2, "Menta", 0.2, 90, 5), // 100 125
		new Perro(ow3, "Lluvia", 3.0, 45, 2), // 40 50
		new Perro(ow4, "Brisa", 7.0, 600, 20), // 400 500
		new Perro(ow5, "kittyMeza", 0.4, 70, 3), //60 75
		new Perro(ow6, "Doris", 5.0, 400, 12)}; // 240 300
		
		List<Perro> perrosList = Arrays.asList(perros);
		
		//Filtrar quien no es un perro adulto y tiene mas de un dueño
		
		showPerroYDueños(perrosList, p -> p.getEdad()<1 && p.getOwners().length >1);
		showUnderFix(perrosList, p -> p.getConsumoGr() < p.getPesoKg()*.02 *1000);
		showOverFix(perrosList, p -> p.getConsumoGr() > p.getPesoKg()*.025 *1000);
		
		
		//Filtrar quien es un perro adulto que come poco y aumentar su consumo
		//Filtrar quien es un perro adulto que come mucho y disminuir su consumo 

	}
	
	static void showPerroYDueños(List<Perro> lista, Predicate<Perro> p) {
		for(Perro pet:lista) {
			if(p.test(pet)) {
				System.out.println("Los dueños del cachorro " + pet.getNombre() + " son: " + Arrays.toString(pet.getOwners()));
			}
		}
	}
	
	static void showUnderFix(List<Perro> lista, Predicate<Perro> p) {
		for(Perro pet:lista) {
			if(p.test(pet)) {
				System.out.println("El perro: " + pet.getNombre() +  " debe aumentar su consumo de " + pet.getConsumoGr() + "gr a " +  pet.getPesoKg() * .02 * 1000 + "gr");
			}
		}
	}
	
	static void showOverFix(List<Perro> lista, Predicate<Perro> p) {
		for(Perro pet:lista) {
			if(p.test(pet)) {
				System.out.println("El perro: " + pet.getNombre() +  " debe disminuir su consumo de " + pet.getConsumoGr() + "gr a " +  pet.getPesoKg() * .024 * 1000 + "gr");
			}
		}
	}

}


