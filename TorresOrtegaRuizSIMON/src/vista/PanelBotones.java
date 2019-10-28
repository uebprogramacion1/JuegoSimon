package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton uno,dos,tres,cuatro;
	private Font fuente1;
	public static final String UNO = "1";
	public static final String DOS = "2";
	public static final String TRES = "3";
	public static final String CUATRO = "4";
	public PanelBotones() {
		setLayout( new GridLayout(2,4) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.white);
		setBackground(Color.black);
		setBorder( border );
		fuente1= new Font("Tahoma",Font.BOLD,50);
		uno = new JButton("");
		uno.setFont(fuente1);
		uno.setBackground(Color.RED);
		uno.setForeground(Color.white);
		uno.setActionCommand(UNO);
		dos = new JButton("");
		dos.setFont(fuente1);
		dos.setBackground(Color.blue);
		dos.setForeground(Color.white);
		dos.setActionCommand(DOS);
		tres = new JButton("");
		tres.setFont(fuente1);
		tres.setForeground(Color.white);
		tres.setBackground(Color.yellow);
		tres.setActionCommand(TRES);
		cuatro = new JButton("");
		cuatro.setBackground(Color.green);
		cuatro.setForeground(Color.white);
		cuatro.setFont(fuente1);
		cuatro.setActionCommand(CUATRO);
		add(new JLabel(""));
		add(uno);
		add(dos);
		add(new JLabel(""));
		add(new JLabel(""));
		add(tres);
		add(cuatro);
		add(new JLabel(""));
	}
	public JButton getUno() {
		return uno;
	}
	public void setUno(JButton uno) {
		this.uno = uno;
	}
	public JButton getDos() {
		return dos;
	}
	public void setDos(JButton dos) {
		this.dos = dos;
	}
	public JButton getTres() {
		return tres;
	}
	public void setTres(JButton tres) {
		this.tres = tres;
	}
	public JButton getCuatro() {
		return cuatro;
	}
	public void setCuatro(JButton cuatro) {
		this.cuatro = cuatro;
	}

}
