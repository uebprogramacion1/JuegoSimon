package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.Controlador;

public class InterfazGUI extends JFrame {

	PanelMatriz panelM;
	PanelSecuencia panelS;

	public InterfazGUI(Controlador control) {
		setSize(700, 500);
		setResizable(true);
		setTitle("Simon");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		panelM = new PanelMatriz();
		panelS = new PanelSecuencia();

		add(panelS, BorderLayout.NORTH);
		add(panelM, BorderLayout.CENTER);

		panelM.getUno().addActionListener(control);
		panelM.getDos().addActionListener(control);
		panelM.getTres().addActionListener(control);
		panelM.getCuatro().addActionListener(control);
	}

	public PanelMatriz getPanelM() {
		return panelM;
	}

	public void setPanelM(PanelMatriz panelM) {
		this.panelM = panelM;
	}

	public PanelSecuencia getPanelS() {
		return panelS;
	}

	public void setPanelS(PanelSecuencia panelS) {
		this.panelS = panelS;
	}

}
