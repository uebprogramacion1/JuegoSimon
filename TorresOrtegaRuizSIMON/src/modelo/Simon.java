package modelo;

public class Simon {
	private int[] numeroAL;
	private int[] numeroSecuencia;
	private int posicion;
	private String nombre;
	private int puntuacion;
	private boolean verificar;
	
	public Simon() {
		numeroAL = new int[4];
		numeroSecuencia = new int [4];
		posicion=0;
		puntuacion=0;
	}
	
	public int subirPuntuacion() {
		if(verificar) {
			puntuacion= puntuacion+100;
		}else {
			puntuacion=puntuacion-50;
		}
		return puntuacion;
	}
	public void asignarNumeros() {
		for (int i = 0; i < numeroAL.length; i++) {
			numeroAL[i]= (int)((Math.random()*4)+1);
		}
	}
	public void escribirNumeros(int aux) {
		try {
			numeroSecuencia[posicion]= aux;
			posicion++;
		} catch (ArrayIndexOutOfBoundsException e) {
		}
	}
	public String compararNumeros(){
		String aviso = "";
		if(numeroAL[0]==numeroSecuencia[0]&&numeroAL[1]==numeroSecuencia[1]&&numeroAL[2]==numeroSecuencia[2]&&numeroAL[3]==numeroSecuencia[3]) {
			aviso= "HA COMPLETADO CORRECTAMENTE LA SECUENCIA";
			verificar=true;
		}else if(numeroAL[0]!=numeroSecuencia[0]||numeroAL[1]!=numeroSecuencia[1]||numeroAL[2]!=numeroSecuencia[2]||numeroAL[3]!=numeroSecuencia[3]) {
			aviso ="NO HA ADIVINADO CORRECTAMENTE LA SECUENCIA";
			verificar=false;
		}
	
	return aviso;
	}
	
	public int[] getNumeroAL() {
		return numeroAL;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public void setNumeroAL(int[] numeroAL) {
		this.numeroAL = numeroAL;
	}
	public int[] getNumeroSecuencia() {
		return numeroSecuencia;
	}
	public void setNumeroSecuencia(int[] numeroSecuencia) {
		this.numeroSecuencia = numeroSecuencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public boolean isVerificar() {
		return verificar;
	}
	public void setVerificar(boolean verificar) {
		this.verificar = verificar;
	}
	

}
