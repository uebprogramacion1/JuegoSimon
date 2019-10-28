package Controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Modelo.Mundo;

import Vista.InterfazGUI;
import Vista.PanelEntrada;

public class Controlador implements ActionListener {

	private Mundo bd;
	private InterfazGUI gui;
	
	private int numeroIntento;
	public int[] campoBotones = new int[4];
	private int[] numerosAleatorios;
	private int contador = 0;
	private int i = 0;

	public Controlador() {

		bd = new Mundo();
		numerosAleatorios=bd.getNumAle().NumeroAleatorios();
		gui = new InterfazGUI(this);
	
		System.out.println(numerosAleatorios[0]);
		System.out.println(numerosAleatorios[1]);
		System.out.println(numerosAleatorios[2]);
		System.out.println(numerosAleatorios[3]);
		gui.setVisible(true);
		
		gui.getPanelEntrada().getTxtNumero01().setText(String.valueOf(numerosAleatorios[0]));
		gui.getPanelEntrada().getTxtNumero02().setText(String.valueOf(numerosAleatorios[1]));
		gui.getPanelEntrada().getTxtNumero03().setText(String.valueOf(numerosAleatorios[2]));
		gui.getPanelEntrada().getTxtNumero04().setText(String.valueOf(numerosAleatorios[3]));
		gui.getPanelEntrada();
		
		////////////////////////////////////////////////////////////
		try {
			Thread.sleep(700);
			gui.getPanelEntrada().getTxtNumero01().setText(" ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(700);
			gui.getPanelEntrada().getTxtNumero02().setText(" ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(700);
			gui.getPanelEntrada().getTxtNumero03().setText(" ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(700);
			gui.getPanelEntrada().getTxtNumero04().setText(" ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	////////////////////////////////////////////////////////////////
		  
		
	}
	
	// Acciones de cada botón

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getActionCommand().equals(gui.getPanelNumeros().BOTON1)) {
				numeroIntento = 1;
				campoBotones[i] = numeroIntento;
				i++;
				contador++;
				
			}

			if (e.getActionCommand().equals(gui.getPanelNumeros().BOTON2)) {
				numeroIntento = 2;
				campoBotones[i] = numeroIntento;
				i++;
				contador++;
			}

			if (e.getActionCommand().equals(gui.getPanelNumeros().BOTON3)) {
				numeroIntento = 3;
				campoBotones[i] = numeroIntento;
				i++;
				contador++;
			}

			if (e.getActionCommand().equals(gui.getPanelNumeros().BOTON4)) {
				numeroIntento = 4;
				campoBotones[i] = numeroIntento;
				i++;
				contador++;

			}
			if (contador > 4) {
				throw new Exception("El programa sólo permite un máximo de cuatro botones.");
			}
		} catch (Exception mensaje) {
			JOptionPane.showMessageDialog(null, "Sólo se permite presionar un máximo de cuatro botones.  "," Error",2);
		}
		
		if (e.getActionCommand().equals(gui.getPanelRespuesta().TERMINAR)) {
			if (contador == 4) {
				if (numerosAleatorios[0] == campoBotones[0]
						&& numerosAleatorios[1] == campoBotones[1]
						&& numerosAleatorios[2] == campoBotones[2]
						&& numerosAleatorios[3] == campoBotones[3]) {
					JOptionPane.showMessageDialog(null, "Has ganado, ¡secuencia exitosa!", "Victoria",1);
					System.exit(0);
				} else
					JOptionPane.showMessageDialog(null, " Has perdido, ¡secuencia incorrecta!", "Fin del juego",2);
				    System.exit(0);
				
			}
			
		}
		
	}
	
}
