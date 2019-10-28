package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Mundo;
import Vista.InterfazGui;
import Vista.PanelEntrada;

public class Controlador implements ActionListener {
	
		private InterfazGui gui;
		private Mundo mn;
		
		private int [] nn;
		
		private int con = 0;
		
		public Controlador() {
			
			nn = new int[4];
			mn= new Mundo();
			gui = new InterfazGui(this);
			gui.setVisible(true);
		
	}


		@Override
		public void actionPerformed(ActionEvent evento) {
			// TODO Auto-generated method stub
			int gano=0;
			
			
			if (evento.getActionCommand().equals(gui.getPaneltablero().numero1)) {
				nn[con]=1;
				con++;
			}
			if (evento.getActionCommand().equals(gui.getPaneltablero().numero2)) {
				
				nn[con]=2;
				con++;
			}
			if (evento.getActionCommand().equals(gui.getPaneltablero().numero3)) {
				nn[con]=3;
				con++;
			}
			if (evento.getActionCommand().equals(gui.getPaneltablero().numero4)) {
				
				nn[con]=4;
				con++;
			}
			if (evento.getActionCommand().equals(gui.getPanelboton().terminar)) {
				int [ ] vector = gui.getPanelEntrada().getVector();
 				for (int i = 0; i <= 3; i++) {
 					if(vector[i]==nn[i]) {
 						gano=1;
 					}else {
 						gano=0;
 					}
					 if(gano==0) {
						 i=5;
					 }
					
				}
 				
 				if(gano==1) {
 					JOptionPane.showMessageDialog(null, "has ganado");
 				}else {
 					JOptionPane.showMessageDialog(null, " has perdido");
 				}
 				
			}
			
			
				
			}
			
			
		}


