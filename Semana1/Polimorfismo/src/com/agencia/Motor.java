package com.agencia;

//Motor es una interfaz que unicamente describe los metodos mas generales del motor. No especifica cómo
// se van a implementar esos métodos ya que eso será responsabilidad de la clase que implementa esta interfaz
public interface Motor {
	void encender();
	void apagar();
}
