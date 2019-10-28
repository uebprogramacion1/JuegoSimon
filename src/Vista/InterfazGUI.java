package Vista;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controlador.Controlador;

public class InterfazGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private PanelEntrada PanleIngresarNumeros; 
	private PanelTerminar panelRespuesta; 
	private PanelBotones panelNumeros;
	private PanelDiseño Diseño;

	public InterfazGUI(Controlador control) {
	
		setSize(750, 500); 
		setResizable(false); 
		setTitle("Simón dice"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		
		setLayout(new BorderLayout());
		
		PanleIngresarNumeros = new PanelEntrada();
		add(PanleIngresarNumeros, BorderLayout.NORTH);
	    
		panelNumeros = new PanelBotones();
		add(panelNumeros, BorderLayout.CENTER);
		
		Diseño = new PanelDiseño();
	    add(Diseño, BorderLayout.WEST);
	    
	    Diseño = new PanelDiseño();
	    add(Diseño, BorderLayout.EAST);  
		
		panelRespuesta = new PanelTerminar();
		add(panelRespuesta, BorderLayout.SOUTH);

		panelNumeros.getButNumero1().addActionListener(control);
		panelNumeros.getButNumero2().addActionListener(control);
		panelNumeros.getButNumero3().addActionListener(control);
		panelNumeros.getButNumero4().addActionListener(control);
		panelRespuesta.getButEscribir().addActionListener(control);
		
	}

	

	public PanelEntrada getPanleIngresarNumeros() {
		return PanleIngresarNumeros;
	}

	public void setPanleIngresarNumeros(PanelEntrada panleIngresarNumeros) {
		PanleIngresarNumeros = panleIngresarNumeros;
	}

	public PanelTerminar getPanelRespuesta() {
		return panelRespuesta;
	}

	public void setPanelRespuesta(PanelTerminar panelRespuesta) {
		this.panelRespuesta = panelRespuesta;
	}

	public PanelBotones getPanelNumeros() {
		return panelNumeros;
	}

	public void setPanelNumeros(PanelBotones panelNumeros) {
		this.panelNumeros = panelNumeros;
	}

	public PanelEntrada getPanelEntrada() {
		return PanleIngresarNumeros;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.PanleIngresarNumeros = panelEntrada;
	}

	public PanelBotones getPanelRegistro() {
		return panelNumeros;
	}

	public void setPanelRegistro(PanelBotones panelRegistro) {
		this.panelNumeros = panelRegistro;
	}

	public PanelTerminar getPanelResultados() {
		return panelRespuesta;
	}

	public void setPanelResultados(PanelTerminar panelResultados) {
		this.panelRespuesta = panelResultados;
	}

}
