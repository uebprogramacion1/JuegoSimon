package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.InterfazGUI;
import vista.PanelBotones;

public class Controlador implements ActionListener {
	private InterfazGUI gui;
	private Mundo m;
	
	public Controlador() {
		gui = new InterfazGUI(this);
		m = new Mundo();
		gui.getPanelPuntuacion().getNombre().setText(gui.pedirDato("DIGITE EL NOMBRE DEL JUGAROR"));
		gui.setVisible(true);
		m.getSi().asignarNumeros();
		mostrarTiempo();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		gui.getPanelBotones();
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals(PanelBotones.UNO)) {
			m.getSi().escribirNumeros(1);
		}if(arg0.getActionCommand().equals(PanelBotones.DOS)) {
			m.getSi().escribirNumeros(2);
		}if(arg0.getActionCommand().equals(PanelBotones.TRES)) {
			m.getSi().escribirNumeros(3);
		}if(arg0.getActionCommand().equals(PanelBotones.CUATRO)) {
			m.getSi().escribirNumeros(4);
		}if(arg0.getActionCommand().equals(gui.getPanelResultado().TERMINAR)) {
			gui.mostrarMensaje(m.getSi().compararNumeros());
			if(m.getSi().isVerificar()==true) {
				m.getSi().subirPuntuacion();
				gui.getPanelPuntuacion().getPuntuacion().setText(Integer.toString(m.getSi().getPuntuacion()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
				m.getSi().setPosicion(0);
				m.getSi().asignarNumeros();
				mostrarTiempo();	
			}else {
				if(gui.mensajeConfirmacion()==0) {
					m.getSi().subirPuntuacion();
					gui.getPanelPuntuacion().getPuntuacion().setText(Integer.toString(m.getSi().getPuntuacion()));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
					m.getSi().setPosicion(0);
					m.getSi().asignarNumeros();
					mostrarTiempo();
				}else {
					System.exit(0);
				}
			}
		}
		
	}
	public void mostrarTiempo() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		if(m.getSi().getNumeroAL()[0]==1) {
			gui.getPanelNumero().getTxtnumero1().setBackground(Color.RED);
		}else if(m.getSi().getNumeroAL()[0]==2){
			gui.getPanelNumero().getTxtnumero1().setBackground(Color.BLUE);
		}else if (m.getSi().getNumeroAL()[0]==3) {
			gui.getPanelNumero().getTxtnumero1().setBackground(Color.YELLOW);
		}else if(m.getSi().getNumeroAL()[0]==4) {
			gui.getPanelNumero().getTxtnumero1().setBackground(Color.GREEN);
		}
		gui.getPanelNumero().getTxtnumero1().update(gui.getPanelNumero().getTxtnumero1().getGraphics());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		gui.getPanelNumero().getTxtnumero1().setText("");
		gui.getPanelNumero().getTxtnumero1().setBackground(Color.BLACK);
		gui.getPanelNumero().getTxtnumero1().update(gui.getPanelNumero().getTxtnumero1().getGraphics());
		if(m.getSi().getNumeroAL()[1]==1) {
			gui.getPanelNumero().getTxtnumero2().setBackground(Color.RED);
		}else if(m.getSi().getNumeroAL()[1]==2){
			gui.getPanelNumero().getTxtnumero2().setBackground(Color.BLUE);
		}else if (m.getSi().getNumeroAL()[1]==3) {
			gui.getPanelNumero().getTxtnumero2().setBackground(Color.YELLOW);

		}else if(m.getSi().getNumeroAL()[1]==4) {
			gui.getPanelNumero().getTxtnumero2().setBackground(Color.GREEN);
		}	
		gui.getPanelNumero().getTxtnumero2().update(gui.getPanelNumero().getTxtnumero2().getGraphics());

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		gui.getPanelNumero().getTxtnumero2().setText("");
		gui.getPanelNumero().getTxtnumero2().setBackground(Color.BLACK);
		gui.getPanelNumero().getTxtnumero2().update(gui.getPanelNumero().getTxtnumero2().getGraphics());
		if(m.getSi().getNumeroAL()[2]==1) {
			gui.getPanelNumero().getTxtnumero3().setBackground(Color.RED);
		}else if(m.getSi().getNumeroAL()[2]==2){
			gui.getPanelNumero().getTxtnumero3().setBackground(Color.BLUE);
		}else if (m.getSi().getNumeroAL()[2]==3) {
			gui.getPanelNumero().getTxtnumero3().setBackground(Color.YELLOW);
		}else if(m.getSi().getNumeroAL()[2]==4) {
			gui.getPanelNumero().getTxtnumero3().setBackground(Color.GREEN);
		}	
		gui.getPanelNumero().getTxtnumero3().update(gui.getPanelNumero().getTxtnumero3().getGraphics());

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		gui.getPanelNumero().getTxtnumero3().setText("");
		gui.getPanelNumero().getTxtnumero3().setBackground(Color.BLACK);
		gui.getPanelNumero().getTxtnumero3().update(gui.getPanelNumero().getTxtnumero3().getGraphics());
		if(m.getSi().getNumeroAL()[3]==1) {
			gui.getPanelNumero().getTxtnumero4().setBackground(Color.RED);
		}else if(m.getSi().getNumeroAL()[3]==2){
			gui.getPanelNumero().getTxtnumero4().setBackground(Color.BLUE);
		}else if (m.getSi().getNumeroAL()[3]==3) {
			gui.getPanelNumero().getTxtnumero4().setBackground(Color.YELLOW);
		}else if(m.getSi().getNumeroAL()[3]==4) {
			gui.getPanelNumero().getTxtnumero4().setBackground(Color.GREEN);
		}
		gui.getPanelNumero().getTxtnumero4().update(gui.getPanelNumero().getTxtnumero4().getGraphics());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		gui.getPanelNumero().getTxtnumero4().setText("");
		gui.getPanelNumero().getTxtnumero4().setBackground(Color.BLACK);
		gui.getPanelNumero().getTxtnumero4().update(gui.getPanelNumero().getTxtnumero4().getGraphics());

	}

}
