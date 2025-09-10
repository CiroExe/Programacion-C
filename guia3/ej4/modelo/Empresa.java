package modelo;
import java.util.ArrayList;

public class Empresa {
	private String nombre;
	ArrayList<Departamento> departamentos = new ArrayList<>();
	
	public Empresa(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
	public void addDepartamento(Departamento depto)
	{
		departamentos.add(depto);
	}
	
	public void deleteDepartamento(Departamento depto)
	{
		departamentos.remove(departamentos.indexOf(depto));
	}

}
