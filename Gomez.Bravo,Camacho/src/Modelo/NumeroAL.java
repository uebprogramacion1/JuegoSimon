package Modelo;

public class NumeroAL {
	
	
	 private int alea1;
	 private int alea2;
	 private int alea3;
	 private int alea4;
	 //private int[]numero;
	
	

	public NumeroAL() {
		
		//numero=new int [4];
		alea1=(int)(Math.random()*4)+1;
		alea2=(int)(Math.random()*4)+1;
		alea3=(int)(Math.random()*4)+1;
		alea4=(int) (Math.random()*4)+1;
		
	}
	public int getAlea1() {
		return alea1;
	}
	public void setAlea1(int alea1) {
		this.alea1 = alea1;
	}
	public int getAlea2() {
		return alea2;
	}
	public void setAlea2(int alea2) {
		this.alea2 = alea2;
	}
	public int getAlea3() {
		return alea3;
	}
	public void setAlea3(int alea3) {
		this.alea3 = alea3;
	}
	public int getAlea4() {
		return alea4;
	}
	public void setAlea4(int alea4) {
		this.alea4 = alea4;
	}
	
	
	
	
	
	
	
}

