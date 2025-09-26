package ej7;

public class Aire extends ElemDecorator{

	public Aire(IPersonaje p) {
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
		return personaje.getAtaqueDistante() * 1.1;
	}
	
	@Override
	public double getArmadura()
	{
		return personaje.getArmadura() * 0.1;
	}
	
	public void invocarHuracan()
	{
		System.out.println("Invocando hurancan...");
	}
}
