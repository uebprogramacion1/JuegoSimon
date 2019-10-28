package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador implements ActionListener {

	InterfazGUI gui;
	Mundo m;
	int contador;

	public Controlador() {

		gui = new InterfazGUI(this);
		gui.setVisible(true);
		m = new Mundo();
		secuenciaColores();

		contador = 0;

	}

	// Action para botones Matriz
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(gui.getPanelM().UNO)) {
			m.getJuego().datosUsuario(1);
			contador++;
			if (contador == 4) {
				contador = 0;
				m.getJuego().setCantidad(0);
				mensaje();
				secuenciaColores();
			}

		}
		if (e.getActionCommand().equals(gui.getPanelM().DOS)) {
			m.getJuego().datosUsuario(2);
			contador++;
			if (contador == 4) {
				contador = 0;
				m.getJuego().setCantidad(0);
				mensaje();
				secuenciaColores();
			}
		}
		if (e.getActionCommand().equals(gui.getPanelM().TRES)) {
			m.getJuego().datosUsuario(3);
			contador++;
			if (contador == 4) {
				contador = 0;
				m.getJuego().setCantidad(0);
				mensaje();
				secuenciaColores();
			}
		}
		if (e.getActionCommand().equals(gui.getPanelM().CUATRO)) {
			m.getJuego().datosUsuario(4);
			contador++;
			if (contador == 4) {
				contador = 0;
				m.getJuego().setCantidad(0);
				mensaje();
				secuenciaColores();
			}

		}

	}

	public void secuenciaColores() {

		// Numero Uno

		if (m.getJuego().getJuegoS()[0] == 1) {
			gui.getPanelS().getNumeroUno().setBackground(Color.BLUE);
		} else if (m.getJuego().getJuegoS()[0] == 2) {
			gui.getPanelS().getNumeroUno().setBackground(Color.YELLOW);
		} else if (m.getJuego().getJuegoS()[0] == 3) {
			gui.getPanelS().getNumeroUno().setBackground(Color.GREEN);
		} else if (m.getJuego().getJuegoS()[0] == 4) {
			gui.getPanelS().getNumeroUno().setBackground(Color.RED);
		}
		gui.getPanelS().getNumeroUno().update(gui.getPanelS().getNumeroUno().getGraphics());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}

		gui.getPanelS().getNumeroUno().setText("");
		gui.getPanelS().getNumeroUno().setBackground(Color.GRAY);
		gui.getPanelS().getNumeroUno().update(gui.getPanelS().getNumeroUno().getGraphics());

		// Numero Dos
		if (m.getJuego().getJuegoS()[1] == 1) {
			gui.getPanelS().getNumeroDos().setBackground(Color.BLUE);
		} else if (m.getJuego().getJuegoS()[1] == 2) {
			gui.getPanelS().getNumeroDos().setBackground(Color.YELLOW);
		} else if (m.getJuego().getJuegoS()[1] == 3) {
			gui.getPanelS().getNumeroDos().setBackground(Color.GREEN);
		} else if (m.getJuego().getJuegoS()[1] == 4) {
			gui.getPanelS().getNumeroDos().setBackground(Color.RED);
		}
		gui.getPanelS().getNumeroDos().update(gui.getPanelS().getNumeroDos().getGraphics());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		gui.getPanelS().getNumeroDos().setText("");
		gui.getPanelS().getNumeroDos().setBackground(Color.GRAY);
		gui.getPanelS().getNumeroDos().update(gui.getPanelS().getNumeroDos().getGraphics());

		// Numero Tres
		if (m.getJuego().getJuegoS()[2] == 1) {
			gui.getPanelS().getNumeroTres().setBackground(Color.BLUE);
		} else if (m.getJuego().getJuegoS()[2] == 2) {
			gui.getPanelS().getNumeroTres().setBackground(Color.YELLOW);
		} else if (m.getJuego().getJuegoS()[2] == 3) {
			gui.getPanelS().getNumeroTres().setBackground(Color.GREEN);
		} else if (m.getJuego().getJuegoS()[2] == 4) {
			gui.getPanelS().getNumeroTres().setBackground(Color.RED);
		}
		gui.getPanelS().getNumeroTres().update(gui.getPanelS().getNumeroTres().getGraphics());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

		gui.getPanelS().getNumeroTres().setText("");
		gui.getPanelS().getNumeroTres().setBackground(Color.GRAY);
		gui.getPanelS().getNumeroTres().update(gui.getPanelS().getNumeroTres().getGraphics());

		// Numero Cuatro
		if (m.getJuego().getJuegoS()[3] == 1) {
			gui.getPanelS().getNumeroCuatro().setBackground(Color.BLUE);
		} else if (m.getJuego().getJuegoS()[3] == 2) {
			gui.getPanelS().getNumeroCuatro().setBackground(Color.YELLOW);
		} else if (m.getJuego().getJuegoS()[3] == 3) {
			gui.getPanelS().getNumeroCuatro().setBackground(Color.GREEN);
		} else if (m.getJuego().getJuegoS()[3] == 4) {
			gui.getPanelS().getNumeroCuatro().setBackground(Color.RED);
		}
		gui.getPanelS().getNumeroCuatro().update(gui.getPanelS().getNumeroCuatro().getGraphics());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
		gui.getPanelS().getNumeroCuatro().setText("");
		gui.getPanelS().getNumeroCuatro().setBackground(Color.GRAY);
		gui.getPanelS().getNumeroCuatro().update(gui.getPanelS().getNumeroTres().getGraphics());

	}

	public void mensaje() {

		if (m.getJuego().compararDatos() == true) {
			JOptionPane.showMessageDialog(null, "Secuencia Exitosa!", "Juego Simon", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Fallaste!", "Juego Simon", JOptionPane.ERROR_MESSAGE);
		}
	}

}