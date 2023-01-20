package com.singleton;

//Para que el almacen pueda comprar, se creo una clase Orden que hace uso del almacen (que será unico).
//La clase orden en su constructor hace uso del Almacen por lo que acude a su metodo getAlmacen, el que ya sabemos
// que internamente comprueba si existe un almacen o no. 

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
