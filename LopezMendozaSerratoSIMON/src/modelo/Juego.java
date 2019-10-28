package modelo;

public class Juego {
	
	private int[] nRepetir = new int[4]; 
	
	public int[] darNumRepetir(){
		for (int i = 0; i < nRepetir.length; i++) {
			nRepetir[i] = (int) (Math.random()*4 + 1);
		}
		return nRepetir;
	}
	
	public boolean verficarPatrones(int[] patronUsuario) {
		boolean concordancia = false;
		int n=0;
		for (int i = 0; i < 4; i++) {
			if (nRepetir[i]==patronUsuario[i]) {
				n++;
			}
		}
		if(n == 4)
		{
			concordancia= true;
		}
		return concordancia;
	}
}
