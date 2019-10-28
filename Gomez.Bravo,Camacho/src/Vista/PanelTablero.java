package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelTablero extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton num1;
	private JButton num2;
	private JButton num3;
	private JButton num4;
	
	public static final String numero1 = "num1";
	public static final String numero2 = "num2";
	public static final String numero3= "num3";
	public static final String numero4 = "num4";
	
	public PanelTablero() {
		setLayout( new GridLayout(2,2) );
		
		num1 = new JButton("1");
		num1.setBackground(Color.GREEN);
		num1.setActionCommand(numero1);
		num2 = new JButton("2");
		num2.setBackground(Color.RED);
		num2.setActionCommand(numero2);
		
		num3 = new JButton("3");
		num3.setBackground(Color.YELLOW);
		num3.setActionCommand(numero3);

		num4 = new JButton("4");
		num4.setBackground(Color.blue);
		num4.setActionCommand(numero4);
		
		add(num1);
		add(num2);
		add(num3);
		add(num4);
	
	}

	public JButton getNum1() {
		return num1;
	}

	public void setNum1(JButton num1) {
		this.num1 = num1;
	}

	public JButton getNum2() {
		return num2;
	}

	public void setNum2(JButton num2) {
		this.num2 = num2;
	}

	public JButton getNum3() {
		return num3;
	}

	public void setNum3(JButton num3) {
		this.num3 = num3;
	}

	public JButton getNum4() {
		return num4;
	}

	public void setNum4(JButton num4) {
		this.num4 = num4;
	}
	

	

	

	
	
	

}

	
	
	
	
	


