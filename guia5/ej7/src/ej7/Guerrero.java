package ej7;

public class Guerrero extends Personaje{

	public Guerrero() {
		super(1500, 100, 100);
	}

	@Override
	public double getAtaqueDistante() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public double getAtaqueCorto() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public double getArmadura() {
		// TODO Auto-generated method stub
		return 1500;
	}

}
