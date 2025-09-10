package modelo;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nombre;
	ArrayList<Empleado> empleados = new ArrayList<>();
	ArrayList<Planilla> planilla = new ArrayList<>();
	
	public Departamento(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void addEmpleado(Empleado emp)
	{
		empleados.add(emp);
	}
	
	public void deleteEmpleado(Empleado emp)
	{
		empleados.remove(empleados.indexOf(emp));
	}
	
	public List<Planilla> generaPlanilla()
	{
		
		List<Planilla> planilla = new ArrayList<>();
		for(Empleado e : empleados)
		{
			planilla.add(new Planilla(e.getNombre(), e.getSueldoNeto()));
		}
		
		return planilla;
	}
	
	
	
	
}
