package ej2;

public class Prueba {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria("Ciro Ganduglia");
		
		try {
			cuenta.depositar(2000);
			System.out.println("Saldo actual: $"+ cuenta.getSaldo());
		} catch (DepositoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cuenta.extraer(325);
			System.out.println("Saldo actual: $"+ cuenta.getSaldo());
		} catch (ExtraccionInvalidaException e) {
			System.out.println("Extraccion invalida de $" + e.getDatoInvalido().getExtraccion_solicitada());
		}
		
		try {
			cuenta.depositar(-3000);
		} catch (DepositoInvalidoException e) {
			System.out.println("Deposito invalido de $"+ e.getCantidadInvalida());
		}
		try {
			cuenta.extraer(3000);
		} catch (ExtraccionInvalidaException e) {
			System.out.println("Extraccion invalida de $" + e.getDatoInvalido().getExtraccion_solicitada());
		}
	}

}
