package ej6g3;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Comprimido extends Archivo{
	private Directorio directorio_interno;
	private double tasaCompresion;
	
	public Comprimido(String nombre, GregorianCalendar fecha_creacion,GregorianCalendar fecha_ultimaModificacion, double tamano, double tasaCompresion) {
		super(nombre, fecha_creacion,fecha_ultimaModificacion, tamano);
		this.tasaCompresion = tasaCompresion;
	}
	
	public Directorio getDirectorioInterno()
	{
		return directorio_interno;
	}
	
	public void setDirectorioInterno(Directorio directorio_interno, double tasaCompresion)
	{
		this.directorio_interno = directorio_interno;
		this.tasaCompresion = tasaCompresion;
		tamano = this.directorio_interno.getTamano() * this.tasaCompresion;
	}
	
	public double getTasaCompresion()
	{
		return tasaCompresion;
	}

}
