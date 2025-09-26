package ej2;

public class ExtraccionInvalidaException extends Exception{
	
	private Dato_Extraccion_Invalido DatoInvalido;
	
	public ExtraccionInvalidaException(Dato_Extraccion_Invalido DatoInvalido) {
		super("Extraccion invalida de $"+DatoInvalido.getExtraccion_solicitada());
		this.DatoInvalido = DatoInvalido;
	}

	public Dato_Extraccion_Invalido getDatoInvalido() {
		System.out.println(DatoInvalido.getExtraccion_solicitada());
		return DatoInvalido;
	}
	

}
