package ej6;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Club club = new Club();
		Socio socio = new Socio();
		
		club.setNombre("River Plate");
		socio.setNombre("Ciro Ganduglia");
		socio.setEdad(17);
		System.out.println("El socio representa al club?");
		Scanner sc = new Scanner(System.in);
		socio.setRepresenta(sc.nextBoolean());
		System.out.println(club.calcularCuota(socio));
	}

}
