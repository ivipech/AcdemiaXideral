package com.curso.v1;

public class CompuLinux extends Computadora {
	
	String version;

	public CompuLinux(String version) {
		this.version = version;
	}
	
	@Override
	public void prender() {
		System.out.println("Linux version: "+ version +" se endendió");
	}

}
