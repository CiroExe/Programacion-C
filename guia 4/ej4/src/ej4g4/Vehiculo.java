package ej4g4;

public abstract class Vehiculo {
	private String patente;
	private double alquilerXdia;
	private int diasAlquilados;
	
	public Vehiculo(String patente)
	{
		super();
		this.patente = patente;
		this.alquilerXdia = 500;
	}
	
	public double getAlquiler()
	{
		return alquilerXdia;
	}
	
	public String getPatente()
	{
		return patente;
	}

}
