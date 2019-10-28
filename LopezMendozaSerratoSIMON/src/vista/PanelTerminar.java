package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class PanelTerminar extends JPanel {  

	private static final long serialVersionUID = 1L; 
	private JButton butTerminar;
	public static final String TERMINAR = "Terminar";

	public PanelTerminar() {
		setLayout(new GridLayout(1, 1));
		setBackground(Color.GRAY);
		butTerminar = new JButton("Terminar");
		butTerminar.setPreferredSize(new Dimension(120,30));
		butTerminar.setBackground(Color.GRAY);
		butTerminar.setForeground(Color.WHITE);
		butTerminar.setBorder(new LineBorder(Color.GRAY));
		add(butTerminar);


		butTerminar.setActionCommand(TERMINAR);

	}

	public JButton getButTerminar() {
		return butTerminar;
	}

	public void setButTerminar(JButton butTerminar) {
		this.butTerminar = butTerminar;
	}
}
