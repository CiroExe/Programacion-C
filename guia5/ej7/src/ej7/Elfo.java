package ej7;

public class Elfo extends Personaje{

	public Elfo() {
		super(1000, 100, 20);
	}

	@Override
	public double getAtaqueDistante() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public double getAtaqueCorto() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public double getArmadura() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
