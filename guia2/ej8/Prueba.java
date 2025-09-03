package ej8g2;
import java.util.ArrayList;
public class Prueba {

	public static void main(String[] args) {
		Campeonato torneo = Campeonato.getInstancia();
		Equipo e1 = new Equipo("River Plate");
		Equipo e2 = new Equipo("Boca Juniors");
		Jugador j1 = new Jugador("Ciro Ganduglia", e1);
		Jugador j2 = new Jugador("Federico Valverde", e2);
		Jugador j3 = new Jugador("Fabricio Bustos", e1);
		Jugador j4 = new Jugador("Edinson Cavani", e2);
		Jugador j5 = new Jugador("Miguel Merentiel", e2);
		e1.addJugador(j1);
		e1.addJugador(j3);
		e2.addJugador(j2);
		e2.addJugador(j5);
		e2.addJugador(j4);
		torneo.addEquipo("River Plate", e1);
		torneo.addEquipo("Boca Juniors", e2);
		
		Partido partido1 = new Partido(e1, e2, 1);
		partido1.addGol(j1);
		partido1.addGol(j1);
		partido1.addGol(j1);
		partido1.addGol(j2);
		torneo.addPartido(partido1);
		//Resultado 3-1
		Partido partido2 = new Partido(e1, e2, 1);
		partido2.addGol(j1);
		partido2.addGol(j1);
		partido2.addGol(j1);
		partido2.addGol(j2);
		torneo.addPartido(partido2);
		
		Partido partido3 = new Partido(e2, e1, 1);
		partido3.addGol(j2);
		torneo.addPartido(partido3);
	
		for(int i=0; i<torneo.partidos.size(); i++)
		{
			torneo.partidos.get(i).setResultado();
		}
		System.out.println("Mayor Puntaje: "+ torneo.mayorPuntaje(e1, e2).getNombre());
		
		System.out.println("Puntaje: "+ torneo.getPuntaje(e1));
		System.out.println("Puntaje: "+ torneo.getPuntaje(e2));
		
		System.out.println(e1);
		System.out.println(e2);
		
		
	}

}
