package modelo;

public class Experto extends Permanente{

	public Experto(String nombre, String domicilio, int legajo, int antiguedad, double sueldoBase) {
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

