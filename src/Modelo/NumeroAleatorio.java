package Modelo;

public class NumeroAleatorio {
	public  int[] campoNumeros = new int[4];
	
	public int[] NumeroAleatorios(){
		
	campoNumeros[0] = (int) Math.floor(Math.random() * (4) + 1);
	campoNumeros[1] = (int) Math.floor(Math.random() * (4) + 1);
    campoNumeros[2] = (int) Math.floor(Math.random() * (4) + 1);
    campoNumeros[3] = (int) Math.floor(Math.random() * (4) + 1);

	return campoNumeros;
	
	}
}
