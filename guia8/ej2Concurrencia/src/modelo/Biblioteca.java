package modelo;
import java.util.Hashtable;
import modelo.Libro;

import excepciones.DatoInvalidoException;

public class Biblioteca {
	protected Hashtable<Integer, String> libros;

	public Biblioteca() {
		this.libros = new Hashtable<>();
	}
	
	public synchronized String sacaLibro(int idLibro, Socio s)
	{
		//Si el libro ya fue prestado entonces pongo a dormir al hilo 
		while(!libros.containsKey(idLibro)) {
			try {
				System.out.println(s.getNombre() + " espera el libro " + idLibro);
				wait();
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		String titulo = libros.remove(idLibro);
		System.out.println("Libro retirado: [" + idLibro + "] " + titulo + " por: "+ s.getNombre());
		return titulo;
	}
	
	public synchronized void poneLibro(int idLibro, String titulo)
	{
		if (titulo == null) {
		        System.out.println("Error: intento de devolver libro " + idLibro + " con título null");
		        return;
		}
		libros.put(idLibro, titulo);
		System.out.println("Fue devuelto el libro "+titulo);
		notifyAll();
	}

	public Hashtable<Integer, String> getLibros() {
		return libros;
	}

	public void agregarLibro(int idLibro, String titulo) {
		libros.put(idLibro, titulo);	
	}
	
	public synchronized void donaLibro(Libro libro,  Donador d)
	{
		while(libros.size() == 10) //Espera hasta que algun socio retire un libro
		{
			try {
				
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.agregarLibro(libro.getIdLibro(), libro.getTitulo());
		System.out.println(d.nombre + " Donó el libro: "+ libro.getTitulo());
		notifyAll();
	}
	
}
