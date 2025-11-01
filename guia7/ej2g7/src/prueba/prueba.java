package prueba;

import vista.VistaBuscaminas;
import controlador.Controlador;

public class prueba {
    public static void main(String[] args) {
        VistaBuscaminas v = new VistaBuscaminas();   // crea la vista
        Controlador controlador = new Controlador(v); // la conecta al controlador
        v.setVisible(true);                           // muestra la ventana
    }
}
