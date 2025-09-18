package ej1;

public class Perro extends Animal{

	public Perro(String nombre, int esperanza) {
		super(nombre, esperanza);
	}

	@Override
	public void emiteSonido() {
		System.out.println("Guau");
	}

}
