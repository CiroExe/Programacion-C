package ej7g3;

public abstract class Jugador {
	private String nombre;
	private double velocidad;
	private double potencia;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Jugador(String nombre, double velocidad, double potencia)
	{
		this(nombre);
		this.velocidad = velocidad; //Debera verificarse en la clase prueba que es un valor entre 0 y 1
		this.potencia = potencia;
	}
	
	public void setVelocidad(double velocidad)
	{
		if(velocidad >= 0 && velocidad <=1)
		{
			this.velocidad = velocidad;
		}else {
			System.out.println("La velocidad no es valida");
		}
	}
	
	public void setPotencia(double potencia)
	{
		if( potencia>= 0 && potencia <=1)
		{
			this.potencia = potencia;
		}else {
			System.out.println("La potencia no es valida");
		}
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public double getPotencia() {
		return potencia;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	abstract double indiceAtaque();	
	abstract double indiceDefensa();	
	public abstract String toString();
}
