package ej4g2;
import java.util.ArrayList;
public class Empleado {
	private String nombre;
	private String telefono;
	private String email;
	
	public Empleado(String nombre, String telefono, String email)
	{
		this.nombre = nombre;
		this.telefono = telefono ;
		this.email = email;
	}
	
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getTel()
	{
		return telefono;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	
}
