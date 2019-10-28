package Vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {

	private static final long serialVersionUID = 1L;

	public static final String BOTON1 = "1";
	public static final String BOTON2 = "2";
	public static final String BOTON3 = "3";
	public static final String BOTON4 = "4";
	
	private JButton butNumero1;
	private JButton butNumero2;
	private JButton butNumero3;
	private JButton butNumero4;
	private JLabel labNumerob;
	private JLabel labNumeroa;
	

    Font fuente = new Font("Arial", 5, 75);

	public PanelBotones() {
		
		setLayout(new GridLayout(2, 2));
		
		butNumero1 = new JButton("1");
		butNumero1.setFont(fuente);
		butNumero1.setBackground(new Color(196, 61, 61));
		butNumero1.setActionCommand(BOTON1);
		butNumero1.setFocusable(false);

		butNumero2 = new JButton("2");
		butNumero2.setFont(fuente);
		butNumero2.setBackground(new Color(61, 111, 196));
		butNumero2.setActionCommand(BOTON2);
		butNumero2.setFocusable(false);

		butNumero3 = new JButton("3");
		butNumero3.setFont(fuente);
		butNumero3.setBackground(new Color(224, 215, 36));
		butNumero3.setActionCommand(BOTON3);
		butNumero3.setFocusable(false);

		butNumero4 = new JButton("4");
		butNumero4.setFont(fuente);
		butNumero4.setBackground(new Color(44, 212, 50));
		butNumero4.setActionCommand(BOTON4);
		butNumero4.setFocusable(false);
		
		add(butNumero1);
		add(butNumero2);
		add(butNumero3);
		add(butNumero4);
		
		
	}

	public JButton getButNumero1() {
		return butNumero1;
	}

	public void setButNumero1(JButton butNumero1) {
		this.butNumero1 = butNumero1;
	}

	public JButton getButNumero2() {
		return butNumero2;
	}

	public void setButNumero2(JButton butNumero2) {
		this.butNumero2 = butNumero2;
	}

	public JButton getButNumero3() {
		return butNumero3;
	}

	public void setButNumero3(JButton butNumero3) {
		this.butNumero3 = butNumero3;
	}

	public JButton getButNumero4() {
		return butNumero4;
	}

	public void setButNumero4(JButton butNumero4) {
		this.butNumero4 = butNumero4;
	}

}
