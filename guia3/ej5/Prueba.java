package ej5g3;

public class Prueba {

	public static void main(String[] args) {
		Automovil AutomovilManual = new Manual("ABC123");
		Automovil AutomovilAutomatico = new Automatico("DEF456");
		
		AutomovilManual.acelerar(40);
		AutomovilManual.acelerar(40);
		System.out.println(AutomovilManual.getVelocidad());
		AutomovilManual.frenar(20);
		System.out.println(AutomovilManual.getVelocidad());
		
		AutomovilAutomatico.acelerar(60);
		AutomovilAutomatico.acelerar(20);
		System.out.println(AutomovilAutomatico.getVelocidad());
		AutomovilAutomatico.frenar(10);
		System.out.println(AutomovilAutomatico.getVelocidad());
		
		
		System.out.println(AutomovilManual);
		System.out.println(AutomovilAutomatico);
	}

}
