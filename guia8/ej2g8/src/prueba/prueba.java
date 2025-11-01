package prueba;

import modelo.MonitorMostrador;
import modelo.Persona;

public class prueba {

	public static void main(String[] args) {
		MonitorMostrador monitor = new MonitorMostrador(2);
		Persona p1 = new Persona("Ciro", monitor);
		Persona p2 = new Persona("Elias", monitor);
		Persona p3 = new Persona("Matias", monitor);
		Persona p4 = new Persona("Nicolas", monitor);
		
		p1.start();
		p2.start();
		//p3.start();
		//p4.start();

	}

}
