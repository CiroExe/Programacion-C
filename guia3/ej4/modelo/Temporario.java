package modelo;

public class Temporario extends Empleado{
	private int horasTrabajadas;
	private double sueldoXhora;
	
	public Temporario(String nombre, String domicilio, int legajo,  int horasTrabajadas, double sueldoXhora)
	{
		super(nombre, domicilio, legajo);
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoXhora = sueldoXhora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoXhora() {
		return sueldoXhora;
	}

	public void setSueldoXhora(double sueldoXhora) {
		this.sueldoXhora = sueldoXhora;
	}
	
	public void setSueldoNeto()
	{
		sueldoNeto = sueldoXhora * horasTrabajadas;
	}

}
