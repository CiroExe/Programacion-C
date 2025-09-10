package modelo;

public abstract class Empleado {
	private String nombre;
	private String domicilio;
	private int legajo;
	protected double sueldoNeto;

	
	public Empleado(String nombre)
	{
		super();
		this.nombre = nombre;
	}
	
	public Empleado(String nombre, String domicilio)
	{
		this(nombre);
		this.domicilio = domicilio;
	}
	
	public Empleado(String nombre, String domicilio, int legajo)
	{
		this(nombre,domicilio);
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public double getSueldoNeto()
	{
		return sueldoNeto;
	}
}
