package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelNumero extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblnumero;
	private JLabel lblnumeros;
	
	public PanelNumero() {
		setLayout( new GridLayout(1,2) );//se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Numero");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		lblnumero = new JLabel("NUMERO A ADIVINAR:");
		lblnumeros = new JLabel("---");
		add(lblnumero);
		add(lblnumeros);
		
	}

	public JLabel getLblnumero() {
		return lblnumero;
	}

	public void setLblnumero(JLabel lblnumero) {
		this.lblnumero = lblnumero;
	}

	public JLabel getLblnumeros() {
		return lblnumeros;
	}

	public void setLblnumeros(JLabel lblnumeros) {
		this.lblnumeros = lblnumeros;
	}
	

}
