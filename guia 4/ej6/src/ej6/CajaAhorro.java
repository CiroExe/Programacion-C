package ej6;

public class CajaAhorro extends CuentaBancaria{
	private int maxExtracciones = 2;
	private int extracciones = 0;
	public CajaAhorro(String nombreTitular)
	{
		super(nombreTitular);	
	}	
	
	@Override
	public boolean validaExtraccion(double unMonto)
	{
		boolean c=false;
		if((getSaldo() >= unMonto) && (extracciones < maxExtracciones)) {
			extracciones++;
			c=true;
		}
		return c;
	}
}
