package ej7;

public class Hechicera extends Personaje{

	public Hechicera() {
		super(1000, 50, 70);
	}

	@Override
	public double getAtaqueDistante() {
		return 50;
	}

	@Override
	public double getAtaqueCorto() {
		return 70;
	}

	@Override
	public double getArmadura() {
		return 1000;
	}

}
