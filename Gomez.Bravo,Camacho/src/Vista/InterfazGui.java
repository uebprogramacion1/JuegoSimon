package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;

import Controlador.Controlador;

public class InterfazGui extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelTablero paneltablero;
	private PanelEntrada panelEntrada;
	private PanelBoton panelboton;
	private Panel1 panel1;
	private Panel2 panel2;
	
	public InterfazGui(Controlador control) {
		setSize(800,700); 
		setResizable(false); 
		setTitle("juego simon "); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		
		setLayout( new BorderLayout() );
		
		panelEntrada=new PanelEntrada();
		panelEntrada.setBackground(Color.pink);
		add(panelEntrada,BorderLayout.NORTH);
		
		paneltablero=new PanelTablero();
		add(paneltablero,BorderLayout.CENTER);
		
		panel1=new Panel1();
		panel1.setBackground(Color.BLACK);
		add(panel1,BorderLayout.EAST);
		
		panel2=new Panel2();
		panel2.setBackground(Color.BLACK);
		add(panel2,BorderLayout.WEST);
		
		
		panelboton=new PanelBoton();
		panelboton.setBackground(Color.pink);
		add(panelboton,BorderLayout.SOUTH);
		
		paneltablero.getNum1().addActionListener(control);
		paneltablero.getNum2().addActionListener(control);
		paneltablero.getNum3().addActionListener(control);
		paneltablero.getNum4().addActionListener(control);
		panelboton.getTerminar().addActionListener(control);
		
		
	}

	public PanelTablero getPaneltablero() {
		return paneltablero;
	}

	public void setPaneltablero(PanelTablero paneltablero) {
		this.paneltablero = paneltablero;
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelBoton getPanelboton() {
		return panelboton;
	}

	public void setPanelboton(PanelBoton panelboton) {
		this.panelboton = panelboton;
	}

	public Panel1 getPanel1() {
		return panel1;
	}

	public void setPanel1(Panel1 panel1) {
		this.panel1 = panel1;
	}

	public Panel2 getPanel2() {
		return panel2;
	}

	public void setPanel2(Panel2 panel2) {
		this.panel2 = panel2;
	}
	
	
	
		
		
		
		
	}
