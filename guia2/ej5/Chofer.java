package ej5g2;

public class Chofer {
	Categoria categoria;
	Domicilio domicilio;
	String nombre;
	double sueldo;
	Colectivo colectivoasignado;
	
	public Chofer(String nombre, Domicilio domicilio, Categoria categoria)
	{
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.categoria = categoria;
	}
	
	public void setCategoria(Categoria categoria)
	{
		this.categoria = categoria;
	}
	public void setSueldo()
	{
		this.sueldo = this.categoria.getSueldo();
	}
	
	public void asignaColectivo(Colectivo colectivoasignado)
	{
		this.colectivoasignado = colectivoasignado;
	}
	
	public Colectivo getColectivo()
	{
		return colectivoasignado;
	}
	
	public Categoria getCategoria()
	{
		return categoria;
	}
	
	
	public String getCalle()
	{
		return domicilio.getCalle();
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public double getSueldo()
	{
		return sueldo;
	}
	
	 @Override
	 public String toString() {
	        if (this.colectivoasignado == null) {
	            return "Nombre: " + this.nombre + "\n" +
	                    "Domicilio: " + this.domicilio.getCalle() + " "+ this.domicilio.getNumero() + "\n" +
	                    "Categoria: " + this.categoria.getNombre() + " " + this.domicilio.getNumero() + "\n" +
	                    "Ningun colectivo asignado\n";
	        } else
	            return "Nombre: " + this.nombre + "\n" +
	                    "Domicilio: " + this.domicilio.getCalle() + "\n" +
	                    "Categoria: " + this.categoria.getNombre() + "\n" +
	                    "Colectivo asignado numero " + this.colectivoasignado.getNumeroInterno() + "\n";
	    }
	
}
