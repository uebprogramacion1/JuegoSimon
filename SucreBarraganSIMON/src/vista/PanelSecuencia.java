package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelSecuencia extends JPanel {

	private JLabel seccuencia;
	private JTextArea numeroUno, numeroDos, numeroTres, numeroCuatro;

	public PanelSecuencia() {
		setLayout(new GridLayout(1, 6));
		TitledBorder border = BorderFactory.createTitledBorder("Color a Adivinar");
		border.setTitleColor(Color.WHITE);
		setBackground(Color.GRAY);
		setBorder(border);

		seccuencia = new JLabel("Secuencia: ");
		seccuencia.setForeground(Color.WHITE);
		numeroUno = new JTextArea("");
		numeroUno.setPreferredSize(new Dimension(40, 40));
		numeroDos = new JTextArea("");
		numeroTres = new JTextArea("");
		numeroCuatro = new JTextArea("");
		add(seccuencia);

		add(new JLabel());
		add(numeroUno);
		numeroUno.setBackground(Color.GRAY);

		add(new JLabel());
		add(numeroDos);
		numeroDos.setBackground(Color.GRAY);

		add(new JLabel());
		add(numeroTres);
		numeroTres.setBackground(Color.GRAY);

		add(new JLabel());
		add(numeroCuatro);
		numeroCuatro.setBackground(Color.GRAY);

	}

	public void actualizarJtextArea() {

		numeroUno = new JTextArea("");
		numeroUno.setBackground(Color.RED);

		numeroDos = new JTextArea("");
		numeroDos.setBackground(Color.GREEN);

		numeroTres = new JTextArea("");
		numeroTres.setBackground(Color.YELLOW);

		numeroCuatro = new JTextArea("");
		numeroCuatro.setBackground(Color.BLUE);
	}

	public JLabel getSeccuencia() {
		return seccuencia;
	}

	public void setSeccuencia(JLabel seccuencia) {
		this.seccuencia = seccuencia;
	}

	public JTextArea getNumeroUno() {
		return numeroUno;
	}

	public void setNumeroUno(JTextArea numeroUno) {
		this.numeroUno = numeroUno;
	}

	public JTextArea getNumeroDos() {
		return numeroDos;
	}

	public void setNumeroDos(JTextArea numeroDos) {
		this.numeroDos = numeroDos;
	}

	public JTextArea getNumeroTres() {
		return numeroTres;
	}

	public void setNumeroTres(JTextArea numeroTres) {
		this.numeroTres = numeroTres;
	}

	public JTextArea getNumeroCuatro() {
		return numeroCuatro;
	}

	public void setNumeroCuatro(JTextArea numeroCuatro) {
		this.numeroCuatro = numeroCuatro;
	}

}