package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class PanelEntrada extends JPanel  {
	
    Border border = LineBorder.createGrayLineBorder();

	private static final long serialVersionUID = 1L;
	private JLabel labNumero;
	private  int[] campoNumeros = new int[4];
	private int[] numerosAleatorios;
	
	private  int numeroAleatorio1 = (int) Math.floor(Math.random() * (4) + 1);
	private  int numeroAleatorio2 = (int) Math.floor(Math.random() * (4) + 1);
	private  int numeroAleatorio3 = (int) Math.floor(Math.random() * (4) + 1);
	private  int numeroAleatorio4 = (int) Math.floor(Math.random() * (4) + 1);
	
	private JLabel labEspacio;
	private JLabel labEntrada;
	private JLabel txtNumero01;
	private JLabel txtNumero02;
	private JLabel txtNumero03;
	private JLabel txtNumero04;
	private JLabel l1;

	public PanelEntrada() {
		
		setLayout(new GridLayout(1, 3));

		labNumero = new JLabel("Número: ");
		labEspacio = new JLabel(" ");
	
		txtNumero01 = new JLabel(String.valueOf(numeroAleatorio1));
		txtNumero02 = new JLabel(String.valueOf(numeroAleatorio2));
		txtNumero03 = new JLabel(String.valueOf(numeroAleatorio3));
		txtNumero04 = new JLabel(String.valueOf(numeroAleatorio4));
		
		
		add(labNumero);
		add(new JLabel(""));
		
		txtNumero01.setHorizontalAlignment(JLabel.CENTER);
		txtNumero01.setFont(new Font("Verdana", Font.PLAIN, 16));
	    txtNumero01.setBorder(border);
		add(txtNumero01);
		
		txtNumero02.setHorizontalAlignment(JLabel.CENTER);
		txtNumero02.setFont(new Font("Verdana", Font.PLAIN, 16));
	    txtNumero02.setBorder(border);
		add(new JLabel(""));
		add(txtNumero02);
		
		txtNumero03.setHorizontalAlignment(JLabel.CENTER);
		txtNumero03.setFont(new Font("Verdana", Font.PLAIN, 16));
	    txtNumero03.setBorder(border);
		add(new JLabel(""));
		add(txtNumero03);
		
		txtNumero04.setHorizontalAlignment(JLabel.CENTER);
		txtNumero04.setFont(new Font("Verdana", Font.PLAIN, 16));
	    txtNumero04.setBorder(border);
	    add(new JLabel(""));
		add(txtNumero04);
		
		add(new JLabel(""));
		add(new JLabel(""));
		
		
		campoNumeros[0] = numeroAleatorio1;
		campoNumeros[1] = numeroAleatorio2;
		campoNumeros[2] = numeroAleatorio3;
		campoNumeros[3] = numeroAleatorio4;
    
	}
	
	public int getNumeroAleatorio1() {
		return numeroAleatorio1;
	}

	public void setNumeroAleatorio1(int numeroAleatorio1) {
		this.numeroAleatorio1 = numeroAleatorio1;
	}

	public int getNumeroAleatorio2() {
		return numeroAleatorio2;
	}

	public void setNumeroAleatorio2(int numeroAleatorio2) {
		this.numeroAleatorio2 = numeroAleatorio2;
	}

	public int getNumeroAleatorio3() {
		return numeroAleatorio3;
	}

	public void setNumeroAleatorio3(int numeroAleatorio3) {
		this.numeroAleatorio3 = numeroAleatorio3;
	}

	public int getNumeroAleatorio4() {
		return numeroAleatorio4;
	}

	public void setNumeroAleatorio4(int numeroAleatorio4) {
		this.numeroAleatorio4 = numeroAleatorio4;
	}

	public JLabel getTxtNumero01() {
		return txtNumero01;
	}

	public void setTxtNumero01(JLabel txtNumero01) {
		this.txtNumero01 = txtNumero01;
	}

	public JLabel getTxtNumero02() {
		return txtNumero02;
	}

	public void setTxtNumero02(JLabel txtNumero02) {
		this.txtNumero02 = txtNumero02;
	}

	public JLabel getTxtNumero03() {
		return txtNumero03;
	}

	public void setTxtNumero03(JLabel txtNumero03) {
		this.txtNumero03 = txtNumero03;
	}

	public JLabel getTxtNumero04() {
		return txtNumero04;
	}

	public void setTxtNumero04(JLabel txtNumero04) {
		this.txtNumero04 = txtNumero04;
	}
	

}
