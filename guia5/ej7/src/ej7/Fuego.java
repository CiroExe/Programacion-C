package ej7;

public class Fuego extends ElemDecorator{

	public Fuego(IPersonaje p) {
		super(p);
	}

	@Override
	public double getAtaqueCorto()
	{
		return personaje.getAtaqueCorto() * 1.8;
	}
	
	@Override
	public double getAtaqueDistante()
	{
		return personaje.getAtaqueDistante() * 1.7;
	}
	
	@Override
	public double getArmadura()
	{
		return personaje.getArmadura() * 0.5;
	}
	
	public void Incendiar()
	{
		System.out.println("Incendiando");
	}
}
