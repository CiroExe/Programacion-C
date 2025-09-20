package ej2;
import java.util.ArrayList;
public class Cd implements I_Prestable, Comparable{
	private ArrayList<Cancion> ListaCanciones = new ArrayList<Cancion>();
	private int codigo;
	private String titulo;
	private String interprete;
	private boolean prestado;
	
	public ArrayList<Cancion> getListaCanciones() {
		return ListaCanciones;
	}

	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		ListaCanciones = listaCanciones;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public Cd(int codigo, String titulo, String interprete)
	{
		this.codigo = codigo;
		this.titulo = titulo;
		this.interprete = interprete;
		this.prestado = false;
	}
	
	public void addCancion(Cancion c)
	{
		ListaCanciones.add(c);
	}
	
	public void removeCancion(Cancion c)
	{
		ListaCanciones.remove(c);
	}
	
	@Override
	public String toString()
	{
		return "Codigo CD: "+codigo+
				"\nInterprete: "+interprete+
				"\nTitulo CD: "+titulo+
				"\nCanciones: "+ ListaCanciones;
	}

	@Override
	public void prestar() {
		System.out.println("Se presto un CD");
		prestado = true;
	}

	@Override
	public void devolver() {
		System.out.println("Se esta devolviendo un CD");
		prestado = false;
	}

	@Override
	public boolean isPrestado() {
		return this.prestado;
	}

	@Override
	public int compareTo(Object obj_cd) {
		int rta=0;
		Cd cd2 = (Cd)obj_cd;
		if(getTitulo().compareTo(cd2.getTitulo()) > 0)
		{
			rta = 1;
		}else if(getTitulo().compareTo(cd2.getTitulo()) < 0){
			rta = -1;
		}
		return rta;
	}

}
