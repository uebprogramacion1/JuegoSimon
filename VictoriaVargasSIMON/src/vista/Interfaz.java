package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

import controlador.Controlador;

public class Interfaz extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private PanelBotones PB;
	private PanelNumero PN;
	
	public Interfaz(Controlador c) {
		super("SIMON");
		setResizable(false);
		setLayout(null);
		setSize(550,470);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		PN = new PanelNumero(c);
		//PN.setVisible(true);
		PN.setBounds(0,0,550,150);
		add(PN,BorderLayout.CENTER);
		
		PB = new PanelBotones(c);
		//PB.setVisible(true);
		PB.setBounds(0,150,550,450);
		add(PB,BorderLayout.CENTER);
		
		setVisible(true);
	}

	public PanelBotones getPB() {
		return PB;
	}

	public void setPB(PanelBotones pB) {
		PB = pB;
	}

	public PanelNumero getPN() {
		return PN;
	}

	public void setPN(PanelNumero pN) {
		PN = pN;
	}

	
}
