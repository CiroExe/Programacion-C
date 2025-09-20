package ej2;

public class Revista {
	private int codigo;
	private int numero;
	private String titulo;
	private String anio_publicacion;
	
	public Revista(int codigo, int numero, String titulo, String anio_publicacion)
	{
		this.codigo = codigo;
		this.numero = numero;
		this.titulo = titulo;
		this.anio_publicacion = anio_publicacion;
	}
	
	public int getCodigo()
	{
		return codigo;
	}
	
	public int getNumero()
	{
		return numero;
	}
	
	@Override
	public String toString()
	{
		return "Codigo revista: "+this.codigo+
				"\nNumero revista: "+this.numero+
				"\nTitulo revista: "+this.titulo+
				"\nAño publicacion: "+this.anio_publicacion;
	}

}
