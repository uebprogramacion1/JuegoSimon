package Vista;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panel2 extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JLabel espacios;
	
	
	
	public Panel2(){
		setLayout( new GridLayout(4,4) );
		TitledBorder border = BorderFactory.createTitledBorder(" ");
		
		espacios = new JLabel("                      ");
		add(espacios);
		
	}

}