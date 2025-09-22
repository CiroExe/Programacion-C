package ej7;

public class Prueba {

	public static void main(String[] args) {
		//Como no voy a hacer uso de funciones unicas en las clases que extienden a Infusion declaro todas las bebidas como Infusion
		Infusion mate = new Mate();
		Infusion cafe1 = new Cafe(true);
		Infusion cafe2 = new Cafe(false);

		mate.preparaInfusion();
		cafe1.preparaInfusion();
		cafe2.preparaInfusion();
	}

}
