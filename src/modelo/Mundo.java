package modelo;

public class Mundo {
	private Simon sim;
	public Mundo() {
		sim = new Simon();
	}
	public Simon getSim() {
		return sim;
	}
	public void setSim(Simon sim) {
		this.sim = sim;
	}

}
