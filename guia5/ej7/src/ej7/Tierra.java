package ej7;

public class Tierra extends ElemDecorator{

	public Tierra(IPersonaje p) {
		super(p);
	}
	
	@Override
	public double getAtaqueCorto()
	{
		return personaje.getAtaqueCorto() * 0.2;
	}
	
	@Override
	public double getAtaqueDistante()
	{
		return personaje.getAtaqueDistante() * 0.3;
	}
	
	@Override
	public double getArmadura()
	{
		return personaje.getArmadura() * 1.25;
	}

}
