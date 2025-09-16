package ej4g4;

public class Auto extends VehiculosPasajeros{

	public Auto(String patente, int plazas) {
		super(patente, plazas);
	}
	
	@Override
	public double getAlquiler()
	{
		return super.getAlquiler() + ((super.getCantPlazas()*1.5)+1);
	}

	@Override
	public String toString()
	{
		return "Tipo de vehiculo: Auto de pasajeros \n" + "Alquiler: " + getAlquiler();
	}
}
