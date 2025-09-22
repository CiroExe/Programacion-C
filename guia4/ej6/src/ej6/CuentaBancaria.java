package ej6;

public abstract class CuentaBancaria {
	private String nombreTitular;
	private double saldo;
	
	public CuentaBancaria(String nombre)
	{
		this.nombreTitular = nombre;
		this.saldo= 0;
	}
	
	// Método Template
    public final void extraer(double monto) {
        if (validaExtraccion(monto)) {
            saldo -= monto;
            System.out.println("Extracción de " + monto + " realizada. Saldo: " + saldo);
        } else {
            System.out.println("Extracción de " + monto + " denegada. Saldo: " + saldo);
        }
    }
	
	//Por defecto
	public boolean validaExtraccion(double unMonto)
	{
		return saldo >= unMonto;
	}
	
	public String getTitular()
	{
		return nombreTitular;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	
	public void depositar(double monto)
	{
		this.saldo += monto;
	}
	

}
