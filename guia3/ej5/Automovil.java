package ej5g3;

public abstract class Automovil {
	private String patente;
	private double velocidad;
	private double velMax;
	private int marcha;
	
	public Automovil(String patente, double velMax)
	{
		super();
		this.patente = patente;
		this.velMax = velMax;
	}
	
	public Automovil(String patente)
	{
		this(patente, 160);
	}
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public double getVelMax() {
		return velMax;
	}
	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}
	public int getMarcha() {
		return marcha;
	}
	protected void setMarcha(int marcha) {
		if(marcha >=-1 && marcha <= 5)
			this.marcha = marcha;
	}
	
	abstract void acelerar(double vel);
	
	abstract void frenar(double vel);
	
	@Override 
	public String toString()
	{
		return " Patente: " + this.patente +"\n Velocidad: "+this.velocidad+"\n Marcha: "+this.marcha ;
		
	}
}
