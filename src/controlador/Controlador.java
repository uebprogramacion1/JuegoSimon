package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.InterfazGUI;
public class Controlador implements ActionListener  {
private Mundo m;
private InterfazGUI gui;
private int numero;
int[] Num1;
public Controlador()  {
	m = new Mundo();
	gui = new InterfazGUI(this);
	gui.mostrarInicio();
	gui.setVisible(true);
	m.getSim().crearNumero();
	gui.getPanelMuestra().mostrarNumero(m.getSim().getNum()[0],m.getSim().getNum()[1],m.getSim().getNum()[2],m.getSim().getNum()[3]);
    numero =0;
	Num1 = new int[4];
}

public void actionPerformed(ActionEvent evento) {
	if(evento.getActionCommand().equals(gui.getPanelFinalizar().TERMINAR)) {
		try
   	 {
		JOptionPane.showMessageDialog(null,m.getSim().darResultados(Num1[0],Num1[1],Num1[2],Num1[3]));
		 Thread.sleep(400);
		System.exit(0);
   	 }	
		catch(NullPointerException|InterruptedException e)
   	 {
			JOptionPane.showMessageDialog(null, "Por favor ingrese la secuencia", "Error", JOptionPane.ERROR_MESSAGE);
   	 }
	}
	if(evento.getActionCommand().equals(gui.getPanelEntrada().UNO)) {
		try
	   	 {
			int ingreso=1;
			Num1[numero]= 1;
			numero++;
	   	 }
		catch(ArrayIndexOutOfBoundsException e)
	   	 {
				JOptionPane.showMessageDialog(null, "Por favor presione finalizar", "Error", JOptionPane.ERROR_MESSAGE);
	   	 }
	}
	if(evento.getActionCommand().equals(gui.getPanelEntrada().DOS)) {
		try
	   	 {
			int ingreso=2;
			Num1[numero]=ingreso;
			numero++;
	 	 }
		catch(ArrayIndexOutOfBoundsException e)
	   	 {
				JOptionPane.showMessageDialog(null, "Por favor presione finalizar", "Error", JOptionPane.ERROR_MESSAGE);
	   	 }
		
	}
	if(evento.getActionCommand().equals(gui.getPanelEntrada().TRES)) {
		try
	   	 {
			int ingreso=3;
			Num1[numero]=ingreso;
			numero++;
	   	 }
		catch(ArrayIndexOutOfBoundsException e)
	   	 {
				JOptionPane.showMessageDialog(null, "Por favor presione finalizar", "Error", JOptionPane.ERROR_MESSAGE);
	   	 }
		
	}
	if(evento.getActionCommand().equals(gui.getPanelEntrada().CUATRO)) {
		try
	   	 {
			int ingreso=4;
			Num1[numero]=ingreso;
			numero++;
	 	 }
		catch(ArrayIndexOutOfBoundsException e)
	   	 {
				JOptionPane.showMessageDialog(null, "Por favor presione finalizar", "Error", JOptionPane.ERROR_MESSAGE);
	   	 }
	

	}
}
}
