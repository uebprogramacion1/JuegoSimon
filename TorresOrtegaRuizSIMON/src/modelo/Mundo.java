package modelo;

public class Mundo {
	private Simon si;
	
	public Mundo() {
		si = new Simon();
	}

	public Simon getSi() {
		return si;
	}

	public void setSi(Simon si) {
		this.si = si;
	}

}
