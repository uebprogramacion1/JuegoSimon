package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelColores extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton butVerde1;
	private JButton butRojo2;
	private JButton butAmarillo3;
	private JButton butAzul4;
	public static final String VERDE = "Verde";
	public static final String ROJO = "Rojo";
	public static final String AMARILLO = "Amarillo";
	public static final String AZUL = "Azul";

	
	public PanelColores() {
		
		setLayout(new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder("Simon");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		butVerde1 = new JButton ("1");
		butVerde1.setBackground(Color.GREEN);
		butVerde1.setActionCommand(VERDE);
		
		butRojo2 = new JButton ("2");
		butRojo2.setBackground(Color.RED);
		butRojo2.setActionCommand(ROJO);
		
		butAmarillo3 = new JButton ("3");
		butAmarillo3.setBackground(Color.YELLOW);
		butAmarillo3.setActionCommand(AMARILLO);
		
		butAzul4 = new JButton ("4");
		butAzul4.setBackground(Color.BLUE);
		butAzul4.setActionCommand(AZUL);
			
		
		add(butVerde1);
		add(butRojo2);
		add(butAmarillo3);
		add(butAzul4);
		
		
	}

	public JButton getButVerde1() {
		return butVerde1;
	}

	public void setButVerde1(JButton butVerde1) {
		this.butVerde1 = butVerde1;
	}

	public JButton getButRojo2() {
		return butRojo2;
	}

	public void setButRojo2(JButton butRojo2) {
		this.butRojo2 = butRojo2;
	}

	public JButton getButAmarillo3() {
		return butAmarillo3;
	}

	public void setButAmarillo3(JButton butAmarillo3) {
		this.butAmarillo3 = butAmarillo3;
	}

	public JButton getButAzul4() {
		return butAzul4;
	}

	public void setButAzul4(JButton butAzul4) {
		this.butAzul4 = butAzul4;
	}

	
}