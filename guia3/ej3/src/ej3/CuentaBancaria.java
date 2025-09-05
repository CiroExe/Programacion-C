package ej3g3;

public abstract class CuentaBancaria {
	private String titular;
	protected double saldo;
	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
		this.saldo = 0;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean extraerDinero(double cantidad)
	{
		boolean extrajo = cantidad >= this.saldo;
		if(extrajo)
		{
			this.saldo -=cantidad;
			if (this.saldo < 0)
				this.saldo = 0;
		}
		return extrajo;
	}
	public void depositarDinero(double cantidad)
	{
		this.saldo += cantidad;
	}
}
