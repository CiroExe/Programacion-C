package ej3;

public class Prueba {

	public static void main(String[] args) {
		TorretaVigilancia torreta1 = new TorretaVigilancia("A", 500, 3000, 20, 10);
		TorretaVigilancia torreta2 = new TorretaVigilancia("B", 500, 3000, 50, 10);
		Soldado soldado = new Soldado("B", 100, 500, 30, 20);
		Soldado soldado2 = new Soldado("A", 100, 500, 80, 20);
		
		System.out.println("Vida torreta1 antes: "+ torreta1.getEnergia());
		soldado.atacar(torreta1);
		System.out.println("Vida torreta1 despues: "+ torreta1.getEnergia());

		soldado.atacar(torreta2);
		soldado2.atacar(torreta2);

	}

}
