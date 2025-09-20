package ej3;

public class Soldado extends Personaje implements IPosicionable, IHostil, IMovible{

	public Soldado(String equipo, int costo, int energia, int X, int Y) {
		super(equipo, costo, energia,X,Y);
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
	
	@Override
	public void mover(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Precondicion:-Verificar que el adversario no sea del mismo equipo
	 * 
	 * Postcondicion: -
	 */
	@Override
	public void atacar(Unidad adversario) {
		if(getEquipo().compareTo(adversario.getEquipo()) != 0) {
			System.out.println("Atacando ");
			adversario.recibeDano(50);
		}else {
			System.out.println("No podes atacar a un compañero del mismo equipo");
		}
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

}
