package com.curso.v1;

public class Main {

	public static void main(String[] args) {
		Becario becario1 = new Becario("Patrobas");
		Inyector.inyectarPc(becario1, "Windows");
		becario1.encenderCompu();
		
		Becario becario2 = new Becario("Heraclio");
		Inyector.inyectarPc(becario2, "Linux");
		becario2.encenderCompu();

	}

}
