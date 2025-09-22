package ej7;

public abstract class Infusion {

	public final void preparaInfusion()
	{
		calentarAgua();
		agregarTipoInfusion();
		endulzar(); //Hook
		tomarBebida();
	}
	
	void calentarAgua()
	{
		System.out.println("Calentando el agua");
	}
	
	abstract void agregarTipoInfusion();
	
	//Por defecto la bebida sera amarga
	void endulzar()
	{
		System.out.println("La bebida se tomara amarga");
	}
	
	void tomarBebida()
	{
		System.out.println("Tomando bebida");
	}
}
