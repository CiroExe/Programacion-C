package ej3g3;

public class CuentaCorriente extends CuentaBancaria
{
	private double topePactado;
	public CuentaCorriente(String titular, double pactado) {
		super(titular);
		this.topePactado = pactado;
	}
	
	public void setTope(double tope)
	{
		this.topePactado = topePactado;
	}
	
	public double getTope()
	{
		return topePactado;
	}
	
	@Override
	public boolean extraerDinero(double cantidad)
	{
		boolean extrajo = true;
		if(cantidad <= this.topePactado)	
		{
			saldo -= cantidad;
		}else {
			extrajo = false;
		}
		return extrajo;
	}
	
	

}
