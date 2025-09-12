package ej7g3;
import java.util.ArrayList;
import java.util.Iterator;

public class Equipo {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private String nombre;
	
	public Equipo(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String addArquero(String nombre, double velocidad, double potencia)
	{
		String s="";
		if(velocidad >= 0 && velocidad <= 1)
		{
			if(potencia >= 0 && potencia <=1)
			{
				Jugador nuevoJugador = new Arquero(nombre, velocidad, potencia);
				jugadores.add(nuevoJugador);
				s+="Jugador agregado";
			}else {
				s+="Imposible crear un arquero con potencia = "+ potencia;
			}
		}else {
			s+="Imposible crear un arquero con velocidad = "+ velocidad;
		}
		return s;
	}
	
	public String addDefensor(String nombre, double velocidad, double potencia)
	{
		String s="";
		if(velocidad >= 0 && velocidad <= 1)
		{
			if(potencia >= 0 && potencia <=1)
			{
				Jugador nuevoJugador = new Defensor(nombre, velocidad, potencia);
				jugadores.add(nuevoJugador);
				s+="Jugador agregado";
			}else {
				s+="Imposible crear un defensor con potencia = "+ potencia;
			}
		}else {
			s+="Imposible crear un defensor con velocidad = "+ velocidad;
		}
		return s;
	}
	
	public String addDelantero(String nombre, double velocidad, double potencia)
	{
		String s="";
		if(velocidad >= 0 && velocidad <= 1)
		{
			if(potencia >= 0 && potencia <=1)
			{
				Jugador nuevoJugador = new Delatero(nombre, velocidad, potencia);
				jugadores.add(nuevoJugador);
				s+="Jugador agregado";
			}else {
				s+="Imposible crear un delantero con potencia = "+ potencia;
			}
		}else {
			s+="Imposible crear un delantero con velocidad = "+ velocidad;
		}
		return s;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double indiceDefensa()
	{
		double acum = 0;
		for(Jugador j : jugadores )
		{
			acum += j.indiceDefensa();
		}
		return acum;
	}
	
	public double indiceAtaque()
	{
		double acum = 0;
		for(Jugador j : jugadores )
		{
			acum += j.indiceAtaque();
		}
		return acum;
	}
	
	Iterator<Jugador> getJugadores() 
	{
		return jugadores.iterator();
	}
	
}
