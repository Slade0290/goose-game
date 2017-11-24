
public class CaseArrivee extends Case {

	public CaseArrivee(Pion pion) {
		super(pion);
	}
	
	public boolean finDuJeu() {
		return estVide();
	}

}
