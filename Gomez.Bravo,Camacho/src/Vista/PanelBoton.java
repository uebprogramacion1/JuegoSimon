package Vista;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBoton extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton Terminar ;
	public static final String terminar = "terminar";
	public PanelBoton() {
		setLayout( new GridLayout(3,3) );
		TitledBorder border = BorderFactory.createTitledBorder("terminar juego");
		Terminar= new JButton("terminar");
		Terminar.setActionCommand(terminar);
		add(Terminar);
		
		
	}
	public JButton getTerminar() {
		return Terminar;
	}
	public void setTerminar(JButton terminar) {
		Terminar = terminar;
	}

}

