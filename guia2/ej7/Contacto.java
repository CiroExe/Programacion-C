package ej7g2;
import java.util.ArrayList;

public class Contacto {
	private String nombre;
	private String telFijo;
	private ArrayList<String> celulares = new ArrayList<>();
	
	public Contacto(String nombre)
	{
		this.nombre = nombre;
	}
	
	public Contacto(String nombre, String telFijo)
	{
		this(nombre);
		this.telFijo = telFijo;
	}
	
	public void setTelFijo(String telFijo)
	{
		this.telFijo = telFijo;
	}
	
	public void addCelular(String cel)
	{
		if(celulares.contains(cel))
		{
			System.out.println("El numero de celular ya existe.");
		}else {
			celulares.add(cel);
		}
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void eliminarCelular(String cel)
	{
		if(!celulares.contains(cel))
		{
			System.out.println("El numero de celular no existe.");
		}else {
			celulares.remove(cel);
		}
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getTelFijo()
	{
		return telFijo;
	}
	
	public ArrayList<String> getCelulares()
	{
		return celulares;
	}
	
	@Override
	public String toString() {
		return "nombre=" + nombre + ", telFijo=" + telFijo + ", celulares=" + celulares  ;
	}
	

}
