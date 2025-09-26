package ej7;

public class Prueba {

	public static void main(String[] args) {
		Mazo mazo = Mazo.getInstancia();
		
		IPersonaje elfoTierra = new Tierra(new Elfo());
		IPersonaje guerreroFuego = new Fuego(new Guerrero());
		IPersonaje dragonFuego = new Fuego(new Dragon());
		IPersonaje hechiceraAire = new Aire(new Hechicera());
		
		mazo.addPersonaje(elfoTierra);
		mazo.addPersonaje(hechiceraAire);
		mazo.addPersonaje(dragonFuego);
		mazo.addPersonaje(guerreroFuego);
		
		System.out.println(elfoTierra.getArmadura());
		System.out.println(elfoTierra.getAtaqueCorto());
		System.out.println(elfoTierra.getAtaqueDistante());
		
		System.out.println(hechiceraAire.getArmadura());
		System.out.println(hechiceraAire.getAtaqueCorto());
		System.out.println(hechiceraAire.getAtaqueDistante());
		
		System.out.println(dragonFuego.getArmadura());
		System.out.println(dragonFuego.getAtaqueCorto());
		System.out.println (dragonFuego.getAtaqueDistante());
		
		System.out.println(guerreroFuego.getArmadura());
		System.out.println(guerreroFuego.getAtaqueCorto());
		System.out.println(guerreroFuego.getAtaqueDistante());
		
	}

}
