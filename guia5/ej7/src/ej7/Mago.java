package ej7;

public class Mago extends Personaje{

	public Mago() {
		super(500, 70, 50);
	}

	@Override
	public double getAtaqueDistante() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public double getAtaqueCorto() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public double getArmadura() {
		// TODO Auto-generated method stub
		return 500;
	}

}
