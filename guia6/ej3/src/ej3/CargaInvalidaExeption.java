package ej3;

public class CargaInvalidaExeption extends Exception {
	DatoCargaInvalido datoCargaInvalido;
	

	public CargaInvalidaExeption (String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible)
	{
		super(mensaje);
		this.datoCargaInvalido = new DatoCargaInvalido(combustible, cantidadRequerida, cantidadDisponible);
		
	}


	public DatoCargaInvalido getDatoCargaInvalido() {
		return datoCargaInvalido;
	}
	
	
}
