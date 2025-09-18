package ej1;

public class Pollito extends Animal{

	public Pollito(String nombre, int esperanza) {
		super(nombre,esperanza);
	}

	@Override
	public void emiteSonido() {
		System.out.println("Pio");
	}

}
