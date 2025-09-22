package ej6;

public class CuentaCorriente extends CuentaBancaria{
	private double pactado;
	
	public CuentaCorriente(String nombreTitular, double pactado)
	{
		super(nombreTitular);
		this.pactado = pactado;
	}
	
	public void modificaTope(double pactado)
	{
		this.pactado = pactado;
	}
	
	@Override
	public boolean validaExtraccion(double unMonto)
	{
		boolean c=false;
		if(getSaldo() - unMonto >= -pactado)
		{
			c=true;
		}
		return c;
	}
}
