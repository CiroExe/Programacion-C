package ej6;

public class CuentaUniversitaria extends CuentaBancaria{
	private double extraidoHoy;
	private static final double LIMITE_DIARIO = 1000;
	public CuentaUniversitaria(String nombreTitular)
	{
		super(nombreTitular);
	}
	
	@Override
	public boolean validaExtraccion(double unMonto)
	{
		boolean c=false;
		if((getSaldo() > unMonto) && (extraidoHoy - LIMITE_DIARIO != 0) )
		{
			if(extraidoHoy + unMonto < LIMITE_DIARIO) {
				extraidoHoy += unMonto;
				c=true;
			}
		}
		return c;
	}
	
}
