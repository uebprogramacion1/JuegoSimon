package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.border.TitledBorder;
	public class PanelMuestra extends JPanel{
		private static final long serialVersionUID =1L;
		 private JLabel labNum;
		 private JLabel labNum1;
		 private JLabel labNum2;
		 private JLabel labNum3;
		 private JLabel labNum4;
	   	    public PanelMuestra() {
	    	setLayout(new GridLayout(1,4));
	    	
	    	
	    	 labNum = new JLabel("Numeros: ");
	    	 Font auxFont=labNum.getFont();
	    	 labNum.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
	    	 
	    	 labNum1 = new JLabel(" ");
	    	 Font auxFont1=labNum1.getFont();
	    	 labNum1.setFont(new Font(auxFont1.getFontName(), auxFont1.getStyle(), 15));
	    	
	    	 labNum2 = new JLabel(" ");
	    	 Font auxFont2=labNum2.getFont();
	    	 labNum2.setFont(new Font(auxFont2.getFontName(), auxFont2.getStyle(), 15));
	    	 
	    	 labNum3 = new JLabel(" ");
	    	 Font auxFont3=labNum3.getFont();
	    	 labNum3.setFont(new Font(auxFont3.getFontName(), auxFont3.getStyle(), 15));
	    	
	    	 labNum4 = new JLabel(" ");
	    	 Font auxFont4=labNum4.getFont();
	    	 labNum4.setFont(new Font(auxFont4.getFontName(), auxFont4.getStyle(), 15));
	    	 
	    	add(labNum);
	    	add(labNum1);
	    	add(labNum2);
	    	add(labNum3);
	    	add(labNum4);
	    	
	    }
			
			public JLabel getLabNum() {
				return labNum;
			}

			public void setLabNum(JLabel labNum) {
				this.labNum = labNum;
			}

			public JLabel getLabNum1() {
				return labNum1;
			}

			public void setLabNum1(JLabel labNum1) {
				this.labNum1 = labNum1;
			}

			public JLabel getLabNum2() {
				return labNum2;
			}

			public void setLabNum2(JLabel labNum2) {
				this.labNum2 = labNum2;
			}

			public JLabel getLabNum3() {
				return labNum3;
			}

			public void setLabNum3(JLabel labNum3) {
				this.labNum3 = labNum3;
			}

			public JLabel getLabNum4() {
				return labNum4;
			}

			public void setLabNum4(JLabel labNum4) {
				this.labNum4 = labNum4;
			}

			public static long getSerialversionuid() {
				return serialVersionUID;
			}
			public void mostrarNumero(int n1,int n2,int n3,int n4) {
				try {
				
				Thread.sleep(100);
				labNum1.setText(Integer.toString(n1));
				Thread.sleep(250);
			    labNum1.setText("");
				Thread.sleep(200);
				labNum2.setText(Integer.toString(n2));
				Thread.sleep(250);
			    labNum2.setText("");
				Thread.sleep(200);
				labNum3.setText(Integer.toString(n3));
				Thread.sleep(250);
			    labNum3.setText("");
				Thread.sleep(200);
				labNum4.setText(Integer.toString(n4));
			    Thread.sleep(250);
			    labNum4.setText("");
				}
				catch (InterruptedException e) {
					JOptionPane.showMessageDialog(null, "Lo sentimos hubo un error", "Error", JOptionPane.ERROR_MESSAGE);
}
			
			}
	}


