package com.curso.v1;

public class Inyector {
	
	static Computadora cw = new CompuWindows("Vista");
	static Computadora cl = new CompuLinux("Ubunto 18");
	//Return Becario con su computadora inyectada
	static void inyectarPc(Becario bec, String tipoPc) {
		if (tipoPc == "Windows")
			bec.computadora = cw;
		else bec.computadora = cl;
	}

}
