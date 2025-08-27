package ej4g2;

public class Producto {
	private int numCod;
	private double precioUni;
	private String descripcion;
	
	public Producto(int numCod, String descripcion, double precioUni)
	{
		this.numCod = numCod;
		this.descripcion = descripcion;
		this.precioUni = precioUni;
	}
	
	public void setPrecio(int precioUni)
	{
		this.precioUni = precioUni;
	}
	
	public int getNum()
	{
		return numCod;
	}
	
	public double getPrecio()
	{
		return precioUni;
	}
	
	public String getDesc()
	{
		return descripcion;
	}	

}
