package com.singleton;

public class Principal {

	public static void main(String[] args) {
		 Orden o1 = new Orden();
		 Orden o2 = new Orden();
		 
		 Almacen al = Almacen.getAlmacen();
		 al.desplegarInventario();
		 
		 o1.hacerCompra(2);
		 al.desplegarInventario();
		 
		 o2.hacerVenta(4);
		 al.desplegarInventario();
	}

}
