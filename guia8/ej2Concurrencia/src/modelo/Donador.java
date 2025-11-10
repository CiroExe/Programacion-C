package modelo;

public class Donador extends Thread{
	protected String nombre;
	protected Biblioteca biblioteca;
	protected Libro libro;
	
	public Donador(String nombre, Biblioteca biblioteca, Libro libro)
	{
		this.nombre = nombre;
		this.biblioteca = biblioteca;
		this.libro = libro;
	}
	
	@Override
	public void run()
	{
		try {
			biblioteca.donaLibro(libro, this);
		}catch(Exception e) {
			
		}
	}

	public String getNombre() {
		return nombre;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public Libro getLibro() {
		return libro;
	}

}
