package ej6g3;
import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Directorio {
	private String nombre;
	private GregorianCalendar fecha_creacion;
	private double tamano;
	private ArrayList<Directorio>subdirectorios = new ArrayList<>();
	private ArrayList<Archivo>archivos = new ArrayList<>();
	
	
	public Directorio(String nombre, GregorianCalendar fecha_creacion) {
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
		this.tamano = 0;
	}
	public Directorio(String string) {
		this.nombre = string;
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
	public double getTamano() {
		return tamano;
	}
	public void addTamano(double tamano) {
		this.tamano += tamano;
	}
	
	public void subTamano(double tamano)
	{
		this.tamano -= tamano;
	}
	public ArrayList<Directorio> getSubdirectorios() {
		return subdirectorios;
	}
	public void setSubdirectorios(ArrayList<Directorio> subdirectorios) {
		this.subdirectorios = subdirectorios;
	}
	
	public void addSubdirectorio(Directorio sub)
	{
		subdirectorios.add(sub);
		double tamano = 0;
		for(Archivo arch : sub.getArchivos())
		{
			tamano += arch.getTamano();
		}
		addTamano(tamano);
		
	}
	
	public void deleteSubdirectorio(Directorio sub)
	{
		subdirectorios.remove(sub);
		subTamano(sub.getTamano());
	}
	
	public void addArchivo(Archivo arch)
	{
		archivos.add(arch);
		addTamano(arch.getTamano());
	}
	
	public void deleteArchivo(Archivo arch)
	{
		archivos.remove(arch);
		subTamano(arch.getTamano());
	}
	
	public ArrayList<Archivo> getArchivos()
	{
		return archivos;
	}
	
	@Override
	public String toString() {
		return this.nombre +"  "+ this.tamano;
	}
}
