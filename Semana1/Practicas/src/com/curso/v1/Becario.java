package com.curso.v1;

public class Becario {
	
	//has -a   tiene una computadora
	String nombre;
	
	//Es becario quien lo llama --> No holliwood principle
	// Alto acoplamiento
	//Y si hay otro tipo de computadoras
	Computadora computadora;

	public Becario(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Becario [nombre=" + nombre + "]";
	}
	
	void encenderCompu(){
		System.out.println(nombre);
		computadora.prender();
	}
	
	

}
