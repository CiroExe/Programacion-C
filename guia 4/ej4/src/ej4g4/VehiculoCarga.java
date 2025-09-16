package ej4g4;

public abstract class VehiculoCarga extends Vehiculo{
	private double PMA;
	
	public VehiculoCarga(String patente, double PMA)
	{
		super(patente);
		this.PMA = PMA;
	}
	
	public double getPMA()
	{
		return PMA;
	}

}
