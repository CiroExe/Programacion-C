package ej5g2;

public class Domicilio {
	private String calle;
	private int numero;
	
	public Domicilio(String calle, int numero)
	{
		this.calle = calle;
		this.numero = numero;
	}
	
	public String getCalle()
	{
		return calle;
	}
	
	public int getNumero() 
	{
		return numero;
	}

}
