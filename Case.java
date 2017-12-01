
public class Case {

	private Pion pion;
	
	public Case(Pion pion) {
		this.pion = pion;
	}
	
	public Pion getPion() {
		return pion;
	}
	
	public boolean estVide() {
		return (pion == null);
	}
	
	public void remplirCase(Pion pion) {
		this.pion = pion;
	}
	
	public void enleverPion() {
		pion = null;
	}
	
}

}
