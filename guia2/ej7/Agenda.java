package ej7g2;
import java.util.ArrayList;
import java.util.HashMap;


public class Agenda {
	private String nombre;
	private HashMap<String, Contacto> contactos = new HashMap<String, Contacto>();
	
	public Agenda(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void addContacto(Contacto contacto)
	{
		if(!contactos.containsKey(contacto))
		{
			contactos.put(contacto.getNombre(), contacto);
		}else {
			System.out.println("Contacto ya existente.");
		}
	}
	
	public void deleteContacto(Contacto contacto)
	{
		if(contactos.containsKey(contacto))
		{
			contactos.remove(contacto.getNombre());
		}else {
			System.out.println("El contacto no existe.");
		}
	}
	
	public void cambiaNombre(String nombre, String nuevo_nombre)
	{
		if(contactos.get(nombre) != null)
		{
			contactos.get(nombre).setNombre(nuevo_nombre);
			contactos.remove(nombre);
			addContacto(contactos.get(nombre));
		}else {
			System.out.println("No existe el contacto");
		}
	}
	
	public Contacto buscaContacto(String clave) {
	    return contactos.get(clave); // Devuelve el objeto o null si no existe
	}
	
	@Override
	public String toString()
	{
		return "Agenda: "+ contactos;
	}
}
