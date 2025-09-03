package ej8g2;
import java.util.ArrayList;

public class Equipo {
	private String nombre;
	ArrayList<Jugador> jugadores = new ArrayList<>();
	private int cantGanados;
	private int cantEmpatados;
	private int cantPerdidos;
	private int golesConvertidos;
	private int aFavor;
	private int enContra;
	
	public Equipo(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void addJugador(Jugador jugador)
	{
		if(jugadores.contains(jugador))
		{
			System.out.println("El jugador ya existe");
		}else {
			jugadores.add(jugador);
		}
	}
	
	
	
	public void deleteJugador(Jugador jugador)
	{
		if(jugadores.contains(jugador))
		{
			jugadores.remove(jugadores.indexOf(jugador));
		}else {
			System.out.println("El jugador no existe");
		}
	}

	public void setGanados()
	{
		this.cantGanados++;
	}
	
	public void setPerdidos()
	{
		this.cantPerdidos++;
	}
	
	public void setEmpatados()
	{
		this.cantEmpatados++;
	}
	
	public void setAFavor(int goles, int golesEnContra)
	{
		this.aFavor = golesConvertidos - enContra; 
	}
	
	public void addGoles(int goles)
	{
		this.golesConvertidos += goles;
	}
	
	public void addGolesEnContra(int goles)
	{
		this.enContra += goles;
	}
	

	public int getPuntos()
	{
		return ((cantGanados*3) + cantEmpatados);
	}
	
	public int getPartidosJugados()
	{
		return cantGanados + cantEmpatados + cantPerdidos;
	}
	
	public int getAFavor()
	{
		return aFavor;
	}
	
	public int getEnContra()
	{
		return enContra;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public ArrayList<Jugador> getJugadores()
	{
		return jugadores;
	}
	
	@Override
	public String toString()
	{
	    String nombres = "";
	    for (Jugador j : jugadores) {
	        nombres += j.getNombre() + ", ";
	    }
	    if (!nombres.isEmpty()) {
	        nombres = nombres.substring(0, nombres.length() - 2); // quitar última coma
	    }
	    return "Equipo: " + this.nombre + "\nJugadores: " + nombres;
	}
}
