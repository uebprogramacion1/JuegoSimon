package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	public static final String UNO = "uno";
	public static final String DOS = "dos";
	public static final String TRES = "tres";
	public static final String  CUATRO = "cuatro";
	
	public PanelBotones() {
		setLayout( new GridLayout(2,2) );
		TitledBorder border = BorderFactory.createTitledBorder("DIGITA TU NUMERO");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		boton1 = new JButton("1");
		boton1.setActionCommand(UNO);
		boton2 = new JButton("2");
		boton2.setActionCommand(DOS);
		boton3 = new JButton("3");
		boton3.setActionCommand(TRES);
		boton4 = new JButton("4");
		boton4.setActionCommand(CUATRO);
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		
	}

	public JButton getBoton1() {
		return boton1;
	}

	public void setBoton1(JButton boton1) {
		this.boton1 = boton1;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}

	public JButton getBoton3() {
		return boton3;
	}

	public void setBoton3(JButton boton3) {
		this.boton3 = boton3;
	}

	public JButton getBoton4() {
		return boton4;
	}

	public void setBoton4(JButton boton4) {
		this.boton4 = boton4;
	}



	

}
