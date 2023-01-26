package com.luv2code.web.jdbc;

public class Estudiante {

	private int id;
	private String nombre;
	private String lastName;
	private String email;

	public Estudiante(String nombre, String lastName, String email) {
		this.nombre = nombre;
		this.lastName = lastName;
		this.email = email;
	}

	public Estudiante(int id, String nombre, String lastName, String email) {
		this.id = id;
		this.nombre = nombre;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", Nombre=" + nombre + ", lastName=" + lastName + ", email=" + email + "]";
	}	
}
