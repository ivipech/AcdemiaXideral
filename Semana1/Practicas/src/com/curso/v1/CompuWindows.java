package com.curso.v1;

public class CompuWindows extends Computadora {
	
	String version;

	public CompuWindows(String version) {
		this.version = version;
	}
	
	@Override
	public void prender() {
		System.out.println("Windows version: "+ version +" se endendió");
	}

}
