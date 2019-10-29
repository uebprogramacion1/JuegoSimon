package Modelo;

public class Numero {

	private int[] Numero;
	private int primero;
	private int segundo;
	private int tercero;
	private int cuarto;
	private String num;
	
	public Numero() {
		this.Numero = new int[4];
		this.primero = 1;
		this.segundo = 2;
		this.tercero = 3;
		this.cuarto = 4;
		this.num = "";
	}
	
	public void crearArreglo() {
		Numero[0] = (int) (Math.random() * 4 + 1);
		Numero[1] = (int) (Math.random() * 4 + 1);
		Numero[2] = (int) (Math.random() * 4 + 1);
		Numero[3] = (int) (Math.random() * 4 + 1);
	}
	
	public String trasformarArreglo() {
		int primero=Numero[0], segundo=Numero[1], tercero=Numero[2], cuarto=Numero[3];
		return "" + primero + segundo + tercero + cuarto;
	}
	
	public boolean compararArreglo() {
		String[] arreglo = num.split("");
		boolean mensaje;
		if (Numero[0]== Integer.parseInt(arreglo[0]) && Numero[1]== Integer.parseInt(arreglo[1]) && Numero[2]==Integer.parseInt(arreglo[2]) && Numero[3]==Integer.parseInt(arreglo[3])){
			mensaje = true;
		} else 
			mensaje = false;
		return mensaje;
	}

	public int[] getNumero() {
		return Numero;
	}

	public void setNumero(int[] numero) {
		Numero = numero;
	}

	public int getPrimero() {
		return primero;
	}

	public void setPrimero(int primero) {
		this.primero = primero;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public int getTercero() {
		return tercero;
	}

	public void setTercero(int tercero) {
		this.tercero = tercero;
	}

	public int getCuarto() {
		return cuarto;
	}

	public void setCuarto(int cuarto) {
		this.cuarto = cuarto;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
}