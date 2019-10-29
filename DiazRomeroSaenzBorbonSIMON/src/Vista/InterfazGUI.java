package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.Controlador;

public class InterfazGUI extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelNumero panelnumero;
	private PanelBotones panelbotones;
	private PanelResultados panelresultados;
	private String mensaje;
	
	public InterfazGUI(Controlador Control) {
		
		setSize(500,400); 
		setResizable(false); 
		setTitle("SIMON"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		
		setLayout( new BorderLayout() );
		panelnumero = new PanelNumero();
		add(panelnumero,BorderLayout.NORTH);
		
		panelbotones = new PanelBotones();
		add(panelbotones,BorderLayout.CENTER);
		
		panelresultados = new PanelResultados();
		add(panelresultados, BorderLayout.SOUTH);
		
		panelbotones.getBoton1().addActionListener(Control);
		panelbotones.getBoton2().addActionListener(Control);
		panelbotones.getBoton3().addActionListener(Control);
		panelbotones.getBoton4().addActionListener(Control);
		
		panelresultados.getButComenzar().addActionListener(Control);
		panelresultados.getButTerminar().addActionListener(Control);
		
		mensaje = "";
		
	}
	public PanelNumero getPanelnumero() {
		return panelnumero;
	}
	public void setPanelnumero(PanelNumero panelnumero) {
		this.panelnumero = panelnumero;
	}
	public PanelBotones getPanelbotones() {
		return panelbotones;
	}
	public void setPanelbotones(PanelBotones panelbotones) {
		this.panelbotones = panelbotones;
	}
	public PanelResultados getPanelresultados() {
		return panelresultados;
	}
	public void setPanelresultados(PanelResultados panelresultados) {
		this.panelresultados = panelresultados;
	}
	public void escribirMensaje(boolean dato) {
		if(dato) {
			mensaje = "Secuencia Exitosa";
			JOptionPane.showMessageDialog(null, mensaje, "SIMON", JOptionPane.INFORMATION_MESSAGE);
		}else {
		mensaje = "Secuencia Fallida";
		JOptionPane.showMessageDialog(null, mensaje, "SIMON", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void Validacion(){
		JOptionPane.showMessageDialog(null, "Digite un numero de 4 digitos", "SIMON", JOptionPane.INFORMATION_MESSAGE);
	}
}