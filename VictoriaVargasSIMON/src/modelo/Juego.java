package modelo;

import javax.swing.JOptionPane;

public class Juego {

	private int arreglo[];
	private int botones[];

	public Juego() {
		arreglo= new int[4];
		botones = new int[4];
	}

	//Comparar los numeros

	public boolean compararNumeros(int arreglo2[]) {

		boolean retorno = true;

		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i]!=arreglo2[i]) {

				retorno = false;
				break;
			}
		}

		return retorno;
	}
		

	public int[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(int[] arreglo) {
		this.arreglo = arreglo;
	}

	public int[] getBotones() {
		return botones;
	}

	public void setBotones(int[] botones) {
		this.botones = botones;
	}



}
