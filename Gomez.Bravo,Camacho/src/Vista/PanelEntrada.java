package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Modelo.Mundo;

public class PanelEntrada extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel colores;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField numero3;
	private JTextField numero4;
	private JLabel Lbvalor;
	private Mundo mn;
	private int[]vector;
	
	public PanelEntrada() {
		mn = new Mundo();
		
		vector=new int[4];
		//llenarvec();
		
		int alea1 =mn.getNum().getAlea1();
		int alea2 =mn.getNum().getAlea2();
		int aleja3= mn.getNum().getAlea3();
		int alea4 = mn.getNum().getAlea4();
		
		Color color1 =Ponercolor(alea1) ;
		Color color2 = Ponercolor(alea2);
		Color color3 = Ponercolor(aleja3);
		Color color4 = Ponercolor(alea4);
		
		setLayout( new GridLayout(1,5) );
		TitledBorder border = BorderFactory.createTitledBorder("juego simon");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		
		
		colores=new JLabel("colores");
		
		numero1=new JTextField();
		numero1.setText(Integer.toString(alea1));
		
		numero1.setForeground(Color.BLACK);
		numero1.setBackground(color1);
		
		numero2=new JTextField();
		numero2.setText(Integer.toString(alea2));
		
		numero2.setForeground(Color.BLACK);
		numero2.setBackground(color2);
		numero3=new JTextField();
		numero3.setText(Integer.toString(aleja3));
		numero3.setForeground(Color.BLACK);
		numero3.setBackground(color3);
		numero4=new JTextField();
		numero4.setText(Integer.toString(alea4));
		numero4.setForeground(Color.BLACK);
		numero4.setBackground(color4);
		add(colores);
		add(numero1);
		add(numero2);
		add(numero3);
		add(numero4);
		llenarvec();
		tiempo();
	}
	
	public Color Ponercolor(int alea) {
		Color colora = null;
		
		if(alea==1) {
			colora=Color.green;
		}
		if(alea==2) {
			colora=Color.RED;
		}
			
		if(alea==3) {
				colora=Color.YELLOW;
			}
		if(alea==4) {
				colora=Color.blue;
			}
			
		
		
		return colora;
		
	}
	
	public  int []  llenarvec() {
		
		vector[0]=Integer.parseInt( numero1.getText()); 
		vector[1]=Integer.parseInt( numero2.getText());;
		vector[2]=Integer.parseInt( numero3.getText());;
		vector[3]=Integer.parseInt( numero4.getText());;
		return vector;
	}
	 public  void tiempo() {
		 TimerTask timerTask = new TimerTask()
	     {
	         public void run() 
	         {
	        	 numero1.setBackground(Color.WHITE);
	        	 numero1.setForeground(Color.white);
	        	 numero2.setBackground(Color.WHITE);
	        	 numero2.setForeground(Color.white);
	        	 numero3.setBackground(Color.WHITE);
	        	 numero3.setForeground(Color.white);
	        	 numero4.setBackground(Color.WHITE);
	        	 numero4.setForeground(Color.white);
	             
	         }
	     };
	     

	     
	     Timer timer = new Timer();
	     
	     timer.scheduleAtFixedRate(timerTask, 3000, 3000);
	 }

	public JLabel getColores() {
		return colores;
	}

	public void setColores(JLabel colores) {
		this.colores = colores;
	}

	public JTextField getNumero1() {
		return numero1;
	}

	public void setNumero1(JTextField numero1) {
		this.numero1 = numero1;
	}

	public JTextField getNumero2() {
		return numero2;
	}

	public void setNumero2(JTextField numero2) {
		this.numero2 = numero2;
	}

	public JTextField getNumero3() {
		return numero3;
	}

	public void setNumero3(JTextField numero3) {
		this.numero3 = numero3;
	}

	public JTextField getNumero4() {
		return numero4;
	}

	public void setNumero4(JTextField numero4) {
		this.numero4 = numero4;
	}

	public JLabel getLbvalor() {
		return Lbvalor;
	}

	public void setLbvalor(JLabel lbvalor) {
		Lbvalor = lbvalor;
	}

	public Mundo getMn() {
		return mn;
	}

	public void setMn(Mundo mn) {
		this.mn = mn;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	
	

	
	

	



}
