package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton butTerminar;
	private JButton butComenzar;
	public static final String TERMINAR = "terminar";
	public static final String COMENZAR = "comenzar";
	
	public PanelResultados() {
		
		setLayout( new GridLayout(1,2) );
		TitledBorder border = BorderFactory.createTitledBorder("EMPEZAR");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		butTerminar = new JButton("TERMINAR");
		butTerminar.setActionCommand(TERMINAR);
		
		butComenzar = new JButton("JUGAR");
		butComenzar.setActionCommand(COMENZAR);
		
		add(butComenzar);
		add(butTerminar);
		
		
		
	}

	public JButton getButTerminar() {
		return butTerminar;
	}

	public void setButTerminar(JButton butTerminar) {
		this.butTerminar = butTerminar;
	}

	public JButton getButComenzar() {
		return butComenzar;
	}

	public void setButComenzar(JButton butComenzar) {
		this.butComenzar = butComenzar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}
