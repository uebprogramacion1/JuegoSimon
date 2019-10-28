package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.Controlador;

public class InterfazGUI extends JFrame  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelBotones panelBotones;
	private PanelNumero panelNumero;
	private PanelResultado panelResultado;
	private PanelPuntuacion panelPuntuacion;
	
	public InterfazGUI(Controlador c) {
		setSize(500,400); 
		setResizable(true); 
		setTitle("SIMON");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout( new BorderLayout() );
		panelBotones = new PanelBotones();
		panelNumero = new PanelNumero();
		panelResultado = new PanelResultado();
		panelPuntuacion = new PanelPuntuacion();
		add(panelBotones,BorderLayout.CENTER);
		add(panelNumero,BorderLayout.NORTH);
		add(panelResultado,BorderLayout.SOUTH);
		add(panelPuntuacion,BorderLayout.EAST);
		panelBotones.getUno().addActionListener(c);
		panelBotones.getDos().addActionListener(c);
		panelBotones.getTres().addActionListener(c);
		panelBotones.getCuatro().addActionListener(c);
		panelResultado.getTerminar().addActionListener(c);
		}
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	public String pedirDato(String mensaje) {
		String aux =JOptionPane.showInputDialog(mensaje);
		return aux;
	}
	public int mensajeConfirmacion() {
		int resp = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Mensaje Confirmacion", JOptionPane.YES_NO_OPTION);
		return resp;
	}
	public PanelBotones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotones panelBotones) {
		this.panelBotones = panelBotones;
	}

	public PanelNumero getPanelNumero() {
		return panelNumero;
	}

	public void setPanelNumero(PanelNumero panelNumero) {
		this.panelNumero = panelNumero;
	}

	public PanelResultado getPanelResultado() {
		return panelResultado;
	}

	public void setPanelResultado(PanelResultado panelResultado) {
		this.panelResultado = panelResultado;
	}
	public PanelPuntuacion getPanelPuntuacion() {
		return panelPuntuacion;
	}
	public void setPanelPuntuacion(PanelPuntuacion panelPuntuacion) {
		this.panelPuntuacion = panelPuntuacion;
	}
	

}
