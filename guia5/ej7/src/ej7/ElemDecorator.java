package ej7;

public abstract class ElemDecorator implements IPersonaje{

	protected IPersonaje personaje;
	public ElemDecorator(IPersonaje p) {
		this.personaje = p;
	}
	@Override
	public double getAtaqueDistante() {
		return personaje.getAtaqueDistante();
	}
	@Override
	public double getAtaqueCorto() {
		return personaje.getAtaqueCorto();
	}
	@Override
	public double getArmadura() {
		return personaje.getArmadura();
	}

}
