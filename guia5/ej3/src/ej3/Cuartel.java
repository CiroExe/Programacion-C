package ej3;

public class Cuartel extends Edificio implements IConstruible, IPosicionable{

	public Cuartel(String equipo, int X, int Y) {
		super(equipo, 500, 3000, X, Y);
	}

	@Override
	public int getTiempoConstruccion() {
		return 60;
	}

	@Override
	public int getX() {
		return super.X ;
	}

	@Override
	public int getY() {
		return super.Y;
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
		double dano = cantidad * 0.5;
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
}
