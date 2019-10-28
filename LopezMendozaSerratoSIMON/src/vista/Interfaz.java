package vista;

import java.awt.*;

import javax.swing.*;

import controlador.*;

public class Interfaz extends JFrame{

	private static final long serialVersionUID = 1L; 
	
	PanelNumARepetir panelNumARepetir;
	PanelPatronUsuario panelPatronUsuario;
	PanelTerminar panelTerminar;
	
	public Interfaz(Controlador control) {
		
		setSize(300, 250);
		setResizable(false);
		setTitle("SIMON");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		getContentPane().setBackground(Color.GRAY);
		
		panelNumARepetir = new PanelNumARepetir();
		add(panelNumARepetir, BorderLayout.NORTH);
		
		panelPatronUsuario = new PanelPatronUsuario();
		add(panelPatronUsuario, BorderLayout.CENTER);
		
		panelTerminar = new PanelTerminar();
		add(panelTerminar, BorderLayout.SOUTH);
		
		panelPatronUsuario.getBut1().addActionListener(control);
		panelPatronUsuario.getBut2().addActionListener(control);
		panelPatronUsuario.getBut3().addActionListener(control);
		panelPatronUsuario.getBut4().addActionListener(control);
		panelTerminar.getButTerminar().addActionListener(control);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PanelNumARepetir getPanelNumARepetir() {
		return panelNumARepetir;
	}

	public PanelPatronUsuario getPanelPatronUsuario() {
		return panelPatronUsuario;
	}

}
