package ej3;

public abstract class Edificio extends Unidad implements IConstruible, IPosicionable{

	public Edificio(String equipo, int costo, int energia, int X, int Y) {
		super(equipo, costo, energia, X, Y);
	}

}
