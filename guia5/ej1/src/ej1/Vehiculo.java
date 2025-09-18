package ej1;

public class Vehiculo implements I_Emisor_de_Sonido{
	private String patente;
	private String modelo;
	
	public Vehiculo(String patente, String modelo)
	{
		super();
		this.patente = patente;
		this.modelo = modelo;
	}

	@Override
	public void emiteSonido() {
		
	}
}
