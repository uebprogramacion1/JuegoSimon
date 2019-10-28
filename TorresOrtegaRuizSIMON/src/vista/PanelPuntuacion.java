package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPuntuacion extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel texto;
	private JLabel puntuacion,nombre,texto2;
public PanelPuntuacion() {
	setLayout( new GridLayout(6,1) );
	TitledBorder border = BorderFactory.createTitledBorder("PUNTUACION");
	border.setTitleColor(Color.white);
	setBackground(Color.black);
	setBorder( border );
	texto = new JLabel("SU PUNTUACION ES");
	texto.setForeground(Color.WHITE);
	puntuacion = new JLabel("0");
	puntuacion.setForeground(Color.WHITE);
	nombre = new JLabel();
	nombre.setForeground(Color.WHITE);
	texto2 = new JLabel("NOMBRE JUGADOR");
	texto2.setForeground(Color.WHITE);
	add(texto2);
	add(nombre);
	add(new JLabel());
	add(texto);
	add(puntuacion);
	add(new JLabel());
	
}

public JLabel getNombre() {
	return nombre;
}

public void setNombre(JLabel nombre) {
	this.nombre = nombre;
}

public JLabel getTexto2() {
	return texto2;
}

public void setTexto2(JLabel texto2) {
	this.texto2 = texto2;
}

public JLabel getTexto() {
	return texto;
}
public void setTexto(JLabel texto) {
	this.texto = texto;
}
public JLabel getPuntuacion() {
	return puntuacion;
}
public void setPuntuacion(JLabel puntuacion) {
	this.puntuacion = puntuacion;
}

}
