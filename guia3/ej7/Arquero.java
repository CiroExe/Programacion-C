package ej7g3;

public class Arquero extends Jugador{
	private double efectividad;
	public Arquero(String nombre, double velocidad, double potencia) {
		super(nombre, velocidad, potencia);
		this.efectividad = 0.5;
	}

	public void setEfectividad(double efectividad)
	{
		if(efectividad >=0 && efectividad <=1)
			this.efectividad = efectividad;
		else {
			System.out.println("Efectividad no valida");
		}
	}
	
	public double getEfectividad()
	{
		return efectividad;
	}
	@Override
	public double indiceDefensa()
	{
		double velocidad = getVelocidad();
		return Math.pow(velocidad, 2);
	}
	
	@Override
	public double indiceAtaque()
	{
		double potencia = getPotencia();
		return Math.pow(potencia, 2);
	}
	
	@Override
	public String toString() {
		return "Nombre del jugador: " + this.getNombre() + "\nPosicion: Arquero\nPotencia: " + this.getPotencia() + "\nVelocidad: "+getVelocidad();
	}

}
