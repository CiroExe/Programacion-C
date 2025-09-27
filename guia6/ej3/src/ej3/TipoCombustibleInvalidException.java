package ej3;

public class TipoCombustibleInvalidException extends CargaInvalidaExeption {

	public TipoCombustibleInvalidException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible)
	{
		super(mensaje, combustible, cantidadDisponible, cantidadDisponible);
	}
}
