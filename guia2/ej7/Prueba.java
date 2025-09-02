package ej7g2;

public class Prueba {

	public static void main(String[] args) {
		Agenda agenda = new Agenda("agenda");
		Contacto contacto1 = new Contacto("Ciro", "4531234");
		Contacto contacto2 = new Contacto("Jeronimo", "4531234");
		Contacto contacto3 = new Contacto("Sebastian", "4531234");
		Contacto contacto4 = new Contacto("Marcelo", "4531234");
		
		contacto1.addCelular("2236478125");
		contacto2.addCelular("2236253212");
		contacto3.addCelular("2238744178");
		contacto4.addCelular("2236479845");
		
		agenda.addContacto(contacto1);
		agenda.addContacto(contacto2);
		agenda.addContacto(contacto3);
		agenda.addContacto(contacto4);

		System.out.println(agenda.toString());
		

	}

}
