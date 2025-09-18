package ej1;

public class Gato extends Animal{

	public Gato(String nombre, int esperanza) {
		super(nombre, esperanza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emiteSonido() {
		System.out.println("Miau");
	}

}
