package ej8g2;
import java.util.HashMap;
import java.util.ArrayList;

public class Campeonato {
	private String nombre;
	private static Campeonato instancia;
	public HashMap<String, Equipo> equipos = new HashMap<>();
	public ArrayList<Partido> partidos = new ArrayList<>();
	
	private Campeonato()
	{
		this.nombre = "Torneo Argentino 2025";
	}
	
	public static Campeonato getInstancia()
	{
		if (instancia == null)
			instancia = new Campeonato();
		return instancia;
	}
	
	public void addEquipo(String clave, Equipo equipo)
	{
		if(equipos.containsKey(equipo))
			System.out.println("El equipo ya existe");
		else {
			equipos.put(clave, equipo);
		}
	}
	
	public void addPartido(Partido p)
	{
		partidos.add(p);
	}
	
	public Equipo mayorPuntaje(Equipo equipo1, Equipo equipo2)
	{
		if(equipo1.getPuntos() > equipo2.getPuntos())
			return equipo1;
		else if (equipo2.getPuntos() > equipo1.getPuntos())
			return equipo2;
		else if(equipo1.getAFavor() > equipo2.getAFavor())
			return equipo1;
		else if (equipo2.getAFavor() > equipo1.getAFavor())
			return equipo2;
		else if (equipo1.getEnContra() < equipo2.getEnContra())
			return equipo1;
		else
			return equipo2;
	}
	
	public int getPuntaje(Equipo equipo)
	{
		return equipo.getPuntos();
	}
	
	public int getCantJugados(Equipo equipo)
	{
		return equipo.getPartidosJugados();
	}
	
	
}
