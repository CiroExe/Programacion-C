package modelo;

public class Principiante extends Permanente{
	public Principiante(String nombre, String domicilio, int legajo, int antiguedad, double sueldoBase) {
		super(nombre, domicilio, legajo, antiguedad, sueldoBase);
		
	}
	
	public void setSueldoBruto()
	{
		int antiguedad = getAntiguedad();
		
		if(antiguedad >= 2 && antiguedad <5)
		{
			sueldoBruto += sueldoBruto*(1+0.05);
		}else if(antiguedad >= 5 && antiguedad < 10) {
			sueldoBruto += sueldoBruto*(1+0.07);
		}else if(antiguedad >= 10 && antiguedad < 15) {
			sueldoBruto += sueldoBruto*(1+0.1);
		}else if(antiguedad >= 15 && antiguedad < 20) {
			sueldoBruto += sueldoBruto*(1+0.15);
		}else if(antiguedad >= 20) {
			sueldoBruto += sueldoBruto*(1+0.2);
		}
	}
	
	public void setSueldoNeto()
	{
		this.sueldoNeto = this.sueldoBruto - (this.sueldoBruto*AportesJubilatorios) - (this.sueldoBruto*ObraSocial);
	}
	
	

}
