package com.escuela;

public class Alumno extends UsuarioEscolar {
	
	private String curso;
	private int semestre;

	public Alumno(String nombre, int edad, String curso, int semestre) {
		super(nombre, edad);
		this.curso = curso;
		this.semestre = semestre;
	}
	
}
