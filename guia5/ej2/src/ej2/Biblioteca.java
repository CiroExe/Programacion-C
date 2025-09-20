package ej2;
import java.util.ArrayList;
public class Biblioteca {
	private ArrayList<Libro> librosPrestados = new ArrayList<Libro>();
	private ArrayList<Revista> revistas = new ArrayList<Revista>();
	private String nombre;
	
	public Biblioteca(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void devolverLibro(Libro l)
	{
		librosPrestados.add(l);
		l.devolver();
	}
	
	public void prestarLibro(Libro l)
	{
		librosPrestados.remove(l);
		l.prestar();
	}
	
	public void addRevista(Revista r)
	{
		revistas.add(r);
	}
	
	public void removeRevista(Revista r)
	{
		revistas.remove(r);
	}
	
	

}
