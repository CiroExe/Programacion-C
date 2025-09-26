package ej7;
import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	private static Mazo instancia;
	private ArrayList<IPersonaje> mazoPersonajes = new ArrayList<>();
	
	public Mazo() {
	
	}
	
	//Patron Singleton
	public static Mazo getInstancia()
	{
		if(instancia == null)
			instancia = new Mazo();
		return instancia;
	}

	public void addPersonaje(IPersonaje p)
	{
		mazoPersonajes.add(p);
	}
	
	public void deletePersonaje(IPersonaje p)
	{
		mazoPersonajes.remove(p);
	}
	
	public IPersonaje eligeAdversario()
	{
		Random r = new Random();
		int index = r.nextInt(mazoPersonajes.size());
		return mazoPersonajes.get(index);
	}
}
