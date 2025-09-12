package ej7g3;

public class Delatero extends Jugador {

	public Delatero(String nombre, double velocidad, double potencia) {
		super(nombre, velocidad, potencia);
	}
	
	@Override
	public double indiceDefensa()
	{
		double velocidad = getVelocidad();
		return velocidad*0.5;
	}
	
	@Override
	public double indiceAtaque()
	{
		double velocidad = getVelocidad();
		double potencia = getPotencia();
		return potencia*velocidad;
	}

	@Override
	public String toString() {
		return "Nombre del jugador: " + this.getNombre() + "\nPosicion: Delantero\nPotencia: " + this.getPotencia() + "\nVelocidad: "+getVelocidad();
	}

}
