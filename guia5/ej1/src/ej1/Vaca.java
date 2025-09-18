package ej1;

public class Vaca extends Animal{

	public Vaca(String nombre, int esperanza) {
		super(nombre, esperanza);
	}

	@Override
	public void emiteSonido() {
		System.out.println("Muu");
	}

}
