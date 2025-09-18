package ej1;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<>();
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		animales.add(new Perro("Bleff", 10));
		animales.add(new Gato("Lia", 15));
		animales.add(new Vaca("La vaca saturno saturnita", 10));
		animales.add(new Pollito("Pollito pio", 2));
		
		for(Animal a : animales)
		{
			a.emiteSonido();
		}
		
		vehiculos.add(new Ambulancia("ABC100", "2010"));
		for(Vehiculo v : vehiculos)
		{
			v.emiteSonido();
		}
	}

}
