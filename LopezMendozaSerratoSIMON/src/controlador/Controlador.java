package controlador;

import java.awt.event.*;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador implements ActionListener { 

	private Mundo mundo;
	private Interfaz gui;
	private int cont = 0;
	private int[] patronIngresado = new int[4]; 

	public Controlador() {
		mundo = new Mundo();
		gui = new Interfaz(this);

		gui.setVisible(true);

		int[] pantronAdivinar = mundo.getJuego().darNumRepetir();

		try {
			gui.getPanelNumARepetir().getTxtNum1().setText("      "+pantronAdivinar[0] + "");
			Thread.sleep(1000);
			gui.getPanelNumARepetir().getTxtNum1().setText("");
			
			gui.getPanelNumARepetir().getTxtNum2().setText("      "+pantronAdivinar[1] + "");
			Thread.sleep(1000);
			gui.getPanelNumARepetir().getTxtNum2().setText("");
			
			gui.getPanelNumARepetir().getTxtNum3().setText("      "+pantronAdivinar[2] + "");
			Thread.sleep(1000);
			gui.getPanelNumARepetir().getTxtNum3().setText("");
			
			gui.getPanelNumARepetir().getTxtNum4().setText("      "+pantronAdivinar[3] + "");
			Thread.sleep(1000);
			gui.getPanelNumARepetir().getTxtNum4().setText("");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent evento) {

		gui.getPanelPatronUsuario();
		try {
			if (evento.getActionCommand().equals("Uno")) {
				patronIngresado[cont] = 1;
				cont++;

			} else if (evento.getActionCommand().equals("Dos")) {
				patronIngresado[cont] = 2;
				cont++;

			} else if (evento.getActionCommand().equals("Tres")) {
				patronIngresado[cont] = 3;
				cont++;

			} else if (evento.getActionCommand().equals("Cuatro")) {
				patronIngresado[cont] = 4;
				cont++;

			} else if (evento.getActionCommand().equals("Terminar")) {
				if (patronIngresado[0] == 0 || patronIngresado[1] == 0 || patronIngresado[2] == 0
						|| patronIngresado[3] == 0) {
					JOptionPane.showMessageDialog(null, "SECUENCIA INCOMPLETA", "Advertencia",
							JOptionPane.WARNING_MESSAGE);
				} else {
					boolean res = mundo.getJuego().verficarPatrones(patronIngresado);
					if (res == true) {
						JOptionPane.showMessageDialog(null, "Secuencia Exitosa!");
					} else {
						JOptionPane.showMessageDialog(null, "Fallaste!", null, JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "SECUENCIA NO PERMITIDA" , "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
