package ej6g2;

public class Surtidor {
	private int cantGasoil;
	private int cantPremium;
	private int cantSuper;
	private int maximaCarga;
	private int cantVentasGasoil;
	private int cantVentasPremium;
	private int cantVentasSuper;
	private int historicoGasoil;
	private int historicoPremium;
	private int historicoSuper;
	private int numeroInterno;
	private static int numSurtidor;
	private int historicoSurtidor;
	
	public Surtidor()
	{
		this.cantGasoil = 20000;
		this.cantPremium = 20000;
		this.cantSuper = 20000;
		this.maximaCarga = 20000;
		this.cantVentasGasoil = 0;
		this.cantVentasPremium = 0;
		this.cantVentasSuper = 0;
		this.historicoGasoil = 0;
		this.historicoPremium = 0;
		this.historicoSuper = 0;
		this.numeroInterno = ++Surtidor.numSurtidor;
		this.historicoSurtidor = 0;
	}
	
	public int getNumSurtidor()
	{
		return numeroInterno;
	}
	
	public boolean extraerGasoil(int litros)
	{
		if(this.cantGasoil >= litros)
		{
			this.cantGasoil -= litros;
			this.cantVentasGasoil += 1;
			this.historicoGasoil += litros;
			this.historicoSurtidor += litros;
			return true;
		}else {
			this.historicoGasoil += this.cantGasoil;
			this.historicoSurtidor += this.cantGasoil;
			this.cantGasoil = 0;
			return false;
		}
	}
	
	public boolean extraerPremium(int litros)
	{
		if(this.cantPremium >= litros)
		{
			this.cantPremium -= litros;
			this.cantVentasPremium += 1;
			this.historicoPremium += litros;
			this.historicoSurtidor += litros;
			return true;
		}else {
			this.historicoPremium += this.cantPremium;
			this.historicoSurtidor += this.cantPremium;
			this.cantPremium = 0;
			return false;
		}
	}
	
	public boolean extraerSuper(int litros)
	{
		
		if(this.cantSuper >= litros)
		{
			this.cantSuper -= litros;
			this.cantVentasSuper += 1;
			this.historicoSuper += litros;
			this.historicoSurtidor += litros;
			return true;
		}else {
			this.historicoSuper += this.cantSuper;
			this.historicoSurtidor += this.cantSuper;
			this.cantSuper = 0;
			return false;
		}
	}
	
	public int getCantGasoil()
	{
		return cantGasoil;
	}
	
	public int getCantPremium()
	{
		return cantPremium;
	}
	
	public int getCantSuper()
	{
		return cantSuper;
	}
	
	public void llenarDepositoGasoil()
	{
		this.cantGasoil = 20000;
	}
	
	public void llenarDepositoPremium()
	{
		this.cantPremium = 20000;
	}
	
	public void llenarDepositoSuper()
	{
		this.cantSuper = 20000;
	}
	
	public int getCantVentasGasoil()
	{
		return cantVentasGasoil;
	}
	
	public int getCantVentasPremium()
	{
		return cantVentasPremium;
	}
	
	public int getCantVentasSuper()
	{
		return cantVentasSuper;
	}
	
	public int getHistoricoGasoil()
	{
		return historicoGasoil;
	}
	
	public int getHistoricoPremium()
	{
		return historicoPremium;
	}
	
	public int getHistoricoSuper()
	{
		return historicoSuper;
	}
	
	public int getHistoricoSurtidor()
	{
		return historicoSurtidor;
	}
	
}
