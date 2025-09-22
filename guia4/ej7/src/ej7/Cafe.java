package ej7;

public class Cafe extends Infusion{
	private boolean dulce;
	public Cafe(boolean dulce) {
		this.dulce = dulce;
	}
	@Override
	void agregarTipoInfusion() {
		System.out.println("Se agrega cafe molido a la taza");
	}
	
	@Override
	void endulzar()
	{
		if(dulce)
			System.out.println("Se agrega azucar a la bebida");
		else
			super.endulzar(); // Usa la funcion por defecto en la clase Infusion
	}
	

}
