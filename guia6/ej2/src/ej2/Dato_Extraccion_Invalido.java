package ej2;

public class Dato_Extraccion_Invalido {
	private double extraccion_solicitada;
	private double saldo;
	
	public Dato_Extraccion_Invalido(double saldo, double extracion_solicitada) {
		this.saldo = saldo;
		this.extraccion_solicitada = extraccion_solicitada;
	}

	public double getExtraccion_solicitada() {
		System.out.println(extraccion_solicitada);
		return extraccion_solicitada;
	}

	public double getSaldo() {
		return saldo;
	}
	
	

}
