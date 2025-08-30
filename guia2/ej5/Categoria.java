package ej5g2;

public class Categoria {
	private String nombrecategoria;
	private double sueldo;
	
	public Categoria(String nombrecategoria)
	{
		this.nombrecategoria = nombrecategoria;
	}
	
	public void setSueldo(double sueldo)
	{
		this.sueldo = sueldo;
	}
	
	public double getSueldo()
	{
		return sueldo;
	}
	
	public String getNombre()
	{
		return nombrecategoria;
	}
	
}
