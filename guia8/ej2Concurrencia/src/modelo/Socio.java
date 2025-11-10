package modelo;
import java.util.Random;

public class Socio extends Thread{
	private String nombre;
	private Biblioteca biblioteca;
	
	public Socio(String nombre, Biblioteca biblioteca)
	{
		this.nombre = nombre;
		this.biblioteca = biblioteca;
	}
	
	@Override
	public void run() 
	{
		try {
			for(int i = 0; i<3; i++)
			{
				int idLibroElegido = (int) ((Math.random() * 10) + 1);
				String libro = biblioteca.sacaLibro(idLibroElegido, this);
				Thread.sleep((int)(Math.random()*1000));
				biblioteca.poneLibro(idLibroElegido, libro);
				Thread.sleep((int)(Math.random()*1000));
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
}
