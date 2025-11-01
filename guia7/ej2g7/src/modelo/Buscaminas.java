package modelo;

import java.util.Random;

public class Buscaminas {
	private int ancho;
	private int alto;
	private int cantMinas;
	private boolean[][]tablero;
	
	public Buscaminas(int alto, int ancho, int cantMinas) throws ParametrosInvalidosException 
	{
		 if (ancho <= 0 || alto <= 0)
	            throw new ParametrosInvalidosException("El ancho y alto deben ser mayores a 0");
	        if (cantMinas < 0)
	            throw new ParametrosInvalidosException("La cantidad de minas no puede ser negativa");
	        if (cantMinas > ancho * alto)
	            throw new ParametrosInvalidosException("Demasiadas minas para el tamaño del tablero");

	        this.ancho = ancho;
	        this.alto = alto;
	        this.cantMinas = cantMinas;
	        this.tablero= new boolean[alto][ancho];
	        this.inicializarMinas();
	}
	
	/*
	 * getMinasCercanas retornará la cantidad de minas que rodean la casilla ubicada en la posición [i,j]
	 */
	public int getMinasCercanas(int i, int j) throws FueraTableroException {
	    if (i < 0 || i >= alto || j < 0 || j >= ancho)
	        throw new FueraTableroException("ERROR: Fuera del tablero (" + i + "," + j + ")");

	    int minasCercanas = 0;

	    for (int x = i - 1; x <= i + 1; x++) {
	        for (int y = j - 1; y <= j + 1; y++) {
	            if (x == i && y == j)
	                continue; // no contar la celda actual

	            if (x >= 0 && x < alto && y >= 0 && y < ancho) { // dentro del tablero
	                if (isMina(x, y))
	                    minasCercanas++;
	            }
	        }
	    }
	    return minasCercanas;
	}

	/*
	 * isMina retornara true o false en caso de que haya o no una mina en la casilla ubicada en la
	   posición [i,j]
	 */

	public boolean isMina(int i, int j) throws FueraTableroException {
	    if (i < 0 || i >= alto || j < 0 || j >= ancho)
	        throw new FueraTableroException("Posición fuera del tablero (" + i + "," + j + ")");
	    return tablero[i][j];
	}

	public void inicializarMinas() {
	    int minasColocadas = 0;
	    Random r = new Random();
	    while (minasColocadas < cantMinas) {
	        int i = r.nextInt(alto);
	        int j = r.nextInt(ancho);
	        if (!tablero[i][j]) {
	            tablero[i][j] = true;
	            minasColocadas++;
	        }
	    }
	}
}
