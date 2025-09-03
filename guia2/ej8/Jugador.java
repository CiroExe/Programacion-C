package ej8g2;

public class Jugador {
	private String nombre;
	private int anio;
	private int num;
	private int pos;
	private int cantJugados;
	private int cantConvertidos;
	private Equipo equipo;
	
	public Jugador(String nombre, Equipo equipo)
	{
		this.nombre = nombre;
		this.equipo = equipo;
	}
	
	public Jugador(String nombre, Equipo equipo,int anio)
	{
		this(nombre, equipo);
		this.anio = anio;
	}
	
	public Jugador (String nombre, Equipo equipo,int anio, int num, int pos)
	{
		this(nombre,equipo,anio);
		this.num = num;
		this.pos = pos;
	}
	
	public void setEquipo(Equipo equipo)
	{
		this.equipo = equipo;
	}
	
	public void registrarPartidoJugado()
	{
		this.cantJugados++;
	}
	
	public void registrarGoles()
	{
		this.cantConvertidos ++;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getPartidosJugados()
	{
		return cantJugados;
	}
	
	public double getPromedioGoles()
	{
		return cantConvertidos / cantJugados;
	}
	
	public Equipo getEquipo()
	{
		return equipo;
	}
	
}
