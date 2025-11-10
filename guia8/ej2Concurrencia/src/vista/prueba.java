package vista;

import modelo.Biblioteca;
import modelo.Donador;
import modelo.Libro;
import modelo.Socio;

public class prueba {

	public static void main(String[] args) {
	    Biblioteca b = new Biblioteca();

        // Agregar libros
        b.agregarLibro(1, "El Principito");
        b.agregarLibro(2, "1984");
        b.agregarLibro(3, "Fahrenheit 451");
        b.agregarLibro(4, "Cien años de soledad");
        b.agregarLibro(5, "Rayuela");
        
        
        
        Socio s1 = new Socio("Socio1 ", b);
        s1.start();
        
        Socio s2 = new Socio("Socio2 ", b);
        s2.start();
        
        Socio s3 = new Socio("Socio3 ", b);
        s3.start();
        
        Socio s4 = new Socio("Socio4 ", b);
        s4.start();
        
        Socio s5 = new Socio("Socio5 ", b);
        s5.start();
        
        Socio s6 = new Socio("Socio6 ", b);
        s6.start();
        
        Thread d1 = new Donador("Donador1", b, new Libro(6, "Harry potter y la piedra filosofal"));
        d1.start();
        
        Thread d2 = new Donador("Donador2", b, new Libro(7, "Harry potter y la camara secreta"));
        d2.start();
        
        Thread d3 = new Donador("Donador3", b, new Libro(8, "Harry potter y el prisionero de azkaban"));
        d3.start();
        
        Thread d4 = new Donador("Donador4", b, new Libro(9, "Harry potter y el caliz de fuego"));
        d4.start();
        
        Thread d5 = new Donador("Donador5", b, new Libro(10, "Harry potter y la orden del fenix"));
        d5.start();
        
        
        Socio s7 = new Socio("Socio7 ", b);
        s7.start();
        
        Socio s8 = new Socio("Socio8 ", b);
        s8.start();
        
        Socio s9 = new Socio("Socio9 ", b);
        s9.start();
        
        Socio s10 = new Socio("Socio10 ", b);
        s10.start();
 
       
	}

}
