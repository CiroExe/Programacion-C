package ej5;

public abstract class Animal implements Cloneable{
	private int esparanzadevida;
	private String nombre;
	
	public Animal(int esperanza, String nombre)
	{
		this.esparanzadevida = esperanza;
		this.nombre = nombre;
	}

	public int getEsparanzadevida() {
		return esparanzadevida;
	}

	public void setEsparanzadevida(int esparanzadevida) {
		this.esparanzadevida = esparanzadevida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	@Override
	public String toString() {
		return "Animal [esparanzadevida=" + esparanzadevida + ", nombre=" + nombre + "]";
	}
	
	

}
