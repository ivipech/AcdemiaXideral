package com.singleton;

public class Almacen {
	
	private static Almacen almacen;
	private int inventario = 5;
	
	
	private Almacen() {}
	
	public static Almacen getAlmacen() {
		if (almacen == null) {
			almacen = new Almacen();
		}
		return almacen;
	}
	
	public void comprar(int cantidad) {
		inventario += cantidad;
	}
	
	public void vender(int cantidad) {
		inventario -= cantidad;
	}
	
	public void desplegarInventario() {
		System.out.println("El inventario es: " + inventario);
	}


}
