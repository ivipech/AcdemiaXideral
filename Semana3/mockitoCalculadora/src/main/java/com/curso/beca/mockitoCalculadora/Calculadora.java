package com.curso.beca.mockitoCalculadora;

public class Calculadora {
	
	//INYECTAR
	CloudCalculadora cloudCalc;
	
	double sumaCloud(double a,double b) {
		double resultadoSuma = cloudCalc.sumaExterna(a,b);
		return resultadoSuma;
	}

}
