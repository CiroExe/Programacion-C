package ej6g2;
import java.util.ArrayList;

public class Estacion {
	private String nombreEstacion;
	private ArrayList <Surtidor> surtidores = new ArrayList<Surtidor>();
	
	public void setNombre(String nombre)
	{
		this.nombreEstacion = nombre;
	}
	
	public void agregaSurtidor(Surtidor surtidor)
	{
		this.surtidores.add(surtidor);
	}
	
	public void eliminarSurtidor(Surtidor surtidor)
	{
		this.surtidores.remove(surtidor);
	}
	
	public ArrayList <Surtidor> getSurtidores(){
		return surtidores;
	}
	
	public int getCantSurtidores()
	{
		return surtidores.size();
	}
	
	public int CantLitrosCombustible(int tipo)
	{
		int litros = 0;
		switch(tipo)
		{
		case 1: 
			for(int i=0 ; i<surtidores.size(); i++)
			{
				litros += surtidores.get(i).getCantGasoil();
			}
			break;
		case 2:
			for(int i=0 ; i<surtidores.size(); i++)
			{
				litros += surtidores.get(i).getCantPremium();
			}
			break;
		case 3: 
			for(int i=0 ; i<surtidores.size(); i++)
			{
				litros += surtidores.get(i).getCantSuper();
			}
			break;
		}
		return litros;
	}
	
	public int getSurtidorMaxVentas(int tipo)
	{
		int max = -1, maxIndex=0;
		switch (tipo)
		{
		case 1: 
			for(int i=0; i<surtidores.size(); i++)
			{
				if(surtidores.get(i).getCantVentasGasoil() > max)
				{
					max = surtidores.get(i).getCantVentasGasoil();
					maxIndex = surtidores.get(i).getNumSurtidor();
				}
			}
			break;
		case 2: 
			for(int i=0; i<surtidores.size(); i++)
			{
				if(surtidores.get(i).getCantVentasPremium() > max)
				{
					max = surtidores.get(i).getCantVentasPremium();
					maxIndex = surtidores.get(i).getNumSurtidor();
				}
			}
			break;
		case 3: 
			for(int i=0; i<surtidores.size(); i++)
			{
				if(surtidores.get(i).getCantVentasSuper() > max)
				{
					max = surtidores.get(i).getCantVentasSuper();
					maxIndex = surtidores.get(i).getNumSurtidor();
				}
			}
			break;
		}
		return maxIndex;
	}
	
	public int getHistoricoCombustible(int combustible)
	{
		int acum = 0;
		switch (combustible)
		{
		case 1: 
			for(int i=0; i<surtidores.size(); i++)
			{
				acum += surtidores.get(i).getHistoricoGasoil();
			}
			break;
		case 2: 
			for(int i=0; i<surtidores.size(); i++)
			{
				acum += surtidores.get(i).getHistoricoPremium();
			}
			break;
		case 3: 
			for(int i=0; i<surtidores.size(); i++)
			{
				acum += surtidores.get(i).getHistoricoSuper();
			}
			break;
		}
		return acum;
	}
	
	public int getHistoricoSurtidor(Surtidor surtidor)
	{
		return surtidores.get(surtidores.indexOf(surtidor)).getHistoricoSurtidor();
	}
	
	public int getHistoricoEstacion()
	{
		int acum = 0;
		for(int i=0; i<surtidores.size(); i++)
		{
			acum += surtidores.get(i).getHistoricoSurtidor();
		}
		return acum;
	}
}
