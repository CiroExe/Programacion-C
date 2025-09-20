package ej2;

public class Libro implements I_Prestable{
	private int codigo;
	private String titulo;
	private String anio_publicacion;
	private boolean prestado;
	
	public Libro(int codigo, String titulo, String anio_publicacion)
	{
		this.codigo = codigo;
		this.titulo = titulo;
		this.anio_publicacion = anio_publicacion;
		this.prestado = false;
	}

	public int getCodigo()
	{
		return codigo;
	}
	
	public String getTitulo()
	{
		return titulo;
	}
	
	public String getAnio()
	{
		return anio_publicacion;
	}
	@Override
	public void prestar() {
		System.out.println("Se presto un libro");
		prestado = true;
	}

	@Override
	public void devolver() {
		System.out.println("Se esta devolviendo un libro");
		prestado = false;
	}

	@Override
	public boolean isPrestado() {
		return this.prestado;
	}
	
	@Override
	public String toString() {
		return "Codigo libro: "+this.codigo+
				"\nTitulo libro: "+this.titulo+
				"\nAño publicacion: "+ this.anio_publicacion+
				"\nPrestado: "+this.prestado;
	}

}
