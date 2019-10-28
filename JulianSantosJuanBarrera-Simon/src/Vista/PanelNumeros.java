package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class PanelNumeros extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private	JTextArea txtNumero1;
	private	JTextArea txtNumero2;
	private	JTextArea txtNumero3;
	private	JTextArea txtNumero4;

	
	public PanelNumeros() {
		
		labEntrada = new JLabel ("Numeros");
		txtNumero1 = new JTextArea("");
		txtNumero1.setBounds(50, 50, 100, 100);
		txtNumero2 = new JTextArea("");
		txtNumero2.setBounds(50, 50, 100, 100);
		txtNumero3 = new JTextArea("");
		txtNumero3.setBounds(50, 50, 100, 100);
		txtNumero4 = new JTextArea("");
		txtNumero4.setBounds(50, 50, 100, 100);
	

		
		add(labEntrada);
		add(new JLabel (""));
		add(txtNumero1);
		add(new JLabel (""));
		add(txtNumero2);
		add(new JLabel (""));
		add(txtNumero3);
		add(new JLabel (""));
		add(txtNumero4);
		
	}

	public JTextArea getTxtNumero1() {
		return txtNumero1;
	}

	public void setTxtNumero1(JTextArea txtNumero1) {
		this.txtNumero1 = txtNumero1;
	}

	public JTextArea getTxtNumero2() {
		return txtNumero2;
	}

	public void setTxtNumero2(JTextArea txtNumero2) {
		this.txtNumero2 = txtNumero2;
	}

	public JTextArea getTxtNumero3() {
		return txtNumero3;
	}

	public void setTxtNumero3(JTextArea txtNumero3) {
		this.txtNumero3 = txtNumero3;
	}

	public JTextArea getTxtNumero4() {
		return txtNumero4;
	}

	public void setTxtNumero4(JTextArea txtNumero4) {
		this.txtNumero4 = txtNumero4;
	}

}
