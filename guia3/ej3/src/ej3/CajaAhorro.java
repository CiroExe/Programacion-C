package ej3g3;

public class CajaAhorro extends CuentaBancaria {
	static int  maxExtracciones = 30;
	private int cantExtracciones;
	
	public CajaAhorro(String titular)
	{
		super(titular);
		this.cantExtracciones = 0;
	}
	
	public void setMaxExtracciones(int max)
	{
		this.maxExtracciones = max;
	}
	
	public int getMaxExtracciones()
	{
		return maxExtracciones;
	}
	
	@Override
	public boolean extraerDinero(double cantidad)
	{
		boolean extrajo = true;
		if(cantidad <= this.getSaldo())
		{
			if(cantExtracciones <= maxExtracciones)
			{
				saldo -= cantidad;
			}
			else
				extrajo = false;
		}else
			extrajo = false;
		return extrajo;
	}
}
