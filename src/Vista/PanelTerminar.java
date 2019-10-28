package Vista;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTerminar extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton butTerminar;
	public static final String TERMINAR = "Terminar";

	public PanelTerminar() {
		butTerminar = new JButton("Terminar");
		butTerminar.setActionCommand(TERMINAR);
		butTerminar.setFocusable(false);
		add(butTerminar);
	
	}

	public JButton getButEscribir() {
		return butTerminar;
	}

	public void setButEscribir(JButton butEscribir) {
		this.butTerminar = butEscribir;
	}

}
