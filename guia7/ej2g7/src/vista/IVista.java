package vista;

import java.awt.event.ActionListener;

import controlador.Controlador;

public interface IVista {

	public int getAncho();
	public int getAlto();
	public boolean isPisado();
	public void iniciar();
	void addActionListener(ActionListener actionListener);
	void generarTablero(int filas, int columnas);
	void mostrarCelda(int fila, int columna, String valor);
	public void addBotonListener(ActionListener l);
	public int getCantidadMinas();
	public void Perdiste();
}
