package ej7g3;

public class Defensor extends Jugador{

	public Defensor(String nombre, double velocidad, double potencia)
	{
		super(nombre, velocidad, potencia);
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
		return "Nombre del jugador: " + this.getNombre() + "\nPosicion: Defensor\nPotencia: " + this.getPotencia() + "\nVelocidad: "+getVelocidad();
	}
}
