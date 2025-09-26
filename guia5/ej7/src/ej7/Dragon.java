package ej7;

public class Dragon extends Personaje{

	public Dragon() {
		super(10000, 200, 500);
	}

	@Override
	public double getAtaqueDistante() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public double getAtaqueCorto() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public double getArmadura() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
