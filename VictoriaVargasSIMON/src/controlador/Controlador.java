package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.Interfaz;
import vista.PanelBotones;

public class Controlador implements ActionListener {
	private Mundo BD;
	private Interfaz gui;
	private int[] arreglo3;
	private int nuevito[];
	private int auxiliar;

	public Controlador() {
		BD = new Mundo();
		gui = new Interfaz(this);

		darInformacion();
		nuevito = new int [4];
		auxiliar =0;
	}

	public void darInformacion() {

		int N1=(int)(Math.random()*4)+1;
		int N2=(int)(Math.random()*4)+1;
		int N3=(int)(Math.random()*4)+1;
		int N4=(int)(Math.random()*4)+1;
		arreglo3 = new int [4];
		arreglo3 [0] = N1;
		arreglo3 [1] = N2;
		arreglo3 [2] = N3;
		arreglo3 [3] = N4;
		BD.getJuego().setArreglo(arreglo3);
		gui.getPN().getTxtUno().setText(""+N1);
		gui.getPN().getTxtDos().setText(""+N2);
		gui.getPN().getTxtTres().setText(""+N3);
		gui.getPN().getTxtCuatro().setText(""+N4);

		try {

			Thread.sleep(20*100);
		} catch (Exception e) {
			System.out.println(e);
		}
		gui.getPN().getTxtUno().setText("");
		gui.getPN().getTxtDos().setText("");
		gui.getPN().getTxtTres().setText("");
		gui.getPN().getTxtCuatro().setText("");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String evento = e.getActionCommand();

		//Boton Uno
		try {
		if(evento.equals(PanelBotones.BOTON_UNO))
		{
			nuevito[auxiliar]=1;
			if(auxiliar==0) {
				gui.getPN().getTxtUno().setText("1");
			}else if(auxiliar==1) {
				gui.getPN().getTxtDos().setText("1");
			}else if(auxiliar==2) {
				gui.getPN().getTxtTres().setText("1");
			}else if(auxiliar==3) {
				gui.getPN().getTxtCuatro().setText("1");
			}
			auxiliar++;
			
		}
		else if(evento.equals(PanelBotones.BOTON_DOS))
		{
			nuevito[auxiliar]=2;
			if(auxiliar==0) {
				gui.getPN().getTxtUno().setText("2");
			}else if(auxiliar==1) {
				gui.getPN().getTxtDos().setText("2");
			}else if(auxiliar==2) {
				gui.getPN().getTxtTres().setText("2");
			}else if(auxiliar==3) {
				gui.getPN().getTxtCuatro().setText("2");
			}
			auxiliar++;
		}
		else if (evento.equals(PanelBotones.BOTON_TRES))
		{
			nuevito[auxiliar]=3;
			if(auxiliar==0) {
				gui.getPN().getTxtUno().setText("3");
			}else if(auxiliar==1) {
				gui.getPN().getTxtDos().setText("3");
			}else if(auxiliar==2) {
				gui.getPN().getTxtTres().setText("3");
			}else if(auxiliar==3) {
				gui.getPN().getTxtCuatro().setText("3");
			}
			auxiliar++;
		}
		else if(evento.equals(PanelBotones.BOTON_CUATRO))
		{
			nuevito[auxiliar]=4;
			if(auxiliar==0) {
				gui.getPN().getTxtUno().setText("4");
			}else if(auxiliar==1) {
				gui.getPN().getTxtDos().setText("4");
			}else if(auxiliar==2) {
				gui.getPN().getTxtTres().setText("4");
			}else if(auxiliar==3) {
				gui.getPN().getTxtCuatro().setText("4");
			}
			auxiliar++;
		}
		
		else if (evento.equals(PanelBotones.BOTON_TERMINAR))
		{
			boolean rts= BD.getJuego().compararNumeros(nuevito);
			
			if (rts==true) 
			{
				JOptionPane.showMessageDialog(gui, "Secuencia Exitosa!");
			}
			else 
			{
				JOptionPane.showMessageDialog(gui, "Fallaste!");
			}
			System.exit(0);//salir del programa
		}}
		catch (ArrayIndexOutOfBoundsException o){
			JOptionPane.showMessageDialog(null, "Solo 4 números");
		}
		

	}

	public Mundo getBD() {
		return BD;
	}

	public void setBD(Mundo bD) {
		BD = bD;
	}

	public Interfaz getGui() {
		return gui;
	}

	public void setGui(Interfaz gui) {
		this.gui = gui;
	}





}
