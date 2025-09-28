package ej5;

public class Prueba {

	public static void main(String[] args) {
		Persona p1 = new Persona(45576668, "Ganduglia", new Domicilio("9 de julio", 8123), 456, new Perro("Apolo", 10));
		Persona p2;
		
		try {
			p2 = (Persona) p1.clone();
		}catch(CloneNotSupportedException e) {
			System.err.println(e.toString());
		}
	}

}
