package ej3;

public class Surtidor {
	private double cantidadDiesel;
	private double cantidadPremium;
	private double cantidadSuper;
	
	public Surtidor()
	{
		this.llenarDiesel();
		this.llenarPremium();
		this.llenarSuper();
	}
	
	public void cargarCombustible(String combustible, double cantidad) throws CargaInvalidaExeption, TipoCombustibleInvalidException, FaltaCombustibleException
	{
		if(cantidad <= 0) {
			if(combustible.equalsIgnoreCase("diesel")) {throw new CargaInvalidaExeption("Cantidad negativa", combustible, cantidad, this.getCantidadDiesel());}
			else if(combustible.equalsIgnoreCase("premium")) {throw new CargaInvalidaExeption("Cantidad negativa", combustible, cantidad, this.getCantidadPremium());}
			else if(combustible.equalsIgnoreCase("super")) {throw new CargaInvalidaExeption("Cantidad negativa", combustible, cantidad, this.getCantidadSuper());}
		}
		else if ( !combustible.equalsIgnoreCase("premium") &&
			      !combustible.equalsIgnoreCase("diesel") &&
			      !combustible.equalsIgnoreCase("super"))
			    throw new TipoCombustibleInvalidException("Tipo de combustible invalido", combustible, cantidad, getCantidadCombustible(combustible));
		else if((cantidad > cantidadDiesel) || (cantidad > cantidadPremium) || (cantidad > cantidadSuper))
				throw new FaltaCombustibleException("No hay combustible", combustible, cantidad, getCantidadCombustible(combustible));
		if(combustible.equalsIgnoreCase("diesel")) {this.cantidadDiesel -= cantidad;}
		else if(combustible.equalsIgnoreCase("premium")) {this.cantidadPremium -= cantidad;}
		else if(combustible.equalsIgnoreCase("super")) {this.cantidadSuper -= cantidad;}
		
	}
	
	public double getCantidadCombustible(String combustible) {
		double cantidad = 0;
		if(combustible.equalsIgnoreCase("diesel"))
			cantidad = this.getCantidadDiesel();
		else if (combustible.equalsIgnoreCase("premium"))
			cantidad = this.getCantidadPremium();
		else if (combustible.equalsIgnoreCase("super"))
			cantidad = this.getCantidadSuper();
		return cantidad;
	}

	
	public double getCantidadDiesel() {
		return cantidadDiesel;
	}



	public double getCantidadPremium() {
		return cantidadPremium;
	}



	public double getCantidadSuper() {
		return cantidadSuper;
	}

	

	public void llenarDiesel()
	{
		this.cantidadDiesel = 20000;
	}
	
	public void llenarPremium()
	{
		this.cantidadPremium = 20000;
	}
	
	public void llenarSuper()
	{
		this.cantidadSuper = 20000;
	}
}
