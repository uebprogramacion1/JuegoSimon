package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class PanelNumARepetir extends JPanel {  

	private static final long serialVersionUID = 1L; 

	private JLabel labNumRepetir;
	private JTextField txtNum1, txtNum2, txtNum3, txtNum4;

	public PanelNumARepetir() {
		setLayout(new GridLayout(1, 5));
		setBackground(Color.GRAY);
		labNumRepetir = new JLabel("Número: ");
		labNumRepetir.setForeground(Color.WHITE);
		txtNum1 = new JTextField("");
		txtNum1.setEditable(false);
		txtNum1.setBackground(Color.GRAY);
		txtNum1.setBorder(new LineBorder(Color.GRAY));
		txtNum1.setForeground(Color.WHITE);
		txtNum2 = new JTextField("");
		txtNum2.setEditable(false);
		txtNum2.setBackground(Color.GRAY);
		txtNum2.setBorder(new LineBorder(Color.GRAY));
		txtNum2.setForeground(Color.WHITE);
		txtNum3 = new JTextField("");
		txtNum3.setEditable(false);
		txtNum3.setBackground(Color.GRAY);
		txtNum3.setBorder(new LineBorder(Color.GRAY));
		txtNum3.setForeground(Color.WHITE);
		txtNum4 = new JTextField("");
		txtNum4.setEditable(false);
		txtNum4.setBackground(Color.GRAY);
		txtNum4.setBorder(new LineBorder(Color.GRAY));
		txtNum4.setForeground(Color.WHITE);
		add(labNumRepetir);
		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(txtNum4);
	}

	public JTextField getTxtNum1() {
		return txtNum1;
	}

	public void setTxtNum1(JTextField txtNum1) {
		this.txtNum1 = txtNum1;
	}

	public JTextField getTxtNum2() {
		return txtNum2;
	}

	public void setTxtNum2(JTextField txtNum2) {
		this.txtNum2 = txtNum2;
	}

	public JTextField getTxtNum3() {
		return txtNum3;
	}

	public void setTxtNum3(JTextField txtNum3) {
		this.txtNum3 = txtNum3;
	}

	public JTextField getTxtNum4() {
		return txtNum4;
	}

	public void setTxtNum4(JTextField txtNum4) {
		this.txtNum4 = txtNum4;
	}

}
