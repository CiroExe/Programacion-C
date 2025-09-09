package ej6g3;

public class Link extends Archivo {
	private final int tamano = 1;
	private Archivo enlace;
	
	public Link(String nombre, Archivo enlace) {
		super(nombre, 1);
		this.enlace = enlace;
	}
	
	public Archivo getEnlace()
	{
		return enlace; 
	}
	
	public void setEnlace(Archivo archivo)
	{
		this.enlace = archivo;
	}

}
