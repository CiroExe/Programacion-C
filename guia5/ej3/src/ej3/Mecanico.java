package ej3;

public class Mecanico extends Personaje implements IPosicionable, IMovible{

	public Mecanico(String equipo, int costo, int energia, int X, int Y) {
		super(equipo, 40, 100,X,Y);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Precondicion:-Cantidad mayor a 0
	 * 				-Vida positiva
	 *
	 * Postcondicion:-Que la vida del personaje sea 0 cuando se termina la energia
	 */
	@Override
	public void recibeDano(int cantidad)
	{
		int vida = getEnergia();
		double dano = cantidad * 2.5;
		if(cantidad > 0)
		{
			if(vida - dano <= 0) {
				vida = 0;
				setEnergia(vida);
			}else {
				vida -= dano;
				setEnergia(vida);
			}
		}
	}

	@Override
	public void mover(int x, int y) {
	}

	@Override
	public int getX() {
		return super.X;
	}

	@Override
	public int getY() {
		return super.Y;
	}

}
