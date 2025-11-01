package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Buscaminas;
import modelo.FueraTableroException;
import modelo.ParametrosInvalidosException;
import vista.IVista;


public class Controlador implements ActionListener{
	private IVista vista;
	private Buscaminas buscaminas;
	
	public Controlador(IVista vista) {
		this.vista = vista;
		this.vista.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    String comando = e.getActionCommand();

	    // Caso 1: botón "Aceptar"
	    if (comando.equals("Aceptar")) {
	        int ancho = vista.getAncho();
	        int alto = vista.getAlto();
	        int minas = vista.getCantidadMinas(); // o leído desde otro campo
	        System.out.println("Ancho, Alto, Minas"+ ancho + " " + alto + " "+ minas);
	        try {
				buscaminas = new Buscaminas(ancho, alto, minas);
			} catch (ParametrosInvalidosException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        vista.generarTablero(alto, ancho);
	        vista.addBotonListener(this); // conectar botones del tablero
	    }

	    // Caso 2: botón del tablero
	    else if (comando.contains(",")) {
	        String[] partes = comando.split(",");
	        int i = Integer.parseInt(partes[0]);
	        int j = Integer.parseInt(partes[1]);
	        System.out.println(partes);
	        System.out.println(partes[0]);
	        System.out.println(partes[1]);
	        // Consultar al modelo
	        try {
				if (buscaminas.isMina(i, j)) {
				    vista.mostrarCelda(i, j, "M");
				    vista.Perdiste();
				}
				else
				    vista.mostrarCelda(i, j, String.valueOf(buscaminas.getMinasCercanas(i, j)));
			} catch (FueraTableroException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	

	}

}
