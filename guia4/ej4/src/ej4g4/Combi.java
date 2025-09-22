package ej4g4;

public class Combi extends VehiculosPasajeros{

	public Combi(String patente, int cantPlazas) {
		super(patente, cantPlazas);
	}
	
	@Override
	public double getAlquiler()
	{
		return super.getAlquiler() * (1+(super.getCantPlazas()*2));
	}

	@Override
	public String toString()
	{
		return "Tipo de vehiculo: Combi de pasajeros \n" + "Alquiler: " + getAlquiler();
	}
}
