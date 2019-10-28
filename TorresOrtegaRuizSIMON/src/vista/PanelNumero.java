package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelNumero extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel numero;
	private JTextArea txtnumero1,txtnumero2,txtnumero3,txtnumero4;
	
	public PanelNumero() {
		setLayout( new GridLayout(1,6) );
		TitledBorder border = BorderFactory.createTitledBorder("Numero a adivinar");
		border.setTitleColor(Color.white);
		setBackground(Color.black);
		setBorder( border );
		numero = new JLabel("NUMERO");
		numero.setForeground(Color.white);
		txtnumero1 = new JTextArea("");
		txtnumero1.setPreferredSize(new Dimension(40,40));
		txtnumero2 = new JTextArea("");
		txtnumero3 = new JTextArea("");
		txtnumero4 = new JTextArea("");
		add(numero);
		add(new JLabel());
		add(txtnumero1);
		txtnumero1.setBackground(Color.BLACK);
		add(new JLabel());
		add(txtnumero2);
		txtnumero2.setBackground(Color.BLACK);
		add(new JLabel());
		add(txtnumero3);
		txtnumero3.setBackground(Color.BLACK);
		add(new JLabel());
		add(txtnumero4);
		txtnumero4.setBackground(Color.BLACK);

	}
	public JLabel getNumero() {
		return numero;
	}

	public void setNumero(JLabel numero) {
		this.numero = numero;
	}

	public JTextArea getTxtnumero1() {
		return txtnumero1;
	}

	public void setTxtnumero1(JTextArea txtnumero1) {
		this.txtnumero1 = txtnumero1;
	}

	public JTextArea getTxtnumero2() {
		return txtnumero2;
	}

	public void setTxtnumero2(JTextArea txtnumero2) {
		this.txtnumero2 = txtnumero2;
	}

	public JTextArea getTxtnumero3() {
		return txtnumero3;
	}

	public void setTxtnumero3(JTextArea txtnumero3) {
		this.txtnumero3 = txtnumero3;
	}

	public JTextArea getTxtnumero4() {
		return txtnumero4;
	}

	public void setTxtnumero4(JTextArea txtnumero4) {
		this.txtnumero4 = txtnumero4;
	}

}
