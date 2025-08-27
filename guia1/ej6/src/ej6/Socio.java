package ej6;

public class Socio {
	private String nombre;
	private int edad;
	private boolean representa;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setRepresenta ( boolean representa)
	{
		this.representa = representa;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getSocio() {
		return nombre;
	}
	
	public boolean getRepresenta()
	{
		return representa;
	}
	
	
}
