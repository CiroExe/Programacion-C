package ej6;

public class Prueba {

	public static void main(String[] args) {
		    CuentaBancaria cc = new CuentaCorriente("Ana", 500);
	        CuentaBancaria ca = new CajaAhorro("Luis");
	        CuentaBancaria cu = new CuentaUniversitaria("Maria");

	        cc.depositar(100);
	        cc.extraer(550); // permitido por descubierto
	        cc.extraer(100); // puede superar tope → denegado

	        ca.depositar(300);
	        ca.extraer(100); // ok
	        ca.extraer(100); // ok
	        ca.extraer(100); // límite de extracciones alcanzado → denegado

	        cu.depositar(1500);
	        cu.extraer(1200); // supera límite diario → denegado
	        cu.extraer(800);  // permitido
	}

}
