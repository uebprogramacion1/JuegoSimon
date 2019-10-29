package vista;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

import controlador.Controlador;

public class InterfazGUI extends JFrame {
private PanelMuestra panelMuestra;
private PanelEntrada panelEntrada;
private PanelFinalizar panelFinalizar;
	private static final long serialVersionUID = 1L;
	public InterfazGUI(Controlador control) 
	{
		setSize(400,300);
		setResizable(false);
		setTitle("SIMON");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		panelMuestra = new PanelMuestra();
		add(panelMuestra,BorderLayout.NORTH);
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.CENTER);
		panelFinalizar = new PanelFinalizar();
		add(panelFinalizar,BorderLayout.SOUTH);
		panelEntrada.getBut1().addActionListener((ActionListener) control);
		panelEntrada.getBut2().addActionListener((ActionListener) control);
		panelEntrada.getBut3().addActionListener((ActionListener) control);
		panelEntrada.getBut4().addActionListener((ActionListener) control);
		panelFinalizar.getButTerminar().addActionListener((ActionListener) control);
	
	}
	public void mostrarInicio() {
		JOptionPane.showMessageDialog(null,"Ingrese los numero en el orden que se generan.","Indicaciones",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}
	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public PanelFinalizar getPanelFinalizar() {
		return panelFinalizar;
	}
	public void setPanelFinalizar(PanelFinalizar panelFinalizar) {
		this.panelFinalizar = panelFinalizar;
	}
	public PanelMuestra getPanelMuestra() {
		return panelMuestra;
	}
	public void setPanelMuestra(PanelMuestra panelMuestra) {
		this.panelMuestra = panelMuestra;
	}
	
	
	
}
