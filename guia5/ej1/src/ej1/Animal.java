package ej1;

public abstract class  Animal implements I_Emisor_de_Sonido{

	private String nombre;
	private int esperanzaDeVida;
	
	public Animal(String nombre)
	{
		super();
		this.nombre = nombre;
	}
	
	public Animal(String nombre, int esperanza)
	{
		this(nombre);
		this.esperanzaDeVida = esperanza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEsperanzaDeVida() {
		return esperanzaDeVida;
	}

	public void setEsperanzaDeVida(int esperanzaDeVida) {
		this.esperanzaDeVida = esperanzaDeVida;
	}
}
