package prueba;


import modelo.Tren;
import modelo.ViaCompartida;
import modelo.ViaCompartidaCaso1;
import modelo.ViaCompartidaCaso2;
import modelo.ViaCompartidaCaso3;
import modelo.ViaCompartidaCaso4;

public class prueba {
	public static void main(String[] args) {
		ViaCompartida monitor = new ViaCompartidaCaso1();
		ViaCompartida monitor2 = new ViaCompartidaCaso2();
		ViaCompartida monitor3 = new ViaCompartidaCaso3();
		ViaCompartida monitor4 = new ViaCompartidaCaso4();
		
		/*Tren t1 = new Tren("Tren A", "A", monitor);
		Tren t2 = new Tren("Tren B", "B", monitor);
		Tren t3 = new Tren("Tren C", "B", monitor);
		Tren t4 = new Tren("Tren D", "A", monitor);*/
		
		/*Tren t1 = new Tren("Tren A", "A", monitor2);
		Tren t2 = new Tren("Tren B", "B", monitor2);
		Tren t3 = new Tren("Tren C", "B", monitor2);
		Tren t4 = new Tren("Tren D", "A", monitor2);*/
		
		/*Tren t1 = new Tren("Tren A", "A", monitor3);
		Tren t2 = new Tren("Tren B", "B", monitor3);
		Tren t3 = new Tren("Tren C", "B", monitor3);
		Tren t4 = new Tren("Tren D", "A", monitor3);*/
		
		Tren t1 = new Tren("Tren A", "A", monitor4);
		Tren t2 = new Tren("Tren B", "B", monitor4);
		Tren t3 = new Tren("Tren C", "B", monitor4);
		Tren t4 = new Tren("Tren D", "A", monitor4);
		Tren t5 = new Tren("Tren E", "A", monitor4);
		Tren t6 = new Tren("Tren F", "A", monitor4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
