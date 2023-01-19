package com.singleton;

public class Orden {

	private Almacen almacen;
	
	public Orden() {
		this.almacen = Almacen.getAlmacen();
	}
	
	public void hacerCompra(int cantidad) {
		this.almacen.comprar(cantidad);
	}
	
	public void hacerVenta(int cantidad) {
		this.almacen.vender(cantidad);
	}
}
