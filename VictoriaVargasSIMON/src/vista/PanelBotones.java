package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import controlador.Controlador;

public class PanelBotones extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JButton btnUno;
	private JButton btnDos;
	private JButton btnTres;
	private JButton btnCuatro;
	private JButton btnTerminar;
	
	public static final String BOTON_UNO = "Boton Uno";
	public static final String BOTON_DOS = "Boton Dos";
	public static final String BOTON_TRES = " Boton Tres";
	public static final String BOTON_CUATRO ="Boton Cuatro";
	public static final String BOTON_TERMINAR ="Boton Terminar";
	
	public PanelBotones(Controlador c) {
		
		setLayout(null);
		setBackground(new Color(222,235,254));
		//Boton Uno
		btnUno = new JButton("1");
		btnUno.setBounds(155,0,120,110);
		btnUno.setBackground(new Color(41,44,219));
		btnUno.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		btnUno.setActionCommand(BOTON_UNO);
		btnUno.addActionListener(c);
		add(btnUno);
		
		btnDos = new JButton("2");
		btnDos.setBounds(270,0,120,110);
		btnDos.setBackground(new Color(245,233,0));
		btnDos.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		btnDos.setActionCommand(BOTON_DOS);
		btnDos.addActionListener(c);
		add(btnDos);
		
		btnTres = new JButton("3");
		btnTres.setBounds(155,110,120,110);
		btnTres.setBackground(new Color(1,219,19));
		btnTres.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		btnTres.setActionCommand(BOTON_TRES);
		btnTres.addActionListener(c);
		add(btnTres);
		
		
		btnCuatro = new JButton("4");
		btnCuatro.setBounds(270,110,120,110);
		btnCuatro.setBackground(new Color(242,5,5));
		btnCuatro.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		btnCuatro.setActionCommand(BOTON_CUATRO);
		btnCuatro.addActionListener(c);
		add(btnCuatro);
		
		btnTerminar = new JButton("Terminar");
		btnTerminar.setBounds(225,230,100,30);
		btnTerminar.setBackground(new Color(109,242,242));
		btnTerminar.setActionCommand(BOTON_TERMINAR);
		btnTerminar.addActionListener(c);
		add(btnTerminar);
		
		setVisible(true);
	}

}
