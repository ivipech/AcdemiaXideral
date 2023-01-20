package com.singleton;

//El Singleton es un patron de diseño que sirve para crear unsa sola instancia de un objeto que solo necesita ser creado una sola vez
// con el fin, entre otras cosas, de optimizar memoria.

//En este caso el ejemplo es un almacen que es capaz de desplegar las ordenes de compra o venta de su inventario.

public class Principal {

	public static void main(String[] args) {
		 Orden o1 = new Orden();
		 Orden o2 = new Orden();
		 
		 Almacen al = Almacen.getAlmacen(); //Aqui se comprueba la cantidad inicial del inventario
		 al.desplegarInventario();
		 
		 o1.hacerCompra(2); //El objeto Orden hace uso del mismo Almacen y le aumenta el inventario
		 al.desplegarInventario(); //En casa consulta al almacen nos damos cuenta que es al mismo almacen al que se hace la compra o venta		 
		 o2.hacerVenta(4);
		 al.desplegarInventario();
	}

}
