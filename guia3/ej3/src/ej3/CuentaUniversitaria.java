package ej3g3;

public class CuentaUniversitaria extends CuentaBancaria {
	final static double limite = 1000;
	private double extraidoHoy;
	
	
	public CuentaUniversitaria(String titular)
	{
		super(titular);
		this.extraidoHoy = 0;
	}
	
	public double getLimite()
	{
		return limite;
	}
	
	public double getExtraidoHoy()
	{
		return extraidoHoy;
	}
	
	@Override
	public boolean extraerDinero(double cantidad)
	{
		boolean extrajo = true;
		if(cantidad + extraidoHoy <= limite)
		{
			if(cantidad <= this.getSaldo())
			{
				extraidoHoy += cantidad;
				saldo -= cantidad;
			}else
				extrajo = false;
		}else
			extrajo = false;
		return extrajo;
	}
	
}
