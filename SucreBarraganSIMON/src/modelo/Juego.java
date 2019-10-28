package modelo;

import javax.swing.JOptionPane;

public class Juego {
	private int[] juegoS; // numero aleatorios generados
	private int[] datosUsuario;
	int cantidad;
	String mensaje;

	public Juego() {
		juegoS = new int[4];
		datosUsuario = new int[4];
		cantidad = 0;

		juegoS[0] = (int) (Math.random() * 4 + 1);
		juegoS[1] = (int) (Math.random() * 4 + 1);
		juegoS[2] = (int) (Math.random() * 4 + 1);
		juegoS[3] = (int) (Math.random() * 4 + 1);

	}

	public void datosUsuario(int datos) {
		datosUsuario[cantidad] = datos;

		cantidad++;
	}

	public boolean compararDatos() {
		boolean resultado = false;
		if ((juegoS[0] == datosUsuario[0]) && (juegoS[1] == datosUsuario[1]) && (juegoS[2] == datosUsuario[2])
				&& (juegoS[3] == datosUsuario[3])) {			
			resultado = true;

			juegoS[0] = (int) (Math.random() * 4 + 1);
			juegoS[1] = (int) (Math.random() * 4 + 1);
			juegoS[2] = (int) (Math.random() * 4 + 1);
			juegoS[3] = (int) (Math.random() * 4 + 1);

		} else {
			resultado = false;
			juegoS[0] = (int) (Math.random() * 4 + 1);
			juegoS[1] = (int) (Math.random() * 4 + 1);
			juegoS[2] = (int) (Math.random() * 4 + 1);
			juegoS[3] = (int) (Math.random() * 4 + 1);

		}
		return resultado;
	}

	public int[] getJuegoS() {
		return juegoS;
	}

	public void setJuegoS(int[] juegoS) {
		this.juegoS = juegoS;
	}

	public int[] getDatosUsuario() {
		return datosUsuario;
	}

	public void setDatosUsuario(int[] datosUsuario) {
		this.datosUsuario = datosUsuario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
