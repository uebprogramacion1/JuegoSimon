package Controlador;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import Modelo.Mundo;
import Vista.InterfazGUI;

public class Controlador implements ActionListener {
	
	private InterfazGUI gui;
	private String numusuario;	
	private Mundo mundo;
	private Timer timer;
	private boolean dato;
	
	
	public Controlador() {
		
		gui = new InterfazGUI(this);
		gui.setVisible(true);
		mundo = new Mundo();
		numusuario="";
		dato=true;
		timer = new Timer(1600, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui.getPanelnumero().getLblnumeros().setText("----");
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getActionCommand().equals(gui.getPanelresultados().COMENZAR)) {
		mundo.getNumero().crearArreglo();
		gui.getPanelnumero().getLblnumeros().setText((mundo.getNumero().trasformarArreglo()));
		timer.start();
		}
		if (evento.getActionCommand().equals(gui.getPanelbotones().UNO)) {
			timer.stop();
			if(numusuario.length()<4) {
			numusuario+="1";
			gui.getPanelnumero().getLblnumeros().setText(numusuario);
			}
		}
		if (evento.getActionCommand().equals(gui.getPanelbotones().DOS)) {
			timer.stop();
			if(numusuario.length()<4) {
			numusuario+="2";
			gui.getPanelnumero().getLblnumeros().setText(numusuario);
			}
		}
		if (evento.getActionCommand().equals(gui.getPanelbotones().TRES)) {
			timer.stop();
			if(numusuario.length()<4) {
			numusuario+="3";
			gui.getPanelnumero().getLblnumeros().setText(numusuario);
			}
        }
		if (evento.getActionCommand().equals(gui.getPanelbotones().CUATRO)) {
			timer.stop();
			if(numusuario.length()<4) {
			numusuario+="4";
			gui.getPanelnumero().getLblnumeros().setText(numusuario);
			}
        }
		if (evento.getActionCommand().equals(gui.getPanelresultados().TERMINAR)) {
			if(numusuario.length()<4) {
				gui.Validacion();
			}else {
			mundo.getNumero().setNum(numusuario);
			}
			if(mundo.getNumero().compararArreglo()) {
				gui.escribirMensaje(dato);
			}else {
				gui.escribirMensaje(!dato);
			}
			numusuario="";
			mundo.getNumero().setNum(numusuario);
			gui.getPanelnumero().getLblnumeros().setText("----");
		}
	}
}