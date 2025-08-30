package ej5g2;

public class Colectivo {
	private String modelo;
	private int numerointerno;
	private static int Generador = 0;
	
	public Colectivo(String modelo)
	{
		this.modelo = modelo;
		this.numerointerno = ++Colectivo.Generador;
	}
	
	public void setNumeroInterno(int numerointerno)
	{
		this.numerointerno = numerointerno;
	}
	
	public String getModelo()
	{
		return modelo;
	}
	
	public int getNumeroInterno()
	{
		return numerointerno;
	}
}
