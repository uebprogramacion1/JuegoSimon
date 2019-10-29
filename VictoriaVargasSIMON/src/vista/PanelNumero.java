package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;

public class PanelNumero extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel numero;
	private JTextField txtUno;
	private JTextField txtDos;
	private JTextField txtTres;
	private JTextField txtCuatro;
	private JPanel mitad;

	public static final String UNO ="txtuno";
	public static final String DOS ="txtdos";
	public static final String TRES ="txtTres";
	public static final String CUATRO ="txtcuatro";


	public PanelNumero(Controlador c) {

		setLayout(null);
		setBackground(new Color(222,235,254));
		mitad = new JPanel();
		mitad.setBounds(50, 50, 470, 50);
		mitad.setLayout(new GridLayout(1,8));
		mitad.setBackground(new Color(222,235,254));

		numero= new JLabel("Número:");
		numero.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		numero.setBounds(10,20,100,100);

		txtUno = new JTextField();
		txtUno.setSize(30, 30);
		txtUno.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		txtDos = new JTextField();
		txtDos.setSize(30, 30);
		txtDos.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		txtTres = new JTextField();
		txtTres.setSize(30, 30);
		txtTres.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		txtCuatro = new JTextField();
		txtCuatro.setSize(30, 30);
		txtCuatro.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JLabel vacio1 = new JLabel("");
		JLabel vacio2 = new JLabel("");
		JLabel vacio3 = new JLabel("");
		JLabel vacio4 = new JLabel("");

		add(numero);
		mitad.add(vacio1);
		mitad.add(txtUno);
		mitad.add(vacio2);
		mitad.add(txtDos);
		mitad.add(vacio3);
		mitad.add(txtTres);
		mitad.add(vacio4);
		mitad.add(txtCuatro);

		add(mitad);
	}





	public JTextField getTxtUno() {
		return txtUno;
	}


	public void setTxtUno(JTextField txtUno) {
		this.txtUno = txtUno;
	}


	public JTextField getTxtDos() {
		return txtDos;
	}


	public void setTxtDos(JTextField txtDos) {
		this.txtDos = txtDos;
	}


	public JTextField getTxtTres() {
		return txtTres;
	}


	public void setTxtTres(JTextField txtTres) {
		this.txtTres = txtTres;
	}


	public JTextField getTxtCuatro() {
		return txtCuatro;
	}


	public void setTxtCuatro(JTextField txtCuatro) {
		this.txtCuatro = txtCuatro;
	}





	public JPanel getMitad() {
		return mitad;
	}





	public void setMitad(JPanel mitad) {
		this.mitad = mitad;
	}


}
