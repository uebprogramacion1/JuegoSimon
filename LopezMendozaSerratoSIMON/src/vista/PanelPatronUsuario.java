package vista;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class PanelPatronUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton but1, but2, but3, but4;
	public static final String UNO = "Uno";
	public static final String DOS = "Dos";
	public static final String TRES = "Tres";
	public static final String CUATRO = "Cuatro";

	public PanelPatronUsuario() {
		setLayout(new GridLayout(2, 4));
		setBackground(Color.GRAY);
		Font fuente = new Font("Calibri", 1, 50);
		but1 = new JButton("1");
		but1.setPreferredSize(new Dimension(120, 70));
		but1.setFont(fuente);
		but1.setBackground(Color.ORANGE);
		but1.setForeground(Color.WHITE);
		but1.setActionCommand(UNO);
		but1.setBorder(new LineBorder(Color.WHITE, 5));
		but2 = new JButton("2");
		but2.setPreferredSize(new Dimension(120, 70));
		but2.setFont(fuente);
		but2.setBackground(Color.BLUE);
		but2.setForeground(Color.WHITE);
		but2.setActionCommand(DOS);
		but2.setBorder(new LineBorder(Color.WHITE, 5));
		but3 = new JButton("3");
		but3.setPreferredSize(new Dimension(120, 70));
		but3.setFont(fuente);
		but3.setBackground(Color.RED);
		but3.setForeground(Color.WHITE);
		but3.setActionCommand(TRES);
		but3.setBorder(new LineBorder(Color.WHITE, 5));
		but4 = new JButton("4");
		but4.setPreferredSize(new Dimension(120, 70));
		but4.setFont(fuente);
		but4.setBackground(Color.GREEN);
		but4.setForeground(Color.WHITE);
		but4.setActionCommand(CUATRO);
		but4.setBorder(new LineBorder(Color.WHITE, 5));

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

	public static String getCuatro() {
		return CUATRO;
	}

}
