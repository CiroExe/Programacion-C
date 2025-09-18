package ej1;

public class Ambulancia extends Vehiculo implements I_Emisor_de_Sonido {

	public Ambulancia(String patente, String modelo) {
		super(patente, modelo);
	}
	
	@Override
	public void emiteSonido()
	{
		System.out.println("Sirena sonando");
	}

}
