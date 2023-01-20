package com.singleton;

//Aqui es donde se implementa el patron de diseño de Singleton

public class Almacen {
	
	private static Almacen almacen; // Es necesario que la clase tenga como atributo privado un objeto de su misma naturaleza, en este caso, almacen.
	private int inventario = 5;   // Tiene también un atributo inventario que es la cantidad de items contenidos en el almacen.
	                               //Es necesario también que la el atributo almacen sea estatico ya que debe ser de la clase no de una instancia
	
	
	private Almacen() {} // El constructor de la clase que implementa Singleton debe ser privado ya que esto limita su creación
	                     // ya que el objetivo es que la instancia de clase se cree una sola vez.
	
	public static Almacen getAlmacen() { // Este es el metodo que creara la instancia, para esto valida que no se haya creado antes
		if (almacen == null) {           // Así, si el almacen es null, crea el almacen, pero si no, regresa el propio almacen
			almacen = new Almacen();
		}
		return almacen;
	}
	
	public void comprar(int cantidad) {  //En este ejemplo almacen tiene dos metodos comprar y vender, los cuales incrementan o decrementan
		inventario += cantidad;          // la cantidad de items en el inventario
	}
	
	public void vender(int cantidad) {
		inventario -= cantidad;
	}
	
	public void desplegarInventario() {    // Este es el metodo que podra desplegar la informacion del almacen. 
		System.out.println("El inventario es: " + inventario);
	}


}
