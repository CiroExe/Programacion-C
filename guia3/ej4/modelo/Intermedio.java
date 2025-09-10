package modelo;

public class Intermedio extends Permanente {
	
	
	public Intermedio(String nombre, String domicilio, int legajo, int antiguedad, double sueldoBase) {
		super(nombre, domicilio, legajo, antiguedad, sueldoBase);
		// TODO Auto-generated constructor stub
	
	}
	
	@Override 
	public void setSueldoBase(double sueldoBase)
	{
		double auxAntiguedad = getAntiguedad() / 100;
		sueldoBase += (sueldoBase * 0.25) + (sueldoBase*auxAntiguedad); 
	}
}
