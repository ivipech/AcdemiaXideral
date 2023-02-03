package com.clases;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.clases.AutoElectrico;
import com.clases.AutoGasolina;
import com.clases.Automovil;
import com.clases.Motor;
import com.clases.motorElectrico;
import com.clases.motorGasolina;

class TestAutoMotor {
	
	@Test
	void testMotorElecOutput() {
		Motor m1 = new motorElectrico();
		if(m1 instanceof motorElectrico) {
		assertEquals(m1.encender(), "Encendiendo motor electrico");
		}
		assertEquals(m1.apagar(), "Apagando motor electrico");
	}
	
	@Test
	void testMotorGasOutput() {
		Motor m2 = new motorGasolina();
		if(m2 instanceof motorGasolina) {
		assertEquals(m2.encender(), "Encendiendo motor gasolina");
		} 
		assertEquals(m2.apagar(), "Apagando motor gasolina");
	}

	@Test
	void testAutomovilMotorGas() {
		Motor m1 = new motorGasolina();
		Automovil A1 = new AutoGasolina("Nissan", m1);
		if (A1 instanceof AutoGasolina) {
		assertTrue(A1.motor instanceof motorGasolina);
		}
	}
	
	@Test
	void testAutomovilMotorElectrico() {
		Motor m2 = new motorElectrico();
		Automovil A2 = new AutoElectrico("Mazda", m2);
		if (A2 instanceof AutoElectrico) {
		assertTrue(A2.motor instanceof motorElectrico);
		}
	}
	
	@Test
	void testAutomoElectricoEncendido() {
		Motor m2 = new motorElectrico();
		Automovil A2 = new AutoElectrico("Mazda", m2);
		assertEquals(A2.Prender(), "Auto electrico Encendido");
		assertEquals(A2.Apagar(), "Auto electrico apagado");
		
	}
	
	@Test
	void testAutoGasolina() {
		Motor m2 = new motorGasolina();
		Automovil A3 = new AutoGasolina("Chevrolet", m2);
		assertEquals(A3.Prender(), "Auto gasolina Encendido");
		assertEquals(A3.Apagar(), "Auto gasolina apagado");
	}
	

}
