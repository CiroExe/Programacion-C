package ej3;

public class FaltaCombustibleException extends CargaInvalidaExeption {
	public FaltaCombustibleException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible)
	{
		super(mensaje, combustible, cantidadRequerida, cantidadDisponible);
	}
}
