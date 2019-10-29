package vista;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
      private static final long serialVersionUID = 1L;
      private JButton but1;
      public static final String UNO ="1";
      private JButton but2;
      public static final String DOS ="2";
      private JButton but3;
      public static final String TRES ="3";
      private JButton but4;
      public static final String CUATRO ="4";
      public PanelEntrada(){
    	  setLayout(new GridLayout(2,2));
    	  TitledBorder border = BorderFactory.createTitledBorder("");
    	  border.setTitleColor(Color.BLACK);
    	  setBorder(border);
    	 
    	  but1 = new JButton("1");
    		but1.setActionCommand(UNO);
    		but1.setBackground(Color.GREEN);
    		Font auxFont1=but1.getFont();
	    	but1.setFont(new Font(auxFont1.getFontName(), auxFont1.getStyle(), 45));
    		but2 = new JButton("2");
    		but2.setBackground(Color.RED);
    		Font auxFont2=but2.getFont();
	    	but2.setFont(new Font(auxFont2.getFontName(), auxFont2.getStyle(), 45));
    		but2.setActionCommand(DOS);
    		but3 = new JButton("3");
    		but3.setBackground(Color.YELLOW);
    		Font auxFont3=but3.getFont();
	    	but3.setFont(new Font(auxFont3.getFontName(), auxFont3.getStyle(), 45));
    		but3.setActionCommand(TRES);
    		but4 = new JButton("4");
    		but4.setBackground(Color.blue);
    		Font auxFont4=but4.getFont();
	    	but4.setFont(new Font(auxFont4.getFontName(), auxFont4.getStyle(), 45));
    		but4.setActionCommand(CUATRO);
    		add(but1);
    		add(but2);
    		add(but3);
    		add(but4);
      }
	public JButton getBut1() {
		return but1;
	}
	public void setBut1(JButton but1) {
		this.but1 = but1;
	}
	public JButton getBut2() {
		return but2;
	}
	public void setBut2(JButton but2) {
		this.but2 = but2;
	}
	public JButton getBut3() {
		return but3;
	}
	public void setBut3(JButton but3) {
		this.but3 = but3;
	}
	public JButton getBut4() {
		return but4;
	}
	public void setBut4(JButton but4) {
		this.but4 = but4;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static String getUno() {
		return UNO;
	}
	public static String getDos() {
		return DOS;
	}
	public static String getTres() {
		return TRES;
	}
	public static String getCuatro() {
		return CUATRO;
	}
	
	
      
}
