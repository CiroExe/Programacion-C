package modelo;
import java.util.Observable;
import java.util.Random;

public class Mascota extends Observable implements Runnable{
	protected String nombre;
	public Mascota(String nombre)
	{
		this.nombre = nombre;
	}
	@Override
	public void run() {
		int tiempo = (int)(Math.random() * 7000) + 3000;
		try {
			Thread.sleep(tiempo);
			String []estados = {"tiene sed", "tiene hambre", "esta aburrido"};
			String randomState = estados[(int)(Math.random()*estados.length)];
			setChanged();
			notifyObservers(nombre + " " + randomState);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
