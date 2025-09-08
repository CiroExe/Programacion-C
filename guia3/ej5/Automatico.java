package ej5g3;

public class Automatico extends Automovil{

	public Automatico(String patente) {
		super(patente);
		// TODO Auto-generated constructor stub
	}

	public void registraMarcha()
	{
		double velocidad = getVelocidad();
		if (velocidad == 0)
			setMarcha(0);
		else if(velocidad > 0 && velocidad <=10)
			setMarcha(1);
		else if(velocidad >10 && velocidad <= 35)
			setMarcha(2);
		else if(velocidad >35 && velocidad <= 50)
			setMarcha(3);
		else if(velocidad >50 && velocidad <= 90)
			setMarcha(4);
		else if(velocidad >90)
			setMarcha(5);
	}
	
	@Override
	void acelerar(double vel) {
		if(vel > 0) //No puede ser negativo
		{
			double auxVel = getVelocidad() + vel;
			double velMax = getVelMax();
			if(auxVel > velMax)
			{
				setVelocidad(velMax);
			}else {
				setVelocidad(auxVel);
			}
			registraMarcha();
		}
	}

	@Override
	void frenar(double vel) {
		if(vel > 0)
		{
			double velocidad = getVelocidad();
			if(velocidad > 0) {
				double auxVel = getVelocidad() - vel;
				if(auxVel < 0)
					setVelocidad(0);
				else {
					setVelocidad(auxVel);
				}
			}
			registraMarcha();
		}
		
	}

	
}
