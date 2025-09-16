package ej4g4;

public class CamionetaCarga extends VehiculoCarga{

	public CamionetaCarga(String patente, double PMA) {
		super(patente, PMA);
	}
	
	/**
	 * Sobreescribe metodo de la clase padre para devolver el precio final
	 * Precondiciones:
	 * 	-Verificar que el PMA sea mayor o igual a 1.5 toneladas
	 * Postcondiciones:
	 */
	
	@Override
	public double getAlquiler()
	{
		double incremento = 0.20*super.getPMA();
		if(super.getPMA() >= 1.5)
		{
			incremento += 0.30;
		}
		return super.getAlquiler() + incremento;
 	}

	@Override
	public String toString()
	{
		return "Tipo de vehiculo: Camioneta de carga \n" + "Alquiler: " + getAlquiler();
	}
}
