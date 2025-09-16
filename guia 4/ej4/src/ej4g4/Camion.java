package ej4g4;

public class Camion extends VehiculoCarga{

	public Camion(String patente, double PMA) {
		super(patente, PMA);
	}

	@Override
	public double getAlquiler()
	{
		return super.getAlquiler()*1.40;
	}
	
	@Override
	public String toString()
	{
		return "Tipo de vehiculo: Camion de carga \n" + "Alquiler: " + getAlquiler();
	}
}
