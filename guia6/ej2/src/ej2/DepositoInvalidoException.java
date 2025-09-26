package ej2;

public class DepositoInvalidoException extends Exception{
	
	private double cantidadInvalida;
	
	public DepositoInvalidoException(double cantidadInvalida) {
		this.cantidadInvalida = cantidadInvalida;
	}

	public double getCantidadInvalida() {
		return cantidadInvalida;
	}
	
	

}
