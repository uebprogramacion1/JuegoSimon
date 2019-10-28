package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Mundo;
import Vista.InterfazGUI;


public class Controlador implements ActionListener {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	//Atributos que vienen de Vista - GUI
	private InterfazGUI gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		gui = new InterfazGUI(this);
		gui.setVisible(true);
		
		int num = bd.getSimon().NumerosSimon();
		gui.getPanelNumeros().getTxtNumero1().setText(Integer.toString(num));
		int num1 = bd.getSimon().NumerosSimon();
		gui.getPanelNumeros().getTxtNumero2().setText(Integer.toString(num1));
		int num2 = bd.getSimon().NumerosSimon();
		gui.getPanelNumeros().getTxtNumero3().setText(Integer.toString(num2));
		int num3 = bd.getSimon().NumerosSimon();
		gui.getPanelNumeros().getTxtNumero4().setText(Integer.toString(num3));
		

		  try {
			Thread.sleep(2000);
			gui.getPanelNumeros().getTxtNumero1().setText("");
			gui.getPanelNumeros().getTxtNumero2().setText("");
			gui.getPanelNumeros().getTxtNumero3().setText("");
			gui.getPanelNumeros().getTxtNumero4().setText("");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getActionCommand().equals(gui.getPanelTerminar().TERMINAR)) {
			gui.getPanelTerminar().getButTerminar();
			if(bd.getSimon().ValidarJuego() == true) {
				JOptionPane.showMessageDialog(null,"Secuencia Exitosa!","Simon Dice - Julian Santos-Juan Barrera",JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null,"Fallaste","Simon Dice - Julian Santos-Juan Barrera",JOptionPane.INFORMATION_MESSAGE);
			}
	    }
		
		
		if(evento.getActionCommand().equals(gui.getPanelColores().VERDE)) {
			gui.getPanelColores().getButVerde1();
			bd.getSimon().ValidarBotones(1);
		}
		
		if(evento.getActionCommand().equals(gui.getPanelColores().ROJO)) {
			gui.getPanelColores().getButRojo2();
			bd.getSimon().ValidarBotones(2);
		}
		
		if(evento.getActionCommand().equals(gui.getPanelColores().AMARILLO)) {
			gui.getPanelColores().getButAmarillo3();
			bd.getSimon().ValidarBotones(3);
		}
		
		if(evento.getActionCommand().equals(gui.getPanelColores().AZUL)) {
			gui.getPanelColores().getButAzul4();
			bd.getSimon().ValidarBotones(4);
		}

	}
	
}