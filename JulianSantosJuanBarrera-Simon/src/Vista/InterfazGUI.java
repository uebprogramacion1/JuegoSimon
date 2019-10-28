package Vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import Controlador.Controlador;

public class InterfazGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelNumeros panelNumeros;
	private PanelColores panelColores;
	private PanelTerminar panelTerminar;
	
	public PanelNumeros getPanelNumeros() {
		return panelNumeros;
	}

	public void setPanelNumeros(PanelNumeros panelNumeros) {
		this.panelNumeros = panelNumeros;
	}

	public PanelColores getPanelColores() {
		return panelColores;
	}
	
	public void setPanelColores(PanelColores panelColores) {
		this.panelColores = panelColores;
	}
	
	public PanelTerminar getPanelTerminar() {
		return panelTerminar;
	}

	public void setPanelTerminar(PanelTerminar panelTerminar) {
		this.panelTerminar = panelTerminar;
	}


	public InterfazGUI(Controlador control) {
		
		setSize(500,400);
		setResizable(false);
		setTitle("Simon Dice");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelNumeros = new PanelNumeros();
		add(panelNumeros,BorderLayout.NORTH);
		
		panelColores = new PanelColores();
		add(panelColores,BorderLayout.CENTER);
		
		panelTerminar = new PanelTerminar();
		add(panelTerminar,BorderLayout.SOUTH);
		
		panelTerminar.getButTerminar().addActionListener(control);
		panelColores.getButVerde1().addActionListener(control);
		panelColores.getButRojo2().addActionListener(control);
		panelColores.getButAmarillo3().addActionListener(control);
		panelColores.getButAzul4().addActionListener(control);
	}

}
