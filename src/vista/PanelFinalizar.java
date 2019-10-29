package vista;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PanelFinalizar extends JPanel{
	private static final long serialVersionUID =1L;
	private JButton butTerminar;
    public static final String TERMINAR ="TERMINAR";
    
    public PanelFinalizar() {
    setLayout(new GridLayout(3,1));
	butTerminar = new JButton("Finalizar");
	butTerminar.setActionCommand(TERMINAR);
	
	add(new JLabel(""));
	add(butTerminar);
	add(new JLabel(""));
	
    }

	public JButton getButTerminar() {
		return butTerminar;
	}

	public void setButTerminar(JButton butTerminar) {
		this.butTerminar = butTerminar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getTerminar() {
		return TERMINAR;
	}
	
    
    }

