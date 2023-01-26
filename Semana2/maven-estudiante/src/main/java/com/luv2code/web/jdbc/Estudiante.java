package com.luv2code.web.jdbc;

public class Estudiante {

	private int id;
	private String nombre;
	private String apellido;
	private String correo;

	public Estudiante(String nombre, String apellido, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public Estudiante(int id, String nombre, String apellido, String correo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Correo=" + correo + "]";
	}	
}
