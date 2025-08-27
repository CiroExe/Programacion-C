package ej3g2;

public class CuentaBancaria {
	private double saldo;
	private String titular;
	
	public CuentaBancaria(String titular)
	{
		this.titular = titular;
	}
	
	public void depositar (double monto)
	{
		if (monto >= 0)
		{
			this.saldo += monto;
		}
		else
			System.out.println("Monto no permitido");
	}
	
	public boolean extraer(double monto)
	{
		if (monto > 0)
		{
			if (monto > saldo)
				return false;
			else {
				this.saldo -= monto ;
				return true;
			}
		}
		else
			return false;
			
	}
	
	public String getTitular()
	{
		return titular;
	}
}
