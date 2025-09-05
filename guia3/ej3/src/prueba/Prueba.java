package prueba;


import ej3g3.CuentaBancaria;
import ej3g3.CuentaCorriente;
import ej3g3.CuentaUniversitaria;
import ej3g3.CajaAhorro;

public class Prueba {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaCorriente("Ciro Ganduglia", 2500);
		CuentaBancaria cuenta2 = new CuentaUniversitaria("Jeremias Ledesma");
		CuentaBancaria cuenta3 = new CajaAhorro("Lautaro Diaz");
		
		cuenta1.depositarDinero(2750);
		cuenta2.depositarDinero(5000);
		cuenta3.depositarDinero(7000);
		
		
		
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta2.getSaldo());
		System.out.println(cuenta3.getSaldo());

		
		System.out.println(cuenta1.extraerDinero(2600));
		System.out.println(cuenta2.extraerDinero(1200));
		System.out.println(cuenta3.extraerDinero(3200));
	}
}
