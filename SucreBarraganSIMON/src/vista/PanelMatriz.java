package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelMatriz extends JPanel {

	private JButton uno, dos, tres, cuatro;
	// private JTextArea color1, color2, color3, color4;
	private Font color;
	public static final String UNO = "1";
	public static final String DOS = "2";
	public static final String TRES = "3";
	public static final String CUATRO = "4";

	public PanelMatriz() {

		setLayout(new GridLayout(2, 4));
		TitledBorder titleB = BorderFactory.createTitledBorder("");
		titleB.setTitleColor(Color.white);
		setBackground(Color.GRAY);
		setBorder(titleB);

		color = new Font("Helvetica", Font.BOLD, 50);

		// AGREGAR ACA UN LABEL PARA PODER PONERLE COLOR ELI POR FAVOR

		uno = new JButton("");
		uno.setFont(color);
		uno.setForeground(Color.BLACK);
		uno.setBackground(Color.BLUE);
		uno.setOpaque(true);
		uno.setBorderPainted(false);
		uno.setActionCommand(UNO);
		
		add(uno);

		dos = new JButton("");
		dos.setFont(color);
		dos.setForeground(Color.BLACK);
		dos.setBackground(Color.YELLOW);
		dos.setOpaque(true);
		dos.setBorderPainted(false);
		dos.setActionCommand(DOS);
		add(dos);
	

		tres = new JButton("");
		tres.setFont(color);
		tres.setForeground(Color.BLACK);
		tres.setBackground(Color.GREEN);
		tres.setOpaque(true);
		tres.setBorderPainted(false);
		tres.setActionCommand(TRES);
		add(tres);

		cuatro = new JButton("");
		cuatro.setFont(color);
		cuatro.setForeground(Color.BLACK);
		cuatro.setBackground(Color.RED);
		cuatro.setOpaque(true);
		cuatro.setBorderPainted(false);
		cuatro.setActionCommand(CUATRO);
		add(cuatro);
		

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
