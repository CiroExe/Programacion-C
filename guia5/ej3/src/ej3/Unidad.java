package ej3;

public abstract class Unidad{
	private String equipo;
	private int costo;
	private int energia;
	protected int X, Y;
	

	public Unidad(String equipo, int costo, int energia, int X, int Y)
	{
		super();
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
		this.X = X;
		this.Y = Y;
	}
	
	abstract void recibeDano(int cantidad);

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public void setX(int x) {
		X = x;
	}

	public void setY(int y) {
		Y = y;
	}

}
