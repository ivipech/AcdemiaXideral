package com.curso.javaf;

import java.util.ArrayList;
import java.util.Arrays;

public class Perro {
	
	private String[] owners;
	private String nombre;
	private double edad;
	private int consumoGr;
	private int pesoKg;
	
	//Constructor
	public Perro(String[] owners, String nombre, double edad, int consumo, int peso) {
		
		super();
		this.owners = owners;
		this.edad = edad;
		this.consumoGr = consumo;
		this.pesoKg = peso;
		this.nombre = nombre;
	}
	
	//Getters y setters

	public String[] getOwners() {
		return owners;
	}
	
	public String getNombre(){
		return nombre;
	}

	public double getEdad() {
		return edad;
	}

	public int getConsumoGr() {
		return consumoGr;
	}

	public void setConsumoGr(int consumoGr) {
		this.consumoGr = consumoGr;
	}

	public int getPesoKg() {
		return pesoKg;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", owners=" + (Arrays.toString(owners)) + ", edad=" + edad + ", consumoGr="
				+ consumoGr + ", pesoKg=" + pesoKg + "]";
	}
	
	
	

}
