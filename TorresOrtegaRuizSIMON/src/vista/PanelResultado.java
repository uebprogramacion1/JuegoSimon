package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultado extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton terminar;
	public static final String TERMINAR = "terminar";

	
	public PanelResultado() {
		setLayout( new GridLayout(1,3) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.white);
		setBackground(Color.black);
		setBorder( border );
		terminar = new JButton("TERMINAR");
		terminar.setActionCommand(TERMINAR);
		add(new JLabel());
		add(terminar);
		terminar.setForeground(Color.white);
		terminar.setBackground(Color.black);;
		add(new JLabel());
		
	}

	public JButton getTerminar() {
		return terminar;
	}

	public void setTerminar(JButton terminar) {
		this.terminar = terminar;
	}

}
