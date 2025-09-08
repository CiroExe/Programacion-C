package ej5g3;

public class Manual extends Automovil{

	public Manual(String patente) {
		super(patente);
	}

	@Override
	void acelerar(double vel) {
		double auxVel =  (getVelocidad() + vel);
		if(vel > 0)
		{
			if(auxVel <= getVelMax())
				setVelocidad(auxVel);
		}
		
	}
	
	@Override
	void frenar(double vel) {
		double auxVel = getVelocidad() - vel ;
		if(vel > 0) 
		{
			if (auxVel >= 0)
				setVelocidad(auxVel);
		}
	}

	
}
