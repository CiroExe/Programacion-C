package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import modelo.Buscaminas;

public class VistaBuscaminas extends JFrame implements IVista, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel PanelTablero;
	private JPanel panel_2;
	private JPanel panel_5;
	private JPanel panel_6;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_7;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JPanel panel_8;
	private JButton btnAceptar;
	private JButton[][] botones;
	private JPanel panel_1;
	private JPanel panel_9;
	private JPanel panel_10;
	private JLabel lblCantMinas;
	private JTextField textFieldCantMinas;
	JFrame ventanaPerdiste;
	private JLabel Perdiste;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaBuscaminas frame = new VistaBuscaminas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaBuscaminas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 374);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_2 = new JPanel();
		this.panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.panel.add(this.panel_2);
		this.panel_2.setLayout(new BorderLayout(0, 0));
		
		this.panel_5 = new JPanel();
		this.panel_2.add(this.panel_5, BorderLayout.CENTER);
		
		this.lblNewLabel = new JLabel("Ancho (maximo 20)");
		this.panel_5.add(this.lblNewLabel);
		
		this.panel_6 = new JPanel();
		this.panel_2.add(this.panel_6, BorderLayout.SOUTH);
		
		this.textField = new JTextField();
		this.panel_6.add(this.textField);
		this.textField.setColumns(10);
		
		this.panel_3 = new JPanel();
		this.panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.panel.add(this.panel_3);
		this.panel_3.setLayout(new BorderLayout(0, 0));
		
		this.panel_4 = new JPanel();
		this.panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.panel_3.add(this.panel_4, BorderLayout.CENTER);
		
		this.lblNewLabel_1 = new JLabel("Alto (maximo 20)");
		this.panel_4.add(this.lblNewLabel_1);
		
		this.panel_7 = new JPanel();
		this.panel_3.add(this.panel_7, BorderLayout.SOUTH);
		
		this.textField_1 = new JTextField();
		this.panel_7.add(this.textField_1);
		this.textField_1.setColumns(10);
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_9 = new JPanel();
		panel_1.add(panel_9);
		
		lblCantMinas = new JLabel("Cantidad de minas");
		panel_9.add(lblCantMinas);
		
		panel_10 = new JPanel();
		panel_1.add(panel_10);
		
		textFieldCantMinas = new JTextField();
		panel_10.add(textFieldCantMinas);
		textFieldCantMinas.setColumns(10);
		
		this.panel_8 = new JPanel();
		this.panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.panel.add(this.panel_8);
		this.panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		//Boton aceptar
		this.btnAceptar = new JButton("Aceptar");
		this.btnAceptar.setVerticalAlignment(SwingConstants.BOTTOM);
		this.panel_8.add(this.btnAceptar);
		
		this.PanelTablero = new JPanel();
		this.contentPane.add(this.PanelTablero, BorderLayout.CENTER);
		PanelTablero.setLayout(new GridLayout(5, 5, 0, 0));
	}
	
	@Override
	public void generarTablero(int filas, int columnas) {
	    this.PanelTablero.removeAll();
	    this.PanelTablero.setLayout(new GridLayout(filas, columnas));
	    botones = new JButton[filas][columnas];

	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            botones[i][j] = new JButton("");
	            botones[i][j].setActionCommand(i + "," + j); // muy importante
	            this.PanelTablero.add(botones[i][j]);
	        }
	    }
	    this.PanelTablero.revalidate();
	    this.PanelTablero.repaint();
	}

	@Override
	public void mostrarCelda(int fila, int columna, String valor) {
	    botones[fila][columna].setText(valor);
	    botones[fila][columna].setEnabled(false); // desactiva el botón pisado
	}
	
	public int getAncho() {
		int ancho = Integer.parseInt(this.textField.getText());
		System.out.println("Ancho"+ ancho);
		return ancho;
	}
	
	public int getCantidadMinas() {
		int cant = Integer.parseInt(this.textFieldCantMinas.getText());
		return cant;
	}

	@Override
	public int getAlto() {
		int ancho = Integer.parseInt(this.textField_1.getText());
		System.out.println("Ancho"+ ancho);
		return ancho;
	}
	
	@Override
	public void Perdiste() {
	    JOptionPane.showMessageDialog(null, "💣 ¡Perdiste!", "Fin del juego", JOptionPane.ERROR_MESSAGE);
	}

	@Override
	public void iniciar() {
	}
	
	@Override
	public void addActionListener(ActionListener actionListener) {
		this.btnAceptar.addActionListener(actionListener);
	}
	
	@Override
	public void addBotonListener(ActionListener l) {
	    for (int i = 0; i < botones.length; i++) {
	        for (int j = 0; j < botones[i].length; j++) {
	            botones[i][j].addActionListener(l);
	        }
	    }
	}


	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		try {
			int textAncho = Integer.parseInt(this.textField.getText());
			int textAlto = Integer.parseInt(textField_1.getText());
			this.btnAceptar.setEnabled(true);
		}catch(NumberFormatException e){
			this.btnAceptar.setEnabled(false);
			this.textField.setEnabled(false);
			this.textField_1.setEnabled(false);
		}
		
	}

	@Override
	public boolean isPisado() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
