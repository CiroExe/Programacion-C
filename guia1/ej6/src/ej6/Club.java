package ej6;

public class Club {
	private String nomClub;
	
	public void setNombre(String nombreClub) 
	{
		this.nomClub = nombreClub;
	}
	
	public String getNombre() 
	{
		return nomClub;
	}
	
	public double calcularCuota(Socio socio)
	{
		int cuota = 500;
		
		if(socio.getEdad() > 65)
		{
			return cuota / 1.5;
		}else {
			if(socio.getEdad() < 18 && socio.getRepresenta())
				return cuota/1.25;
			else
				return cuota;
		}
	}

}
