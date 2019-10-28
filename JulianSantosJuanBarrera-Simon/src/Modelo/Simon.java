package Modelo;

import java.util.Random;

public class Simon {
	public int x = 0;
	public int i = 0;
	public int[][] matriz = new int[4][2];
	 
	Random numeroAleatorio = new Random();
	
	public int NumerosSimon() {
	    matriz[i][0] = numeroAleatorio.nextInt(4)+1;
	    i++;
		return matriz[i-1][0];
	}
	
	public int ValidarBotones(int y) {
		matriz[x][1] = y;
		x++;
		return y;
	}
	
	public boolean ValidarJuego() {
		if((matriz[0][0] == matriz[0][1]) &&  (matriz[1][0] == matriz[1][1]) &&  (matriz[2][0] == matriz [2][1]) && (matriz[3][0] == matriz[3][1]))
		{
			return true;
		}
		else {
			return false;
		}
	}
}