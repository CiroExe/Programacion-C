package ej2;

public class Prueba {

	public static void main(String[] args) {
		Libro l1 = new Libro(203, "Harry Potter", "1998");
		Revista r1 = new Revista(105, 25, "X-MEN", "1980");
		Cancion c1 = new Cancion(4, "En la ciudad de la furia", "3:00");
		Cancion c2 = new Cancion(5,"Cuando pase el temblor", "2:54");
		Cancion c3 = new Cancion(1, "Muchacha ojos de papel", "3:35");
		Cancion c4 = new Cancion(2, "Ana no duerme", "2:50");
		Cd cd1 = new Cd(23, "Me veras volver", "Soda Stereo");
		Cd cd2 = new Cd(24, "Unplugged", "Luis Alberto Spinetta");
		cd1.addCancion(c1);
		cd1.addCancion(c2);
		cd2.addCancion(c3);
		cd2.addCancion(c4);
		System.out.println(cd1.compareTo(cd2));
		l1.prestar();
		System.out.println(l1.isPrestado());
		l1.devolver();
		
		
		System.out.println(l1.toString());
		
		System.out.println(r1.toString());

		cd1.prestar();
		System.out.println(cd1.isPrestado());
		System.out.println(cd1.toString());
		
	}

}
