package ej4g4;

public abstract class VehiculosPasajeros extends Vehiculo{
	private int cantPlazas;
	public VehiculosPasajeros(String patente, int cantPlazas)
	{
		super(patente);
		this.cantPlazas = cantPlazas;
	}

	public int getCantPlazas()
	{
		return cantPlazas;
	}
}
