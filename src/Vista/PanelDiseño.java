package Vista;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDiseņo extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PanelDiseņo ()	{
		
	setLayout(new GridLayout(3, 2));
	JLabel LabelEspacio = new JLabel("                       ", JLabel.LEFT);
    add(LabelEspacio);   
     
	}
}