package ej2;

public class CuentaBancaria {
	private double saldo;
	private String titular;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
	}
	
	
	public double getSaldo() {
		return saldo;
	}




	public String getTitular() {
		return titular;
	}


	/**
	 * Precondiciones:  -La cantidad pasada por parametros debe ser mayor a 0
	 * Postcondiciones: -Se debe incrementar la cantidad pasada por parametro
	 * @param Cantidad
	 * @throws DepositoInvalidoException
	 */
	public void depositar(double cantidad) throws DepositoInvalidoException
	{
		if(cantidad <= 0)
			throw new DepositoInvalidoException(cantidad);
		this.saldo += cantidad;
	}

	public void extraer(double cantidad) throws ExtraccionInvalidaException
	{
		System.out.println(cantidad);
		if (cantidad <= 0 || cantidad > this.getSaldo())
			throw new ExtraccionInvalidaException(new Dato_Extraccion_Invalido(this.saldo, cantidad));
		this.saldo -= cantidad;
	}
}
