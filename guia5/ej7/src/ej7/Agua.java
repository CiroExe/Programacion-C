package ej7;

public class Agua extends ElemDecorator{

	public Agua(IPersonaje p) {
		super(p);
	}

	@Override
	public double getAtaqueCorto()
	{
		return personaje.getAtaqueCorto() * 1.2;
	}
	
	@Override
	public double getAtaqueDistante()
	{
		return personaje.getAtaqueDistante();
	}
	
	@Override
	public double getArmadura()
	{
		return personaje.getArmadura() * 0.15;
	}
}
