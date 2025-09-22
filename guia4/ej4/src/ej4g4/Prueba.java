package ej4g4;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(new Auto("ABC100", 4 ));
		vehiculos.add(new Auto("ABC101", 3));
		vehiculos.add(new Combi("ABC102", 20));
		vehiculos.add(new Auto("ABC104", 4));
		vehiculos.add(new Combi("ABC105", 15));
		vehiculos.add(new Camion("ABC106", 1.5));
		vehiculos.add(new Camion("ABC107", 1));
		vehiculos.add(new CamionetaCarga("ABC108", 0.25));
		vehiculos.add(new Camion("ABC109", 1.25));
		vehiculos.add(new CamionetaCarga("ABC110", 0.5));
		
		double acum = 0;
		for(Vehiculo v : vehiculos)
		{
			//System.out.println(v.getPatente() + "  "+v.getAlquiler());
			System.out.println(v.toString());
		}
		

	}

}
