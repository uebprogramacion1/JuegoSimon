package Vista;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDise�o extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PanelDise�o ()	{
		
	setLayout(new GridLayout(3, 2));
	JLabel LabelEspacio = new JLabel("                       ", JLabel.LEFT);
    add(LabelEspacio);   
     
	}
}