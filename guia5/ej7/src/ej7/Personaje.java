package ej7;

public abstract class Personaje implements IPersonaje{
	private double armadura;
	private double ataqueDistante;
	private double ataqueCorto;
	
	public Personaje(double armadura, double ataqueDistante, double ataqueCorto) {
		this.armadura = armadura;
		this.ataqueDistante = ataqueDistante;
		this.ataqueCorto = ataqueCorto;
	}

}
