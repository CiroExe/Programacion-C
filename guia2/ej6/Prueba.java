package ej6g2;

public class Prueba {

	public static void main(String[] args) {
		Estacion estacion = new Estacion();
		estacion.setNombre("YPF ");
		Surtidor surtidor1 = new Surtidor();
		Surtidor surtidor2= new Surtidor();
		Surtidor surtidor3 = new Surtidor();
		
		estacion.agregaSurtidor(surtidor1);
		estacion.agregaSurtidor(surtidor2);
		estacion.agregaSurtidor(surtidor3);
		
		for(int i=0; i<estacion.getCantSurtidores(); i++)
		{
			 Surtidor s = estacion.getSurtidores().get(i);
			switch(i)
			{
			case 0: s.extraerGasoil(400);
					s.extraerGasoil(1300);
					s.extraerPremium(12200);
					s.extraerSuper(1400);
					break;
			case 1:	s.extraerGasoil(400);
					s.extraerPremium(100);
					s.extraerSuper(1400);
					break;
			case 2: s.extraerGasoil(450);
					s.extraerPremium(1000);
					s.extraerSuper(1400);
					break;
			}
		}
		
		System.out.println("Cantidad total de surtidores: "+ estacion.getCantSurtidores());
		System.out.println("Litros del combustible Gasoil: "+ estacion.CantLitrosCombustible(1));
		System.out.println("Litros del combustible Premium: "+ estacion.CantLitrosCombustible(2));
		System.out.println("Litros del combustible Super: "+ estacion.CantLitrosCombustible(3));
		System.out.println("Surtidor con mayor ventas de Gasoil: "+ estacion.getSurtidorMaxVentas(1));
		System.out.println("Surtidor con mayor ventas de Premium: "+ estacion.getSurtidorMaxVentas(2));
		System.out.println("Surtidor con mayor ventas de Super: "+ estacion.getSurtidorMaxVentas(3));
		System.out.println("Historico Gasoil: "+ estacion.getHistoricoCombustible(1));
		System.out.println("Historico Premium: "+ estacion.getHistoricoCombustible(2));
		System.out.println("Historico Super: "+ estacion.getHistoricoCombustible(3));
		System.out.println("Historico surtidor "+ estacion.getSurtidores().get(0).getNumSurtidor() + " " + estacion.getHistoricoSurtidor(estacion.getSurtidores().get(0)));
		System.out.println("Historico surtidor "+ estacion.getSurtidores().get(1).getNumSurtidor()  + " " + estacion.getHistoricoSurtidor(estacion.getSurtidores().get(1)));
		System.out.println("Historico surtidor " + estacion.getHistoricoSurtidor(surtidor1));
	}

}
