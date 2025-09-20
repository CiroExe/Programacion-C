package ej3;

public class TorretaVigilancia extends Edificio implements IConstruible, IHostil, IPosicionable{

	public TorretaVigilancia(String equipo, int costo, int energia, int X, int Y) {
		super(equipo, 200, 2000, X, Y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Unidad adversario) {
		adversario.recibeDano(10);
		
	}

	@Override
	public int getTiempoConstruccion() {
		return 40;
	}

	@Override
	public int getX() {
		return super.X;
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
		double dano = cantidad;
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
