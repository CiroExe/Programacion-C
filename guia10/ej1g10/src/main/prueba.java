package main;
import modelo.Mascota;
import controlador.ObservadorMascotas;

public class prueba {

	public static void main(String[] args) {
		ObservadorMascotas observer = new ObservadorMascotas();
		
		Mascota m1 = new Mascota("Bleff");
		m1.addObserver(observer);
		
		Mascota m2 = new Mascota ("Lara");
		m2.addObserver(observer);
		
		
		Mascota m3 = new Mascota ("Apolo");
		m3.addObserver(observer);
	
		
		Mascota m4 = new Mascota ("Titan");
		m4.addObserver(observer);
	
		
		for (int i = 0; i<10; i++) {
			m1.run();
			m2.run();
			m3.run();
			m4.run();
		}
	}

}
