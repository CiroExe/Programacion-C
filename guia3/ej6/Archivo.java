package ej6g3;
import java.util.GregorianCalendar;

public  class Archivo {
	private String nombre;
	private GregorianCalendar fecha_creacion;
	private GregorianCalendar fecha_ultimaModificacion;
	protected double tamano;
	
	public Archivo(String nombre, GregorianCalendar fecha_creacion,GregorianCalendar fecha_ultimaModificacion,double tamano) {
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
		this.fecha_ultimaModificacion = fecha_ultimaModificacion;
		this.tamano = tamano;
	}
	
	public Archivo(String nombre, double tamano)
	{
		this(nombre);
		this.tamano = tamano;
	}

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GregorianCalendar getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(GregorianCalendar fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public GregorianCalendar getFecha_ultimaModificacion() {
		return fecha_ultimaModificacion;
	}

	public void setFecha_ultimaModificacion(GregorianCalendar fecha_ultimaModificacion) {
		this.fecha_ultimaModificacion = fecha_ultimaModificacion;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	

}
