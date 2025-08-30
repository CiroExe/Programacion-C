package ej5g2;
import java.util.ArrayList;

public class Empresa {
	private String nombreEmpresa;
	private ArrayList<Chofer> choferes = new ArrayList<Chofer>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private ArrayList<Colectivo> colectivos = new ArrayList<Colectivo>();
	
	public void setNombre(String nombreEmpresa)
	{
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public ArrayList<Chofer> getChoferes()
	{
		return choferes;
	}
	
	public ArrayList<Categoria> getCategorias(){
		return categorias;
	}
	

	public ArrayList<Colectivo> getColectivos(){
		return colectivos;
	}
	
	public void agregarChofer(Chofer chofer)
	{
		this.choferes.add(chofer);
	}
	
	public void agregarCategoria(Categoria categoria)
	{
		this.categorias.add(categoria);
	}
	
	public void eliminarChofer(Chofer chofer)
	{
		this.choferes.remove(chofer);
	}
	
	public void eliminarCategoria(Categoria categoria)
	{
		this.categorias.remove(categoria);
	}
	
	public void agregarColectivo(Colectivo colectivo)
	{
		this.colectivos.add(colectivo);
	}
	
	public void eliminarColectivo(Colectivo colectivo)
	{
		this.colectivos.remove(colectivo);
	}
	
	
	
	public int sinAsignar()
	{
		int cont = 0;
		
		for(int i=0; i<choferes.size(); i++)
		{
			if(choferes.get(i).getColectivo() == null)
				cont += 1;
		}
		return cont;
	}
	
	public int cantColectivos()
	{
		return colectivos.size();
	}
	
	/*public void pertenecenCategoria(Categoria categoria)
	{
		for(int i=0 ;i<choferes.size(); i++)
		{
			if(choferes.get(i).getCategoria() == categoria.getNombre())
			{
				System.out.println(choferes.get(i).getNombre());
			}
		}
	}*/
	
	public ArrayList<Chofer> pertenecenCategoria(Categoria categoria)
	{
		ArrayList<Chofer> aux = new ArrayList<>();
		
		for(int i=0; i < choferes.size(); i++) 
		{
			if(choferes.get(i).getCategoria() == categoria)
			{
				aux.add(choferes.get(i));
			}
		}
		
		return aux;
	}
	
	/*public void superanMontoCat(double monto)
	{
		for(int i=0 ;i<categorias.size();i++)
		{
			if(categorias.get(i).getSueldo() > monto)
			{
				System.out.println(categorias.get(i).getNombre());
			}
		}
		
	}*/
	
	public ArrayList<Categoria> superanMontoCat(double monto)
	{
		ArrayList<Categoria> aux = new ArrayList<>();
		
		for(int i=0 ; i<categorias.size(); i++)
		{
			if(categorias.get(i).getSueldo() > monto)
			{
				aux.add(categorias.get(i));
			}
		}
		
		return aux;
		
	}
	
	/*public void superanMontoChofer(double monto)
	{
		for(int i=0; i<choferes.size(); i++)
		{
			if(choferes.get(i).getSueldo() > monto)
				System.out.println(choferes.get(i).getNombre());
		}
	}*/
	
	public ArrayList<Chofer> superanMontoChofer(double monto)
	{
		ArrayList<Chofer> aux = new ArrayList<>();
		
		for(int i=0 ; i<categorias.size(); i++)
		{
			if(choferes.get(i).getSueldo() > monto)
			{
				aux.add(choferes.get(i));
			}
		}
		
		return aux;
		
	}
	
	
}
