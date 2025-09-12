package ej7g3;
import java.util.Iterator;

public class Prueba {

	public static void main(String[] args) {
		Equipo e1 = new Equipo("River Plate");
		Equipo e2 = new Equipo("Boca Juniors");
		Equipo e3 = new Equipo("Independiente");
		Equipo e4 = new Equipo("Racing");
		
		System.out.println(e1.addArquero("Franco Armani", 0.5, 0.4));
		System.out.println(e1.addArquero("Jeremias Ledesma", 1.5, 0.4));
		System.out.println(e1.addArquero("Sebastian Lavagnino", 0.5, 1.4));
		System.out.println(e1.addDefensor("Paulo Diaz", 0.8, 0.3));
		System.out.println(e1.addDelantero("Sebastian Driussi", 0.8, 0.7));
		
		
		System.out.println(e2.addArquero("Agustin Marchesin", 0.2, 0.3));
		System.out.println(e2.addDefensor("Ayrton Costa", 0.8, 0.7));
		System.out.println(e2.addDelantero("Edinson Cavano", 0.6, 0.8));

		System.out.println(e3.addArquero("Rodrigo Rey", 0.6, 0.4));
		System.out.println(e3.addDefensor("Kevin Lomonaco", 0.9, 0.8));
		System.out.println(e3.addDelantero("Gabriel Avalos", 0.6, 0.6));

		System.out.println(e4.addArquero("Gabriel Arias", 0.5, 0.4));
		System.out.println(e4.addDefensor("Marcos Rojo", 0.5, 0.6));
		System.out.println(e4.addDelantero("Adrian Martinez", 0.7, 0.7));
		
		Iterator<Jugador> iterador = e1.getJugadores();
		while (iterador.hasNext()) {
		    Jugador j = iterador.next();
		    System.out.println(j.toString());
		}

		Iterator<Jugador> iterador2 = e2.getJugadores();
		while (iterador2.hasNext()) {
		    Jugador j = iterador2.next();
		    System.out.println(j.toString());
		}

		Iterator<Jugador> iterador3 = e3.getJugadores();
		while (iterador3.hasNext()) {
		    Jugador j = iterador3.next();
		    System.out.println(j.toString()); 
		}

		Iterator<Jugador> iterador4 = e4.getJugadores();
		while (iterador4.hasNext()) {
		    Jugador j = iterador4.next();
		    System.out.println(j.toString());
		}


	}

}
