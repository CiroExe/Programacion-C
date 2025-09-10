package modelo;

public abstract class Permanente extends Empleado{
	private int antiguedad;
	protected double sueldoBase;
	protected double sueldoBruto;
    static final double AportesJubilatorios = 0.11;
    static final double ObraSocial = 0.06;
	
	public Permanente(String nombre, String domicilio, int legajo, int antiguedad, double sueldoBase)
	{
		super(nombre, domicilio, legajo);
		this.antiguedad = antiguedad;
		this.sueldoBase = sueldoBase;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
}
