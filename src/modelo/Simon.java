package modelo;

public class Simon {
	
	 
	
	int[] Num ;
	
	public Simon() {
		
		Num = new int[4];
	}
	public void crearNumero() {
		for(int i=0; i<Num.length;i++) {
		int numero = (int) (Math.random()*3)+1;
				Num[i]=numero;
		}
	}

		 public int comparar(int n1,int n2,int n3,int n4) {
			 int correctas =0;
	    	    
	    		if(n1==Num[0]) {
	    			correctas++;
	    		}	
	    		
	    		if(n2==Num[1]) {
	    			correctas++;
	    		}
	    		
	    		if(n3==Num[2]) {
	    			correctas++;
	    		}
	    		
	    		if(n4==Num[3]) {
	    			correctas++;
	    		}
	    		return correctas;
	    		}
		 public String darResultados(int n1,int n2,int n3,int n4) {
			 String resultado ="";
			 if(comparar(n1,n2,n3,n4)==4) {
				 resultado = "Secuencia Exitosa!";
			 }
			 else {
				 resultado="Fallaste!";
			 }
			 return resultado;
			
		 }
		public int[] getNum() {
			return Num;
		}
		public void setNum(int[] num) {
			Num = num;
		}
		 
	}

