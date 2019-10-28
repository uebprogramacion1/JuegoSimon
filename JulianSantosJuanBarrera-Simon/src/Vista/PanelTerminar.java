package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelTerminar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JButton butTerminar;
	
	public static final String TERMINAR = "Terminar";
	
	public PanelTerminar() {
		
		setLayout(new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder("Terminar");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		butTerminar = new JButton("Terminar");
		butTerminar.setActionCommand(TERMINAR);
		
		
		add(butTerminar);
		
	}



	public JButton getButTerminar() {
		return butTerminar;
	}

	public void setButTerminar(JButton butTerminar) {
		this.butTerminar = butTerminar;
	}
	
}